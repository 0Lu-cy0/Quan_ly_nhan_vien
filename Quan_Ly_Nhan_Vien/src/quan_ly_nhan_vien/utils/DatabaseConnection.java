package quan_ly_nhan_vien.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    private final String connectionString = "jdbc:mysql://localhost:3306/test"; // Thay đổi connection string cho MySQL
    private final String user = "root"; // Tên người dùng MySQL của bạn
    private final String password = "123456789"; // Mật khẩu MySQL của bạn

    public Connection conn;

    // Phương thức khởi tạo và thiết lập kết nối CSDL
    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver cho MySQL
            conn = DriverManager.getConnection(connectionString, user, password);
            if (conn != null) {
                System.out.println("Kết nối CSDL MySQL thành công!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, "Không tìm thấy driver", ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, "Lỗi kết nối MySQL", ex);
        }
    }

    // Phương thức này trả về Connection cho các lớp khác sử dụng
    public Connection getJDBCConnection() {
        return conn;
    }

    // Thực thi câu lệnh SELECT và trả về ResultSet
    public ResultSet executeQueryGetTable(String query) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, "Lỗi thực thi câu lệnh SELECT", ex);
        }
        return rs;
    }

    // Thực thi câu lệnh INSERT, DELETE, UPDATE
    public void executeQueryUpdateDB(String query) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, "Lỗi thực thi câu lệnh INSERT/UPDATE/DELETE", ex);
        }
    }

    // Đóng kết nối với CSDL
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Đã đóng kết nối CSDL.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, "Lỗi đóng kết nối", ex);
        }
    }

    // Kiểm tra kết nối bằng phương thức main
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        if (dbConnection.getJDBCConnection() != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }
        dbConnection.closeConnection();
    }
}
