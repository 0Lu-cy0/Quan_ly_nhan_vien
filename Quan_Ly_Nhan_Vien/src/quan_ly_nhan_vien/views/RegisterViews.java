package quan_ly_nhan_vien.views;

import java.sql.Statement;
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
        setUpFrame();
        applyFilters();
        addDocumentListeners();
        jtfFullName.addActionListener(evt -> jtfEmail.requestFocus());
        jtfEmail.addActionListener(evt -> jtfSoDienThoai.requestFocus());
        jtfSoDienThoai.addActionListener(evt -> jtfTaiKhoan.requestFocus());
        jtfTaiKhoan.addActionListener(evt -> jtfMatKhau.requestFocus());
        jtfMatKhau.addActionListener(evt -> jtfNhapLaiMatKhau.requestFocus());
        jtfNhapLaiMatKhau.addActionListener(evt -> BtnTaoTKActionPerformed(null));

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
        lblNameError = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        lbEmailError = new javax.swing.JLabel();
        jtfSoDienThoai = new javax.swing.JTextField();
        lbPhoneError = new javax.swing.JLabel();
        jtfTaiKhoan = new javax.swing.JTextField();
        lbLoiTaiKhoan = new javax.swing.JLabel();
        jtfMatKhau = new javax.swing.JPasswordField();
        cbHienThiMatKhau = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jtfNhapLaiMatKhau = new javax.swing.JPasswordField();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
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
        jPanel5.add(jtfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 29, 452, 50));

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, -1));

        jtfEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 97, 452, 50));

        lbEmailError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lbEmailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 450, -1));

        jtfSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfSoDienThoai.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Số điện thoại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jtfSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 165, 452, 50));

        lbPhoneError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lbPhoneError, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, 440, -1));

        jtfTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfTaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Tài khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jtfTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 233, 452, 50));

        lbLoiTaiKhoan.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lbLoiTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 430, -1));

        jtfMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jtfMatKhau.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mật khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.add(jtfMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 301, 452, 50));

        cbHienThiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbHienThiMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        cbHienThiMatKhau.setText("Hiển thị");
        cbHienThiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienThiMatKhauActionPerformed(evt);
            }
        });
        jPanel5.add(cbHienThiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 355, -1, -1));

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
        jPanel3.add(jtfNhapLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 452, 50));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 368, 460, 58));

        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblConfirmPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 427, 440, -1));

        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 340, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 450));

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(0, 102, 102));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 90, 40));

        BtnTaoTK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTaoTK.setForeground(new java.awt.Color(0, 102, 102));
        BtnTaoTK.setText("Tạo tài khoản");
        BtnTaoTK.setBorder(null);
        BtnTaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTaoTKActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTaoTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 100, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 20));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 470, 130));

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

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setUpFrame() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Đăng ký");
    }

    private void addDocumentListeners() {
        JTextComponent[] fields = {jtfEmail, jtfSoDienThoai, jtfTaiKhoan, jtfFullName, jtfMatKhau, jtfNhapLaiMatKhau};
        for (JTextComponent field : fields) {
            addDocumentListener(field, this::validateFields);
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

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    private void validateFields() {
        String username = jtfTaiKhoan.getText().trim();
        String password = new String(jtfMatKhau.getPassword()).trim();
        String confirmPassword = new String(jtfNhapLaiMatKhau.getPassword()).trim();
        String fullname = jtfFullName.getText().trim();
        String email = jtfEmail.getText().trim();
        String phoneNumber = jtfSoDienThoai.getText().trim();

        lblNameError.setText(fullname.isEmpty() ? "Vui lòng nhập tên." : "");
        lbEmailError.setText(email.isEmpty() ? "Vui lòng nhập email." : "");
        if (!email.isEmpty()) {
            validateEmailStrength(email);
        }
        lbPhoneError.setText(phoneNumber.isEmpty() ? "Vui lòng nhập số điện thoại" : "");
        if (!phoneNumber.isEmpty()) {
            validatePhoneNumberStrength(phoneNumber);
        }
        lbLoiTaiKhoan.setText(username.isEmpty() ? "Vui lòng nhập tài khoản." : "");
        lblPasswordError.setText(password.isEmpty() ? "Vui lòng nhập mật khẩu." : "");
        lblConfirmPasswordError.setText(!password.equals(confirmPassword) ? "Mật khẩu không khớp." : "");

        if (!password.isEmpty()) {
            validatePasswordStrength(password);
        }
    }

    private void validateEmailStrength(String email) {
        List<String> errors = validateEmail(email);
        if (!errors.isEmpty()) {
            lbEmailError.setText("<html>" + String.join("<br>", errors) + "</html>");
        } else {
            lbEmailError.setText("");
        }
    }

    // Phương thức kiểm tra email hợp lệ
    private List<String> validateEmail(String email) {
        List<String> errors = new ArrayList<>();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{3,6}$";
        if (!email.matches(emailRegex)) {
            errors.add("Email không đúng định dạng.");
        }
        return errors;
    }

    private void validatePhoneNumberStrength(String phoneNumber) {
        List<String> errors = validatePhoneNumber(phoneNumber);
        if (!errors.isEmpty()) {
            lbPhoneError.setText("<html>" + String.join("<br>", errors) + "</html>");
        } else {
            lbPhoneError.setText("");
        }
    }

    // Phương thức kiểm tra số điện thoại hợp lệ
    private List<String> validatePhoneNumber(String phoneNumber) {
        List<String> errors = new ArrayList<>();
        if (!phoneNumber.matches("\\d{10,11}")) {
            errors.add("Số điện thoại phải có 10-11 chữ số.");
        }
        return errors;
    }

    private void validatePasswordStrength(String password) {
        List<String> errors = validatePassword(password);
        if (!errors.isEmpty()) {
            lblPasswordError.setText("<html>" + String.join("<br>", errors) + "</html>");
        } else {
            lblPasswordError.setText("");
        }
    }

    private List<String> validatePassword(String password) {
        List<String> errors = new ArrayList<>();
        if (!password.matches(".*\\d.*")) {
            errors.add("Mật khẩu cần ít nhất một chữ số.");
        }
        if (!password.matches(".*[a-z].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự chữ thường.");
        }
        if (!password.matches(".*[A-Z].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự chữ hoa.");
        }
        if (!password.matches(".*[@$!%*?&].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự đặc biệt.");
        }
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
        String email = jtfEmail.getText().trim(); // Thêm ô nhập email
        String phoneNumber = jtfSoDienThoai.getText().trim(); // Thêm ô nhập số điện thoại

        // Validate các trường
        validateFields();

        // Nếu có lỗi, không thực hiện tiếp
        if (!lblNameError.getText().isEmpty() || !lbEmailError.getText().isEmpty()
                || !lbPhoneError.getText().isEmpty() || !lblPasswordError.getText().isEmpty()
                || !lblConfirmPasswordError.getText().isEmpty()) {
            return;
        }

        // Kiểm tra tài khoản, số điện thoại và email đã tồn tại
        if (isUsernameTaken(username)) {
            JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (isPhoneNumberTaken(phoneNumber)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (isEmailTaken(email)) {
            JOptionPane.showMessageDialog(this, "Email đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kết nối cơ sở dữ liệu và thêm tài khoản
        if (addUserToDatabase(username, password, fullname, email, phoneNumber)) {
            JOptionPane.showMessageDialog(this, "Tạo tài khoản thành công!.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không thể tạo tài khoản.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnTaoTKActionPerformed

    private void showMessage(String message, String title) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    //Thêm thông tin nhân viên vào bảng employees và bảng accounts sau khi tạo tài khoản
    private boolean addUserToDatabase(String username, String password, String fullname, String email, String phoneNumber) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        String accountQuery = "INSERT INTO Accounts (employee_id, username, password) VALUES (?, ?, ?)";
        String employeeQuery = "INSERT INTO Employees (full_name, email, phone_number) VALUES (?, ?, ?)";

        Connection conn = null; // Khai báo conn ở đây để có thể sử dụng trong catch

        try {
            conn = dbConnection.getJDBCConnection();
            conn.setAutoCommit(false); // Tắt tự động commit

            // Thêm vào bảng Employees
            int employeeId = -1; // Khai báo để lưu employee_id
            try (PreparedStatement stmt1 = conn.prepareStatement(employeeQuery, Statement.RETURN_GENERATED_KEYS)) {
                stmt1.setString(1, fullname);
                stmt1.setString(2, email);
                stmt1.setString(3, phoneNumber);
                stmt1.executeUpdate();

                // Lấy employee_id vừa được sinh ra
                try (ResultSet generatedKeys = stmt1.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        employeeId = generatedKeys.getInt(1); // Lấy employee_id
                    } else {
                        throw new SQLException("Không thể lấy employee_id.");
                    }
                }
            }

            // Thêm vào bảng Accounts
            try (PreparedStatement stmt2 = conn.prepareStatement(accountQuery)) {
                stmt2.setInt(1, employeeId); // Sử dụng employee_id
                stmt2.setString(2, username);
                stmt2.setString(3, hashPassword(password)); // Mã hóa mật khẩu
                stmt2.executeUpdate();
            }

            // Nếu cả hai truy vấn thành công, commit
            conn.commit();
            return true;
        } catch (SQLException ex) {
            System.out.println("Lỗi khi tạo tài khoản: " + ex.getMessage());
            ex.printStackTrace();
            try {
                // Nếu có lỗi, rollback
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        } finally {
            // Đảm bảo đóng kết nối
            if (conn != null) {
                try {
                    conn.close(); // Đóng kết nối
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Kiểm tra tài khoản có tồn tại hay không
    private boolean isUsernameTaken(String username) {
        DatabaseConnection dbConnection = new DatabaseConnection();
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

    //Kiểm tra số điện thoại có tồm tại hay không ?
    private boolean isPhoneNumberTaken(String phoneNumber) {
        DatabaseConnection dbConnection = new DatabaseConnection();
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

    //Kiểm tra email có tồn tại hay không 
    private boolean isEmailTaken(String email) {
        DatabaseConnection dbConnection = new DatabaseConnection();
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

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        openLoginPage();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void openLoginPage() {
        new Login().setVisible(true);
        this.dispose();
    }

    //Chỉ cho phép nhập vào số dành cho số điện thoại
    public class NumberFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (isValidNumber(string)) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (isValidNumber(text)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
            super.remove(fb, offset, length);
        }

        private boolean isValidNumber(String string) {
            return string != null && string.matches("[0-9]+");
        }
    }

    private void applyFilters() {
        PlainDocument doc = (PlainDocument) jtfSoDienThoai.getDocument();
        doc.setDocumentFilter(new NumberFilter());
    }

    //Chỉ cho phép nhập các ký tự 0-9, A-Z
    public class UsernameFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (isValidUsername(string)) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (isValidUsername(text)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        private boolean isValidUsername(String string) {
            // Chỉ cho phép chữ cái và số
            return string != null && string.matches("[a-zA-Z0-9]+");
        }
    }

    private void applyUsernameFilter() {
        PlainDocument doc = (PlainDocument) jtfTaiKhoan.getDocument();
        doc.setDocumentFilter(new UsernameFilter());
    }

    private void jtfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFullNameActionPerformed
    }//GEN-LAST:event_jtfFullNameActionPerformed

    private void jtfNhapLaiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNhapLaiMatKhauActionPerformed
    }//GEN-LAST:event_jtfNhapLaiMatKhauActionPerformed

    private void cbHienThiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienThiMatKhauActionPerformed
        if (cbHienThiMatKhau.isSelected()) {
            jtfMatKhau.setEchoChar((char) 0);  // Hiển thị mật khẩu
            jtfNhapLaiMatKhau.setEchoChar((char) 0);
        } else {
            jtfMatKhau.setEchoChar('*');  // Ẩn mật khẩu
            jtfNhapLaiMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cbHienThiMatKhauActionPerformed

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
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JPasswordField jtfMatKhau;
    private javax.swing.JPasswordField jtfNhapLaiMatKhau;
    private javax.swing.JTextField jtfSoDienThoai;
    private javax.swing.JTextField jtfTaiKhoan;
    private javax.swing.JLabel lbEmailError;
    private javax.swing.JLabel lbLoiTaiKhoan;
    private javax.swing.JLabel lbPhoneError;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    // End of variables declaration//GEN-END:variables
}
