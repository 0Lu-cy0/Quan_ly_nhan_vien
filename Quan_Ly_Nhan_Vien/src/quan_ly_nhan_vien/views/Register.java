/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quan_ly_nhan_vien.views;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;
import java.util.List;
import java.util.ArrayList;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
//      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/quan_ly_nhan_vien/utils/Image/Logo.png")));   
        this.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        PlainDocument doc = (PlainDocument) jtfTaiKhoan.getDocument();
//        doc.setDocumentFilter(new NumberFilter());  // Áp dụng NumberFilter

        // Thêm DocumentListener để kiểm tra dữ liệu nhập vào
        addDocumentListener(jtfTaiKhoan, this::validateFields);
        addDocumentListener(jtfFullName, this::validateFields);
        addDocumentListener(jtfMatKhau, this::validateFields);
        addDocumentListener(jtfNhapLaiMatKhau, this::validateFields);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlbReEnterPasswordWarning = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jtfFullName = new javax.swing.JTextField();
        jtfQueQuan = new javax.swing.JTextField();
        jtfTaiKhoan = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtfNhapLaiMatKhau = new javax.swing.JPasswordField();
        lblPasswordError = new javax.swing.JLabel();
        jtfMatKhau = new javax.swing.JPasswordField();
        cbHienThiMatKhau = new javax.swing.JCheckBox();
        btnDangNhap = new javax.swing.JButton();
        BtnTaoTK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jLabel7, java.awt.BorderLayout.CENTER);
        getContentPane().add(jlbReEnterPasswordWarning, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "ĐĂNG KÝ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfFullName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfFullName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Họ và tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFullNameActionPerformed(evt);
            }
        });
        jPanel5.add(jtfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 452, 50));

        jtfQueQuan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfQueQuan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Địa chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jtfQueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, 452, 50));

        jtfTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfTaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Tài khoản(MNV)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102)))); // NOI18N
        jPanel5.add(jtfTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 450, 50));

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, -1));

        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblConfirmPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 440, -1));

        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblUsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 440, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfNhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfNhapLaiMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jtfNhapLaiMatKhau.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Nhập lại mật khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfNhapLaiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNhapLaiMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(jtfNhapLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 452, 50));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 300, 460, 63));

        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 380, -1));

        jtfMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jtfMatKhau.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mật khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jtfMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 233, 452, 50));

        cbHienThiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbHienThiMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        cbHienThiMatKhau.setText("Hiển thị");
        cbHienThiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienThiMatKhauActionPerformed(evt);
            }
        });
        jPanel5.add(cbHienThiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 370));

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(0, 102, 102));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 90, 40));

        BtnTaoTK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTaoTK.setForeground(new java.awt.Color(0, 102, 102));
        BtnTaoTK.setText("Tạo tài khoản");
        BtnTaoTK.setBorder(null);
        BtnTaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTaoTKActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTaoTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 100, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 20));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, 130));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 40));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quan_ly_nhan_vien/utils/Image/Logo(96_76).png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 96, 76));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    public class NumberFilter extends DocumentFilter {
//
//        @Override
//        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
//            if (string != null && string.matches("[0-9]+")) {
//                super.insertString(fb, offset, string, attr);
//            }
//        }
//
//        @Override
//        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
//            if (text != null && text.matches("[0-9]+")) {
//                super.replace(fb, offset, length, text, attrs);
//            }
//        }
//
//        @Override
//        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
//            super.remove(fb, offset, length);
//        }
//    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void addDocumentListener(JTextComponent textComponent, Runnable checkMethod) {
        textComponent.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                checkMethod.run();
            }

            public void removeUpdate(DocumentEvent e) {
                checkMethod.run();
            }

            public void changedUpdate(DocumentEvent e) {
                checkMethod.run();
            }
        });
    }

    private void validateFields() {
        String username = jtfTaiKhoan.getText().trim();
        String password = new String(jtfMatKhau.getPassword()).trim();
        String confirmPassword = new String(jtfNhapLaiMatKhau.getPassword()).trim();
        String fullname = jtfFullName.getText().trim();

        // Kiểm tra trường tên có trống hay không
        lblNameError.setText(fullname.isEmpty() ? "Tên là bắt buộc." : "");

        // Kiểm tra trường tài khoản có trống hay không
        lblUsernameError.setText(username.isEmpty() ? "Tài khoản là bắt buộc." : "");

        // Kiểm tra mật khẩu có trống hay không
        if (password.isEmpty()) {
            lblPasswordError.setText("Mật khẩu là bắt buộc.");
            return; // Nếu mật khẩu trống thì dừng lại ở đây
        }

        // Kiểm tra mật khẩu khớp
        lblConfirmPasswordError.setText(!password.equals(confirmPassword) ? "Mật khẩu không khớp." : "");

        // Kiểm tra độ mạnh của mật khẩu
        List<String> passwordErrors = validatePassword(password);

        // Hiển thị tất cả các lỗi của mật khẩu
        if (!passwordErrors.isEmpty()) {
            StringBuilder errorMessages = new StringBuilder();
            for (String error : passwordErrors) {
                errorMessages.append(error).append("\n"); // Ghép các lỗi l ại
            }
            lblPasswordError.setText("<html>" + errorMessages.toString().replace("\n", "<br>") + "</html>");
        } else {
            lblPasswordError.setText(""); // Xóa lỗi nếu không còn lỗi
        }
    }

    private List<String> validatePassword(String password) {
        List<String> errors = new ArrayList<>();

//        if(lblUsernameError.setText(username.isEmpty()){
//            
//        }
        // Kiểm tra mật khẩu có chứa chữ số
        if (!password.matches(".*\\d.*")) {
            errors.add("Mật khẩu cần ít nhất một chữ số.");
        }
        // Kiểm tra mật khẩu có chứa chữ thường
        if (!password.matches(".*[a-z].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự chữ thường.");
        }
        // Kiểm tra mật khẩu có chứa chữ hoa
        if (!password.matches(".*[A-Z].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự chữ hoa.");
        }
        // Kiểm tra mật khẩu có chứa ký tự đặc biệt
        if (!password.matches(".*[@$!%*?&].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự đặc biệt.");
        }
        // Kiểm tra độ dài mật khẩu
        if (password.length() < 12) {
            errors.add("Mật khẩu cần ít nhất 12 ký tự.");
        }
        return errors;
    }

    private void BtnTaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTaoTKActionPerformed
        String username = jtfTaiKhoan.getText().trim();
        String password = new String(jtfMatKhau.getPassword()).trim();
        String confirmPassword = new String(jtfNhapLaiMatKhau.getPassword()).trim();
        String fullname = jtfFullName.getText().trim();
        String address = jtfQueQuan.getText().trim();

        // Validate các trường
        validateFields();

        // Nếu có lỗi, không thực hiện tiếp
//        if (!lblNameError.getText().isEmpty() || !lblUsernameError.getText().isEmpty()
//                || !lblPasswordError.getText().isEmpty() || !lblConfirmPasswordError.getText().isEmpty()) {
//            return;
//        }

        // Kiểm tra tài khoản đã tồn tại
        if (isUsernameTaken(username)) {
            JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kết nối cơ sở dữ liệu và thêm tài khoản
        if (addUserToDatabase(username, password, fullname, address)) {
            JOptionPane.showMessageDialog(this, "Đã tạo tài khoản.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không thể tạo tài khoản.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnTaoTKActionPerformed

    private boolean addUserToDatabase(String username, String password, String fullname, String address) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.conn;
        String query = "INSERT INTO employee (employee_id, password, fullname, address) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, hashPassword(password)); // Mã hóa mật khẩu
            stmt.setString(3, fullname);
            stmt.setString(4, address);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println("    Lỗi khi tạo tài khoản: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            dbConnection.closeConnection();
        }
    }

    private boolean isUsernameTaken(String username) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.conn;

        String query = "SELECT COUNT(*) FROM employee WHERE employee_id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi kiểm tra tài khoản: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }
        return false;
    }

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        openLoginPage(); // Gọi phương thức mở trang đăng nhập
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void jtfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFullNameActionPerformed

    private void jtfNhapLaiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNhapLaiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNhapLaiMatKhauActionPerformed

    private void cbHienThiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienThiMatKhauActionPerformed
        if (cbHienThiMatKhau.isSelected()) {
            jtfMatKhau.setEchoChar((char) 0);  // Hiển thị mật khẩu
            jtfNhapLaiMatKhau.setEchoChar((char) 0); //Hiển thị nhập lại mk
        } else {
            jtfMatKhau.setEchoChar('*');  // Ẩn mật khẩu
            jtfNhapLaiMatKhau.setEchoChar('*'); //Ẩn nhập lại mk
        }
    }//GEN-LAST:event_cbHienThiMatKhauActionPerformed

    private void openLoginPage() {
        // Tạo và hiển thị giao diện đăng nhập
        Login loginPage = new Login();
        loginPage.setVisible(true);
        this.dispose(); // Đóng cửa sổ đăng ký
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTaoTK;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox cbHienThiMatKhau;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jlbReEnterPasswordWarning;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JPasswordField jtfMatKhau;
    private javax.swing.JPasswordField jtfNhapLaiMatKhau;
    private javax.swing.JTextField jtfQueQuan;
    private javax.swing.JTextField jtfTaiKhoan;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    // End of variables declaration//GEN-END:variables
}
