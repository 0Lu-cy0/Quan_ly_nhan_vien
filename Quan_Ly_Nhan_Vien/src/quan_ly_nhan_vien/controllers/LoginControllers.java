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
        this.loginModels = new LoginModels("", "");
        this.loginDAO = new LoginDAO();
    }

    public void login(String username, String password) {
        loginModels.setUsername(username);
        loginModels.setPassword(password);

        int loginResult = loginDAO.checkLogin(loginModels);

        switch (loginResult) {
            case LoginDAO.LOGIN_SUCCESS_ADMIN:
                TrangChinh adminPage = new TrangChinh();
                adminPage.setVisible(true);
                loginViews.dispose();
                break;

            case LoginDAO.LOGIN_SUCCESS_EMPLOYEE:
                EmployeeHomePage employeePage = new EmployeeHomePage(username, password);
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

            case LoginDAO.INVALID_ROLE:
                loginViews.showMessage("Tài khoản của bạn chưa được phân quyền hoặc có role_id không hợp lệ!");
                break;

            default:
                loginViews.showMessage("Đã xảy ra lỗi không xác định! (Mã lỗi: " + loginResult + ")");
                break;
        }
    }
}
