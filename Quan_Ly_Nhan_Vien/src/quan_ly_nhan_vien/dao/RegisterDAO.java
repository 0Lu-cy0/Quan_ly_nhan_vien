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

    public boolean isPhoneNumberTaken(String phoneNumber) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = dbConnection.getJDBCConnection();

            String query = "SELECT COUNT(*) FROM employees WHERE phone_number = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, phoneNumber);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
            return false;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    System.out.println("Đã đóng ResultSet");
                }
                if (stmt != null) {
                    stmt.close();
                    System.out.println("Đã đóng PreparedStatement");
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Đã đóng Connection");
                }
            } catch (SQLException e) {
                System.out.println("Lỗi khi đóng kết nối: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public boolean isEmailTaken(String email) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = dbConnection.getJDBCConnection();
            String query = "SELECT COUNT(*) FROM employees WHERE email = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;

        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra email: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isUsernameTaken(String username) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = dbConnection.getJDBCConnection();
            String query = "SELECT COUNT(*) FROM accounts WHERE username = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;

        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra username: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean addUserToDatabase(RegisterModels model) {
        Connection conn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null; // Thêm statement cho attendances
        PreparedStatement stmt4 = null; // Thêm statement cho salaries
        ResultSet generatedKeys = null;

        try {
            conn = dbConnection.getJDBCConnection();
            conn.setAutoCommit(false);

            // Thêm employee
            String employeeQuery = "INSERT INTO Employees (full_name, email, phone_number) VALUES (?, ?, ?)";
            stmt1 = conn.prepareStatement(employeeQuery, Statement.RETURN_GENERATED_KEYS);
            stmt1.setString(1, model.getFullname());
            stmt1.setString(2, model.getEmail());
            stmt1.setString(3, model.getPhoneNumber());
            stmt1.executeUpdate();

            // Lấy employee_id
            generatedKeys = stmt1.getGeneratedKeys();
            int employeeId;
            if (generatedKeys.next()) {
                employeeId = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Không thể lấy employee_id.");
            }

            // Thêm account
            String accountQuery = "INSERT INTO Accounts (employee_id, username, password, email) VALUES (?, ?, ?, ?)";
            stmt2 = conn.prepareStatement(accountQuery);
            stmt2.setInt(1, employeeId);
            stmt2.setString(2, model.getUsername());
            stmt2.setString(3, model.getPassword());
            stmt2.setString(4, model.getEmail());
            stmt2.executeUpdate();

            // Thêm bản ghi vào bảng attendances với giá trị mặc định
            String attendanceQuery = "INSERT INTO attendances (employee_id, day, status) VALUES (?, CURRENT_DATE, 'Chưa chấm')";
            stmt3 = conn.prepareStatement(attendanceQuery);
            stmt3.setInt(1, employeeId);
            stmt3.executeUpdate();

//            // Thêm bản ghi vào bảng salaries với giá trị mặc định
//            String salaryQuery = "INSERT INTO salaries (employee_id, month, base_salary, bonus) VALUES (?, DATE_FORMAT(CURRENT_DATE, '%m/%Y'), 0, 0)";
//            stmt4 = conn.prepareStatement(salaryQuery);
//            stmt4.setInt(1, employeeId);
//            stmt4.executeUpdate();

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
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (generatedKeys != null) {
                    generatedKeys.close();
                }
                if (stmt4 != null) {
                    stmt4.close();
                }
                if (stmt3 != null) {
                    stmt3.close();
                }
                if (stmt2 != null) {
                    stmt2.close();
                }
                if (stmt1 != null) {
                    stmt1.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
