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

    // Phương thức xử lý đăng nhập
    public void login(String username, String password) {
        // Cập nhật thông tin tài khoản từ View vào Model
        loginModels.setUsername(username);
        loginModels.setHashedPassword(password);  // Gọi phương thức setter đã mã hóa mật khẩu

        // Kiểm tra đăng nhập thông qua DAO
        int loginResult = loginDAO.checkLogin(loginModels);

        // Xử lý kết quả đăng nhập và chuyển hướng
        switch (loginResult) {
            case LoginDAO.LOGIN_SUCCESS_ADMIN:
                // Đăng nhập thành công với quyền Admin
                TrangChinh adminPage = new TrangChinh();
                adminPage.setVisible(true);
                loginViews.dispose();  // Đóng cửa sổ đăng nhập
                break;

            case LoginDAO.LOGIN_SUCCESS_EMPLOYEE:
                // Đăng nhập thành công với quyền Nhân viên
                EmployeeHomePage employeePage = new EmployeeHomePage(username, password);
                employeePage.setVisible(true);
                loginViews.dispose();  // Đóng cửa sổ đăng nhập
                break;

            case LoginDAO.ACCOUNT_NOT_FOUND:
                // Tài khoản không tồn tại
                loginViews.showMessage("Tài khoản không tồn tại trong hệ thống!");
                break;

            case LoginDAO.WRONG_PASSWORD:
                // Mật khẩu không chính xác
                loginViews.showMessage("Mật khẩu không chính xác!");
                break;

            case LoginDAO.DATABASE_ERROR:
                // Lỗi kết nối cơ sở dữ liệu
                loginViews.showMessage("Lỗi kết nối đến cơ sở dữ liệu!");
                break;

            case LoginDAO.INVALID_ROLE:
                // Tài khoản không có quyền hợp lệ
                loginViews.showMessage("Tài khoản của bạn chưa được phân quyền hoặc có role_id không hợp lệ!");
                break;

            default:
                // Lỗi không xác định
                loginViews.showMessage("Đã xảy ra lỗi không xác định! (Mã lỗi: " + loginResult + ")");
                break;
        }
    }
}
