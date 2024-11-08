package quan_ly_nhan_vien.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quan_ly_nhan_vien.models.LoginModels;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class LoginDAO {
    public static final int LOGIN_SUCCESS_ADMIN = 1;
    public static final int LOGIN_SUCCESS_EMPLOYEE = 2;
    public static final int ACCOUNT_NOT_FOUND = -1;
    public static final int WRONG_PASSWORD = -2;
    public static final int DATABASE_ERROR = -3;
    public static final int INVALID_ROLE = -4;

    public int checkLogin(LoginModels loginModel) {
        String inputUsername = loginModel.getUsername();
        String inputHashedPassword = loginModel.getHashedPassword();
        
        String query = "SELECT password, role_id FROM accounts WHERE username = ?";
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, inputUsername);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String dbPassword = rs.getString("password");
                    int roleId = rs.getInt("role_id");

                    // So sánh mật khẩu đã mã hóa
                    if (inputHashedPassword.equals(dbPassword)) {
                        if (roleId == 1) {
                            return LOGIN_SUCCESS_ADMIN;
                        } else if (roleId == 2) {
                            return LOGIN_SUCCESS_EMPLOYEE;
                        } else {
                            return INVALID_ROLE;
                        }
                    } else {
                        return WRONG_PASSWORD;
                    }
                } else {
                    return ACCOUNT_NOT_FOUND;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Cần thay thế bằng log lỗi hoặc thông báo lỗi cụ thể hơn
            return DATABASE_ERROR;
        }
    }
}
