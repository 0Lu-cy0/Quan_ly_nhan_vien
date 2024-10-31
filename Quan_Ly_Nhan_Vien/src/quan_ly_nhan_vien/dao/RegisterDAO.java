package quan_ly_nhan_vien.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quan_ly_nhan_vien.models.RegisterModels;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class RegisterDAO {

    private final DatabaseConnection dbConnection;

    public RegisterDAO() {
        this.dbConnection = new DatabaseConnection();
    }

    public boolean isUsernameTaken(String username) {
        try (Connection conn = dbConnection.getJDBCConnection()) {
            String query = "SELECT COUNT(*) FROM accounts WHERE username = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, username);
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next() && rs.getInt(1) > 0;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra tài khoản: " + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }

    public boolean isPhoneNumberTaken(String phoneNumber) {
        try (Connection conn = dbConnection.getJDBCConnection()) {
            String query = "SELECT COUNT(*) FROM employees WHERE phone_number = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, phoneNumber);
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next() && rs.getInt(1) > 0;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra số điện thoại: " + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }

    public boolean isEmailTaken(String email) {
        try (Connection conn = dbConnection.getJDBCConnection()) {
            String query = "SELECT COUNT(*) FROM employees WHERE email = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, email);
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next() && rs.getInt(1) > 0;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra email: " + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }

    public boolean addUserToDatabase(RegisterModels model) {
        String accountQuery = "INSERT INTO Accounts (employee_id, username, password) VALUES (?, ?, ?)";
        String employeeQuery = "INSERT INTO Employees (full_name, email, phone_number) VALUES (?, ?, ?)";

        Connection conn = null;

        try {
            conn = dbConnection.getJDBCConnection();
            conn.setAutoCommit(false);

            int employeeId = -1;
            try (PreparedStatement stmt1 = conn.prepareStatement(employeeQuery, Statement.RETURN_GENERATED_KEYS)) {
                stmt1.setString(1, model.getFullname());
                stmt1.setString(2, model.getEmail());
                stmt1.setString(3, model.getPhoneNumber());
                stmt1.executeUpdate();

                try (ResultSet generatedKeys = stmt1.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        employeeId = generatedKeys.getInt(1);
                    } else {
                        throw new SQLException("Không thể lấy employee_id.");
                    }
                }
            }

            try (PreparedStatement stmt2 = conn.prepareStatement(accountQuery)) {
                stmt2.setInt(1, employeeId);
                stmt2.setString(2, model.getUsername());
                stmt2.setString(3, model.getPassword());
                stmt2.executeUpdate();
            }

            conn.commit();
            return true;
        } catch (SQLException ex) {
            System.out.println("Lỗi khi tạo tài khoản: " + ex.getMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
