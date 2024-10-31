package quan_ly_nhan_vien.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quan_ly_nhan_vien.models.LoginModels;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import quan_ly_nhan_vien.utils.HashPassword;

public class LoginDAO {
    public static final int LOGIN_SUCCESS_ADMIN = 1;
    public static final int LOGIN_SUCCESS_EMPLOYEE = 2;
    public static final int ACCOUNT_NOT_FOUND = -1;
    public static final int WRONG_PASSWORD = -2;
    public static final int DATABASE_ERROR = -3;
    public static final int INVALID_ROLE = -4;  // Thêm hằng số mới

    public int checkLogin(LoginModels loginModel) {
        String inputUsername = loginModel.getUsername();
        String inputHashedPassword = HashPassword.hashPassword(loginModel.getPassword());
        
        String query = "SELECT username, password, role_id FROM accounts WHERE username = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            DatabaseConnection dbConnection = new DatabaseConnection();
            conn = dbConnection.getJDBCConnection();

            ps = conn.prepareStatement(query);
            ps.setString(1, inputUsername);
            rs = ps.executeQuery();

            if (rs.next()) {
                String dbPassword = rs.getString("password");
                int roleId = rs.getInt("role_id");
                
                // In ra để debug
                System.out.println("Database password: " + dbPassword);
                System.out.println("Input hashed password: " + inputHashedPassword);
                System.out.println("Role ID from database: " + roleId);

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
        } catch (SQLException e) {
            e.printStackTrace();
            return DATABASE_ERROR;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}