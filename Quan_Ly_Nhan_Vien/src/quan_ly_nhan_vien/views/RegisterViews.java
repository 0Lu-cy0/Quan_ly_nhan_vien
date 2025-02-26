package quan_ly_nhan_vien.views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import quan_ly_nhan_vien.utils.HashPassword;

public class RegisterViews extends javax.swing.JFrame {

    public RegisterViews() {
        initComponents();
        setUpFrame();
        applyFilters();
        applyUsernameFilter();
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

        btnDangNhap.setBackground(new java.awt.Color(0, 102, 102));
        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 90, 40));

        BtnTaoTK.setBackground(new java.awt.Color(0, 102, 102));
        BtnTaoTK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTaoTK.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Thiết lập khung giao diện (không thay đổi kích thước, căn giữa, đặt tiêu đề)

    private void setUpFrame() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Đăng ký");
    }

    // Thêm lắng nghe sự thay đổi trên các trường nhập liệu
    private void addDocumentListeners() {
        JTextComponent[] fields = {jtfEmail, jtfSoDienThoai, jtfTaiKhoan, jtfFullName, jtfMatKhau, jtfNhapLaiMatKhau};
        for (JTextComponent field : fields) {
            addDocumentListener(field, this::validateFields);
        }
    }

    // Phương thức tiện ích để thêm DocumentListener cho các JTextComponent
    private void addDocumentListener(JTextComponent textComponent, Runnable checkMethod) {
        textComponent.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                checkMethod.run();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                checkMethod.run();
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                checkMethod.run();
            }
        });
    }

    // Kiểm tra hợp lệ các trường dữ liệu trên giao diện
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

    // Kiểm tra hợp lệ định dạng email
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
        if (!email.matches(emailRegex)) {//Kiểm tra xem chuỗi email có khớp với biểu thức chính quy hay không.
            errors.add("Email không đúng định dạng.");
        }
        return errors;
    }

    // Kiểm tra định dạng số điện thoại
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

    // Kiểm tra độ mạnh của mật khẩu
    private void validatePasswordStrength(String password) {
        List<String> errors = validatePassword(password);
        if (!errors.isEmpty()) {
            lblPasswordError.setText("<html>" + String.join("<br>", errors) + "</html>");
        } else {
            lblPasswordError.setText("");
        }
    }

    // Xác thực mật khẩu với các tiêu chí mạnh (số, chữ hoa, chữ thường, ký tự đặc biệt, độ dài)
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

    // Xử lý sự kiện khi người dùng nhấn nút Tạo tài khoản
    private void BtnTaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTaoTKActionPerformed
        String username = jtfTaiKhoan.getText().trim();
        String password = new String(jtfMatKhau.getPassword()).trim();
        String confirmPassword = new String(jtfNhapLaiMatKhau.getPassword()).trim();
        String fullname = jtfFullName.getText().trim();
        String email = jtfEmail.getText().trim();
        String phoneNumber = jtfSoDienThoai.getText().trim();

        validateFields();

        if (!lblNameError.getText().isEmpty() || !lbEmailError.getText().isEmpty()
                || !lbPhoneError.getText().isEmpty() || !lblPasswordError.getText().isEmpty()
                || !lblConfirmPasswordError.getText().isEmpty()) {
            return;
        }
        registerUser(username, password, fullname, email, phoneNumber);
    }//GEN-LAST:event_BtnTaoTKActionPerformed

    public boolean registerUser(String username, String password, String fullname, String email, String phoneNumber) {

        if (isUsernameTaken(username)) {
            showMessage("Tài khoản đã tồn tại.", "Lỗi");
            return false;
        } else if (isPhoneNumberTaken(phoneNumber)) {
            showMessage("Số điện thoại đã tồn tại.", "Lỗi");
            return false;
        } else if (isEmailTaken(email)) {
            showMessage("Email đã tồn tại.", "Lỗi");
            return false;
        }

        // Mã hóa mật khẩu
        String hashedPassword = HashPassword.hashPassword(password);

        // Thay vì sử dụng registerModel, bạn truyền trực tiếp các tham số vào addUserToDatabase
        if (addUserToDatabase(username, hashedPassword, fullname, email, phoneNumber)) {
            showMessage("Tạo tài khoản thành công!", "Thành công");
            return true;
        } else {
            showMessage("Không thể tạo tài khoản.", "Lỗi");
            return false;
        }
    }

    public boolean isUsernameTaken(String username) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
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

    public boolean isPhoneNumberTaken(String phoneNumber) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();

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
            conn = new DatabaseConnection().getJDBCConnection();
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

    public boolean addUserToDatabase(String username, String password, String fullname, String email, String phoneNumber) {
        Connection conn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        ResultSet generatedKeys = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
            conn.setAutoCommit(false);

            // Thêm employee
            String employeeQuery = "INSERT INTO Employees (full_name, email, phone_number) VALUES (?, ?, ?)";
            stmt1 = conn.prepareStatement(employeeQuery, Statement.RETURN_GENERATED_KEYS);
            stmt1.setString(1, fullname);
            stmt1.setString(2, email);
            stmt1.setString(3, phoneNumber);
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
            stmt2.setString(2, username);
            stmt2.setString(3, password);
            stmt2.setString(4, email);
            stmt2.executeUpdate();

            // Thêm bản ghi vào bảng attendances với giá trị mặc định
            String attendanceQuery = "INSERT INTO attendances (employee_id, day, status) VALUES (?, CURRENT_DATE, 'Chưa chấm')";
            stmt3 = conn.prepareStatement(attendanceQuery);
            stmt3.setInt(1, employeeId);
            stmt3.executeUpdate();

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

    // Hiển thị thông báo cho người dùng
    public void showMessage(String message, String title) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    //Mở trang đăng nhập
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        new LoginViews().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    //Chỉ cho phép nhập vào số dành cho số điện thoại
    public class NumberFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            processInput(fb, offset, 0, string, attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            processInput(fb, offset, length, text, attrs);
        }

        private void processInput(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text != null && text.matches("[0-9]+")) {
                if (length > 0) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    super.insertString(fb, offset, text, attrs);
                }
            }
        }
    }

    //Chỉ cho phép nhập chữ và số cho tên tài khoản
    public class UsernameFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            processInput(fb, offset, 0, string, attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            processInput(fb, offset, length, text, attrs);
        }

        private void processInput(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            // Chỉ cho phép chữ và số, không cho phép ký tự đặc biệt
            if (text != null && text.matches("[a-zA-Z0-9]+")) {
                if (length > 0) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    super.insertString(fb, offset, text, attrs);
                }
            }
        }
    }

    //Bộ lọc số diện thoại
    private void applyFilters() {
        PlainDocument doc = (PlainDocument) jtfSoDienThoai.getDocument();
        doc.setDocumentFilter(new NumberFilter());
    }

    //Bộ lọc tên tài khoản
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTaoTK;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox cbHienThiMatKhau;
    private javax.swing.JLabel jLabel11;
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
