package quan_ly_nhan_vien.views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import javax.swing.JOptionPane;
import quan_ly_nhan_vien.utils.HashPassword;

public class EmployeeHomePage extends javax.swing.JFrame {

    DatabaseConnection dbConnection = new DatabaseConnection();
    private String employeeID; // Biến lưu trữ ID nhân viên
    private String username; // Biến lưu trữ tên đăng nhập
    private String password; // Biến lưu trữ mật khẩu

    public EmployeeHomePage(String username, String password) {
        initComponents();
        this.username = username;
        this.password = password;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Nhân viên");
        // Gọi hàm load thông tin nhân viên
        loadEmployeeData(username); // Sử dụng employeeID đã lưu
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtDoiMatKhau = new javax.swing.JButton();
        jbtDangXuat = new javax.swing.JButton();
        jbtLichSuChamCong = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jtfPhoneNumber = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfLuong = new javax.swing.JTextField();
        jtfHoVaTen = new javax.swing.JTextField();
        jtfNgayThangNamSinh = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtDoiMatKhau.setText("Đổi mật khẩu");
        jbtDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDoiMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(jbtDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 50));

        jbtDangXuat.setText("Đăng xuất");
        jbtDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangXuatActionPerformed(evt);
            }
        });
        jPanel3.add(jbtDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 50));

        jbtLichSuChamCong.setText("Lịch sử chấm công");
        jPanel3.add(jbtLichSuChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 470, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Thông tin nhân viên", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));
        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfPhoneNumber.setEditable(false);
        jtfPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfPhoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneNumberActionPerformed(evt);
            }
        });
        jPanel4.add(jtfPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 452, 50));

        jtfAddress.setEditable(false);
        jtfAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Địa chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAddressActionPerformed(evt);
            }
        });
        jPanel4.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 452, 50));

        jtfLuong.setEditable(false);
        jtfLuong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfLuong.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLuongActionPerformed(evt);
            }
        });
        jPanel4.add(jtfLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 452, 50));

        jtfHoVaTen.setEditable(false);
        jtfHoVaTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfHoVaTen.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Họ và tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfHoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHoVaTenActionPerformed(evt);
            }
        });
        jPanel4.add(jtfHoVaTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 452, 50));

        jtfNgayThangNamSinh.setEditable(false);
        jtfNgayThangNamSinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfNgayThangNamSinh.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Ngày, tháng, năm sinh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfNgayThangNamSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNgayThangNamSinhActionPerformed(evt);
            }
        });
        jPanel4.add(jtfNgayThangNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 452, 50));

        jtfEmail.setEditable(false);
        jtfEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });
        jPanel4.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 452, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 470, 400));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 40));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangXuatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Người dùng xác nhận muốn đăng xuất
            // Mở lại màn hình đăng nhập
            LoginViews login = new LoginViews();
            login.setVisible(true);
            dispose();  // Đóng AdminHomePage
        }
    }//GEN-LAST:event_jbtDangXuatActionPerformed

    private void jbtDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDoiMatKhauActionPerformed
        String username = jtfPhoneNumber.getText();  // Lấy tên tài khoản hiện tại từ ô jtfTaiKhoan
        ChangePassword changePasswordPage = new ChangePassword(username);  // Truyền username qua trang đổi mật khẩu 
        changePasswordPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtDoiMatKhauActionPerformed

    private void loadEmployeeData(String username) {
        String query = "SELECT e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, e.salary "
                + "FROM employees e "
                + "JOIN accounts a ON e.employee_id = a.employee_id "
                + "WHERE a.username = ?";

        try (Connection connection = dbConnection.getJDBCConnection(); PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Hiển thị thông tin nhân viên
                jtfPhoneNumber.setText(rs.getString("email"));
                jtfHoVaTen.setText(rs.getString("full_name"));
                jtfPhoneNumber.setText(rs.getString("phone_number"));

                // Kiểm tra và hiển thị thông tin địa chỉ
                String address = rs.getString("address");
                if (address == null || address.trim().isEmpty()) {
                    jtfAddress.setText("Chưa có thông tin, liên hệ Admin để cập nhật!");
                    jtfAddress.setForeground(java.awt.Color.RED);
                } else {
                    jtfAddress.setText(address);
                    jtfAddress.setForeground(java.awt.Color.BLACK);
                }

                // Kiểm tra và hiển thị thông tin ngày sinh
                String dob = rs.getString("date_of_birth");
                if (dob == null || dob.trim().isEmpty()) {
                    jtfNgayThangNamSinh.setText("Chưa có thông tin, liên hệ Admin để cập nhật!");
                    jtfNgayThangNamSinh.setForeground(java.awt.Color.RED);
                } else {
                    jtfNgayThangNamSinh.setText(dob);
                    jtfNgayThangNamSinh.setForeground(java.awt.Color.BLACK);
                }

                // Kiểm tra và hiển thị thông tin lương
                float salary = rs.getFloat("salary");
                if (rs.wasNull()) {
                    jtfLuong.setText("Chưa có thông tin, liên hệ Admin để cập nhật!");
                    jtfLuong.setForeground(java.awt.Color.RED);
                } else {
                    jtfLuong.setText(String.format("%,.0f", salary)); // Định dạng lương có dấu phẩy
                    jtfLuong.setForeground(java.awt.Color.BLACK);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin nhân viên!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jtfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneNumberActionPerformed

    }//GEN-LAST:event_jtfPhoneNumberActionPerformed

    private void jtfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAddressActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfAddressActionPerformed

    private void jtfLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLuongActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfLuongActionPerformed

    private void jtfHoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHoVaTenActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfHoVaTenActionPerformed

    private void jtfNgayThangNamSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNgayThangNamSinhActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfNgayThangNamSinhActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private boolean authenticateUser(String username, String password) {
        String query = "SELECT * FROM Employee WHERE employee_id = ? AND password = ?";
        try {
            // Băm mật khẩu người dùng nhập vào
            String hashedPassword = HashPassword.hashPassword(password); // Sử dụng lại phương thức băm mật khẩu trong LoginViews

            // Chuẩn bị truy vấn và kiểm tra
            PreparedStatement ps = dbConnection.getJDBCConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, hashedPassword);

            ResultSet rs = ps.executeQuery();
            return rs.next();  // Nếu tìm thấy dòng dữ liệu, nghĩa là xác thực thành công
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;  // Xác thực không thành công
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtDangXuat;
    private javax.swing.JButton jbtDoiMatKhau;
    private javax.swing.JButton jbtLichSuChamCong;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoVaTen;
    private javax.swing.JTextField jtfLuong;
    private javax.swing.JTextField jtfNgayThangNamSinh;
    private javax.swing.JTextField jtfPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
