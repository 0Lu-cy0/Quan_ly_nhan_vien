/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_nhan_vien.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class LoginController {
    
    public boolean authenticateUser(String username, String password) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.getJDBCConnection(); // Sử dụng phương thức getJDBCConnection

        if (conn != null) {
            try {
                String sql = "SELECT * FROM account WHERE username = ? AND password = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    return true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                dbConnection.closeConnection(); // Đóng kết nối sau khi sử dụng
            }
        }
        return false;
    }
}


    
