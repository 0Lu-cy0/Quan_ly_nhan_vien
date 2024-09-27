package quan_ly_nhan_vien.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class RegistrationController {

    public boolean registerUser(String username, String password, String confirmPassword, String fullname, String address) {
        // Kiểm tra xem mật khẩu có khớp không
        if (!password.equals(confirmPassword)) {
            System.out.println("Mật khẩu không khớp.");
            return false;
        }

        // Kiểm tra độ mạnh của mật khẩu
        if (!isPasswordStrong(password)) {
            System.out.println("Mật khẩu không đủ mạnh. Nó cần ít nhất 12 ký tự, bao gồm chữ hoa, chữ thường, số và ký tự đặc biệt.");
            return false;
        }

        // Kiểm tra xem tài khoản đã tồn tại chưa
        if (isUsernameTaken(username)) {
            System.out.println("Tài khoản đã tồn tại.");
            return false; // Tài khoản đã tồn tại
        }

        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.conn;

        String query = "INSERT INTO account (username, password, fullname, address) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, fullname);
            stmt.setString(4, address);
            
            // In ra thông tin trước khi thực thi
            System.out.println("Đang cố gắng thêm tài khoản: " + username + ", " + fullname);
            
            // Thực thi câu lệnh SQL
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Tài khoản đã được thêm vào cơ sở dữ liệu.");
                return true;  // Đăng ký thành công
            } else {
                System.out.println("Không có tài khoản nào được thêm.");
                return false; // Không thành công
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi tạo tài khoản: " + ex.getMessage());
            ex.printStackTrace(); // In ra chi tiết lỗi
            return false;
        } finally {
            dbConnection.closeConnection();
        }
    }

    private boolean isUsernameTaken(String username) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.conn;

        String query = "SELECT COUNT(*) FROM account WHERE username = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Trả về true nếu tài khoản đã tồn tại
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra tài khoản: " + ex.getMessage());
            ex.printStackTrace(); // In ra chi tiết lỗi
        } finally {
            dbConnection.closeConnection();
        }
        return false; // Mặc định là tài khoản không tồn tại
    }

    private boolean isPasswordStrong(String password) {
        // Định nghĩa biểu thức chính quy để kiểm tra mật khẩu
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{12,}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    
}
