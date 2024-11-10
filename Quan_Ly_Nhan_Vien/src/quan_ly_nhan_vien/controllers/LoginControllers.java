package quan_ly_nhan_vien.controllers;

import quan_ly_nhan_vien.dao.LoginDAO;
import quan_ly_nhan_vien.models.LoginModels;
import quan_ly_nhan_vien.views.TrangChinh;
import quan_ly_nhan_vien.views.EmployeeHomePage;
import quan_ly_nhan_vien.views.LoginViews;

public class LoginControllers {

    private final LoginModels loginModels;
    private final LoginViews loginViews;
    private final LoginDAO loginDAO;

    public LoginControllers(LoginViews loginViews) {
        this.loginViews = loginViews;
        this.loginModels = new LoginModels("", ""); // Khởi tạo với tham số trống
        this.loginDAO = new LoginDAO();
    }

    /**
     * Phương thức xử lý đăng nhập với username hoặc email.
     * 
     * @param input    Username hoặc Email
     * @param password Mật khẩu
     */
    public void login(String input, String password) {
        // Kiểm tra nếu input có định dạng email bằng regex đơn giản
        boolean isEmail = input.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        // Gọi phương thức tương ứng để đăng nhập dựa trên loại đầu vào
        if (isEmail) {
            loginWithEmail(input, password);
        } else {
            loginWithUsername(input, password);
        }
    }

    /**
     * Đăng nhập bằng username.
     */
    public void loginWithUsername(String username, String password) {
        loginModels.setUsername(username);
        loginModels.setHashedPassword(password);

        int loginResult = loginDAO.checkLoginByUsername(loginModels);
        handleLoginResult(loginResult, username, password);
    }

    /**
     * Đăng nhập bằng email.
     */
    public void loginWithEmail(String email, String password) {
        loginModels.setUsername(email); // Lưu email vào model
        loginModels.setHashedPassword(password);

        int loginResult = loginDAO.checkLoginByEmail(loginModels);
        handleLoginResult(loginResult, email, password);
    }

    /**
     * Xử lý kết quả đăng nhập và chuyển hướng.
     */
    private void handleLoginResult(int loginResult, String input, String password) {
        switch (loginResult) {
            case LoginDAO.LOGIN_SUCCESS_ADMIN:
                TrangChinh adminPage = new TrangChinh();
                adminPage.setVisible(true);
                loginViews.dispose();
                break;

            case LoginDAO.LOGIN_SUCCESS_EMPLOYEE:
                EmployeeHomePage employeePage = new EmployeeHomePage(input, password);
                employeePage.setVisible(true);
                loginViews.dispose();
                break;

            case LoginDAO.ACCOUNT_NOT_FOUND:
                loginViews.showMessage("Tài khoản không tồn tại trong hệ thống!");
                break;

            case LoginDAO.WRONG_PASSWORD:
                loginViews.showMessage("Mật khẩu không chính xác!");
                break;

            case LoginDAO.DATABASE_ERROR:
                loginViews.showMessage("Lỗi kết nối đến cơ sở dữ liệu!");
                break;

            default:
                loginViews.showMessage("Đã xảy ra lỗi không xác định! (Mã lỗi: " + loginResult + ")");
                break;
        }
    }
}
