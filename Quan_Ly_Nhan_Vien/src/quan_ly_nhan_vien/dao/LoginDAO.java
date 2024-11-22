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
    private final DatabaseConnection dbConnection;

    public LoginDAO() {
        this.dbConnection = new DatabaseConnection();
    }

    /**
     * Phương thức kiểm tra đăng nhập bằng username
     */
    public int checkLoginByUsername(LoginModels loginModel) {
        return checkLoginWithQuery(loginModel, "SELECT password, role_id FROM accounts WHERE username = ?");
    }

    /**
     * Phương thức kiểm tra đăng nhập bằng email
     */
    public int checkLoginByEmail(LoginModels loginModel) {
        return checkLoginWithQuery(loginModel, "SELECT password, role_id FROM accounts WHERE email = ?");
    }

    /**
     * Phương thức dùng chung để kiểm tra đăng nhập với query tùy chỉnh
     */
    private int checkLoginWithQuery(LoginModels loginModel, String query) {
        try (Connection conn = dbConnection.getJDBCConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            // Truyền tham số dựa trên query (có thể là username hoặc email)
            stmt.setString(1, loginModel.getUsername());

            // Thực thi truy vấn và xử lý kết quả
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String dbPassword = rs.getString("password");
                    String roleId = rs.getString("role_id");  // Lấy giá trị role_id là String để dễ xử lý null

                    // Kiểm tra mật khẩu
                    if (loginModel.getHashedPassword().equals(dbPassword)) {
                        // Kiểm tra role_id
                        if (roleId == null || roleId.isEmpty()) {
                            return INVALID_ROLE; // Nếu role_id là null hoặc trống
                        } else if (roleId.equals("1")) {
                            return LOGIN_SUCCESS_ADMIN;
                        } else if (roleId.equals("2")) {
                            return LOGIN_SUCCESS_EMPLOYEE;
                        } else {
                            return INVALID_ROLE; // Trường hợp role_id không phải là 1 hoặc 2
                        }
                    } else {
                        return WRONG_PASSWORD;
                    }
                } else {
                    return ACCOUNT_NOT_FOUND;
                }
            }
        } catch (SQLException e) {
            System.err.println("Lỗi truy vấn cơ sở dữ liệu: " + e.getMessage());
            return DATABASE_ERROR;
        }
    }
}
