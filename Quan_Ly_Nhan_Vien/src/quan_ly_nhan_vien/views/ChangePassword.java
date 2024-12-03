package quan_ly_nhan_vien.views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import quan_ly_nhan_vien.utils.HashPassword;

public class ChangePassword extends javax.swing.JFrame {

    private String username;
    private String matKhauMoi;

    public ChangePassword(String username) {
        initComponents();
        this.username = username;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Đổi mật khẩu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        lblNameError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jbtNhanMaOTP = new javax.swing.JButton();
        lblPasswordError = new javax.swing.JLabel();
        jtfNhapMaXacNhanOTP = new javax.swing.JPasswordField();
        cbHienThiMatKhau = new javax.swing.JCheckBox();
        jpwMatKhauHienTai = new javax.swing.JPasswordField();
        jpwXacNhanMatKhau = new javax.swing.JPasswordField();
        jpwMatKhauMoi = new javax.swing.JPasswordField();
        jbtXacNhanDoiMatKhau = new javax.swing.JButton();
        jbtQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 40));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 470, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "ĐỔI MẬT KHẨU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, -1));

        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblConfirmPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 440, -1));

        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblUsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 440, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtNhanMaOTP.setBackground(new java.awt.Color(0, 102, 102));
        jbtNhanMaOTP.setForeground(new java.awt.Color(255, 255, 255));
        jbtNhanMaOTP.setText("Nhận mã");
        jbtNhanMaOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNhanMaOTPActionPerformed(evt);
            }
        });
        jPanel6.add(jbtNhanMaOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 450, 40));

        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 380, -1));

        jtfNhapMaXacNhanOTP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfNhapMaXacNhanOTP.setForeground(new java.awt.Color(0, 102, 102));
        jtfNhapMaXacNhanOTP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mã xác nhận", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfNhapMaXacNhanOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNhapMaXacNhanOTPActionPerformed(evt);
            }
        });
        jPanel5.add(jtfNhapMaXacNhanOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 452, 50));

        cbHienThiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbHienThiMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        cbHienThiMatKhau.setText("Hiển thị");
        cbHienThiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienThiMatKhauActionPerformed(evt);
            }
        });
        jPanel5.add(cbHienThiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jpwMatKhauHienTai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jpwMatKhauHienTai.setForeground(new java.awt.Color(0, 102, 102));
        jpwMatKhauHienTai.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mật khẩu hiện tại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jpwMatKhauHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwMatKhauHienTaiActionPerformed(evt);
            }
        });
        jPanel5.add(jpwMatKhauHienTai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 452, 50));

        jpwXacNhanMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jpwXacNhanMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jpwXacNhanMatKhau.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Xác nhận mật khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jpwXacNhanMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 452, 50));

        jpwMatKhauMoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jpwMatKhauMoi.setForeground(new java.awt.Color(0, 102, 102));
        jpwMatKhauMoi.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mật khẩu mới", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jpwMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 452, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 470, 350));

        jbtXacNhanDoiMatKhau.setBackground(new java.awt.Color(0, 102, 102));
        jbtXacNhanDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jbtXacNhanDoiMatKhau.setText("Đổi mật khẩu");
        jbtXacNhanDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXacNhanDoiMatKhauActionPerformed(evt);
            }
        });
        getContentPane().add(jbtXacNhanDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        jbtQuayLai.setBackground(new java.awt.Color(0, 102, 102));
        jbtQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jbtQuayLai.setText("Quay lại");
        jbtQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Hiển thị hoặc ẩn mật khẩu
    private void cbHienThiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienThiMatKhauActionPerformed
        char echoChar = cbHienThiMatKhau.isSelected() ? (char) 0 : '*';
        jpwMatKhauHienTai.setEchoChar(echoChar);
        jpwMatKhauMoi.setEchoChar(echoChar);
        jpwXacNhanMatKhau.setEchoChar(echoChar);
    }//GEN-LAST:event_cbHienThiMatKhauActionPerformed

    private void jtfNhapMaXacNhanOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNhapMaXacNhanOTPActionPerformed

    }//GEN-LAST:event_jtfNhapMaXacNhanOTPActionPerformed

    // Nhận mã OTP và lưu vào file
    private void jbtNhanMaOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNhanMaOTPActionPerformed
        String otp = generateOtp();
        String filePath = "C:\\OTP\\OTP.txt";
        saveOtpToFile(otp, filePath);
        JOptionPane.showMessageDialog(this, "Mã OTP đã được tạo và lưu vào file: " + filePath);
    }//GEN-LAST:event_jbtNhanMaOTPActionPerformed

    // Phương thức tạo mã OTP ngẫu nhiên
    private String generateOtp() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }
        return otp.toString();
    }

    // Lưu mã OTP và thời gian vào file
    private void saveOtpToFile(String otp, String filePath) {
        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(otp);
                writer.newLine();
                writer.write(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu mã OTP vào file!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validatePasswords(String matKhauMoi, String matKhauXacNhan) {
        // Kiểm tra mật khẩu mới không để trống
        if (matKhauMoi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra độ dài tối thiểu của mật khẩu mới
        if (matKhauMoi.length() < 8) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới phải có ít nhất 8 ký tự!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra mật khẩu có ít nhất một ký tự viết hoa, một chữ số và một ký tự đặc biệt
        if (!matKhauMoi.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới phải chứa ít nhất một ký tự viết hoa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!matKhauMoi.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới phải chứa ít nhất một chữ số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!matKhauMoi.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới phải chứa ít nhất một ký tự đặc biệt!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra mật khẩu xác nhận
        if (!matKhauMoi.equals(matKhauXacNhan)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }


    private void jbtXacNhanDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXacNhanDoiMatKhauActionPerformed
        String matKhauHienTai = new String(jpwMatKhauHienTai.getPassword());
        String matKhauMoi = new String(jpwMatKhauMoi.getPassword());
        String matKhauXacNhan = new String(jpwXacNhanMatKhau.getPassword());
        String otp = jtfNhapMaXacNhanOTP.getText();

        // Kiểm tra tính hợp lệ của mật khẩu
        if (!validatePasswords(matKhauMoi, matKhauXacNhan)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới và xác nhận mật khẩu không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String matKhauHienTaiHashed = HashPassword.hashPassword(matKhauHienTai);

        try (Connection conn = new DatabaseConnection().getJDBCConnection()) {
            // Lấy employee_id từ email hoặc số điện thoại
            String employeeId = getEmployeeIdByEmailOrPhone(username);
            if (employeeId == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra mật khẩu hiện tại
            String query = "SELECT password FROM accounts WHERE employee_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, employeeId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String matKhauDaLuu = rs.getString("password");

                // Kiểm tra mật khẩu hiện tại và mã OTP
                if (matKhauDaLuu.equals(matKhauHienTaiHashed) && isValidOtp(otp)) {
                    // Cập nhật mật khẩu mới
                    String updateQuery = "UPDATE accounts SET password = ? WHERE employee_id = ?";
                    PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                    updateStmt.setString(1, HashPassword.hashPassword(matKhauMoi));
                    updateStmt.setString(2, employeeId);
                    updateStmt.executeUpdate();

                    int option = JOptionPane.showConfirmDialog(this, "Đổi mật khẩu thành công! Bạn có muốn quay về trang nhân viên không?", "Thành công", JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        new EmployeeHomePage(username, matKhauMoi).setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mật khẩu hiện tại hoặc mã OTP không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi thực hiện đổi mật khẩu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtXacNhanDoiMatKhauActionPerformed

    // Phương thức hỗ trợ lấy employee_id
    private String getEmployeeIdByEmailOrPhone(String input) {
        String employeeId = null;
        try (Connection conn = new DatabaseConnection().getJDBCConnection()) {
            String query = "SELECT employee_id FROM employees WHERE email = ? OR phone_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, input); // Tìm bằng email
            pstmt.setString(2, input); // Tìm bằng số điện thoại
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                employeeId = rs.getString("employee_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeId;
    }

    // Kiểm tra mã OTP hợp lệ
    private boolean isValidOtp(String otp) {
        String filePath = "C:\\OTP\\OTP.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String otpFromFile = reader.readLine();
            String timeFromFile = reader.readLine();

            if (!otp.equals(otpFromFile)) {
                JOptionPane.showMessageDialog(this, "Mã OTP không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            LocalDateTime createdTime = LocalDateTime.parse(timeFromFile, DateTimeFormatter.ISO_DATE_TIME);
            if (java.time.Duration.between(createdTime, LocalDateTime.now()).toMinutes() >= 2) {
                JOptionPane.showMessageDialog(this, "Mã OTP đã hết hạn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi đọc mã OTP từ file!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void jpwMatKhauHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwMatKhauHienTaiActionPerformed

    }//GEN-LAST:event_jpwMatKhauHienTaiActionPerformed

    //Quay lại trang chủ nhân viên
    private void jbtQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuayLaiActionPerformed
        String matKhau = (matKhauMoi != null) ? matKhauMoi : new String(jpwMatKhauHienTai.getPassword());
        new EmployeeHomePage(username, matKhau).setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtQuayLaiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbHienThiMatKhau;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton jbtNhanMaOTP;
    private javax.swing.JButton jbtQuayLai;
    private javax.swing.JButton jbtXacNhanDoiMatKhau;
    private javax.swing.JPasswordField jpwMatKhauHienTai;
    private javax.swing.JPasswordField jpwMatKhauMoi;
    private javax.swing.JPasswordField jpwXacNhanMatKhau;
    private javax.swing.JPasswordField jtfNhapMaXacNhanOTP;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    // End of variables declaration//GEN-END:variables
}
