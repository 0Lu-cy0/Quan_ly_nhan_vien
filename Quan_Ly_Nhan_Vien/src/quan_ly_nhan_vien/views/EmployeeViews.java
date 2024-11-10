package quan_ly_nhan_vien.views;

import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import quan_ly_nhan_vien.utils.HashPassword;

public class EmployeeViews extends javax.swing.JPanel {

    public EmployeeViews() {
        initComponents();
        hienthi(); // Thêm dòng này để hiển thị dữ liệu ngay khi khởi tạo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbEmployee = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbPhone = new javax.swing.JLabel();
        jbtThemNhanVien = new javax.swing.JButton();
        jbtXoaNhanVien = new javax.swing.JButton();
        jbtSuaNhanVien = new javax.swing.JButton();
        jbtLamMoi = new javax.swing.JButton();
        jdcDateOfBirth = new com.toedter.calendar.JDateChooser();
        jtffullname = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jcbbTimKiem = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Email", "Phone Number", "Address", "Date Of Birth", "Role"
            }
        ));
        jScrollPane2.setViewportView(jtbEmployee);

        j1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 250));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 86, -1));
        jPanel5.add(jtfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full name");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 100, -1));
        jPanel5.add(jtfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Of Birth");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 86, -1));
        jPanel5.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 52, 120, 25));
        jPanel5.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 15, 120, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 19, 86, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 52, 86, -1));

        jlbPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlbPhone.setForeground(new java.awt.Color(255, 255, 255));
        jlbPhone.setText("Phone number");
        jPanel5.add(jlbPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 93, 86, -1));

        jbtThemNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThemNhanVien.setText("Thêm");
        jbtThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtThemNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jbtXoaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtXoaNhanVien.setText("Xoá");
        jbtXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtXoaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jbtSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtSuaNhanVien.setText("Sửa");
        jbtSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtSuaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jbtLamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtLamMoi.setText("Làm mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel5.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));
        jPanel5.add(jdcDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, -1));
        jPanel5.add(jtffullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 25));

        j1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 540, 170));

        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });
        j1.add(jbtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jcbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Full Name", "Email", "Phone Number", "Address", "Date Of Birth", "Role" }));
        jcbbTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbTimKiemActionPerformed(evt);
            }
        });
        j1.add(jcbbTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, -1));

        jtfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimKiemKeyPressed(evt);
            }
        });
        j1.add(jtfTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemNhanVienActionPerformed
        try {
            // Lấy dữ liệu từ các trường nhập
            String id = jtfid.getText().trim();
            String ten = jtffullname.getText().trim();
            String email = jtfEmail.getText().trim();
            String address = jtfAddress.getText().trim();
            String phonenb = jtfPhone.getText().trim();

            // Debug: In ra thông tin đầu vào
            System.out.println("Thông tin nhập vào:");
            System.out.println("ID: " + id);
            System.out.println("Tên: " + ten);
            System.out.println("Email: " + email);
            System.out.println("Địa chỉ: " + address);
            System.out.println("Số điện thoại: " + phonenb);

            // Kiểm tra nếu các trường không được để trống
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (phonenb.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate email
            String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
            if (!email.matches(emailPattern)) {
                JOptionPane.showMessageDialog(this, "Email không đúng định dạng, vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate phone number (chỉ cho phép số, độ dài từ 10-11 chữ số)
            String phonePattern = "^[0-9]{10,11}$";
            if (!phonenb.matches(phonePattern)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng (chỉ gồm số và có độ dài 10-11 chữ số)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra ngày sinh
            Date ngaySinhDate = (Date) jdcDateOfBirth.getDate();
            if (ngaySinhDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate ngaySinh = ngaySinhDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int namSinh = ngaySinh.getYear();

            // Kiểm tra năm sinh trong khoảng từ 1950 đến 2008
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra xem email đã tồn tại trong cơ sở dữ liệu chưa
            String checkEmailSQL = "SELECT COUNT(*) FROM employees WHERE email = ?";
            Connection conn = new DatabaseConnection().getJDBCConnection();
            PreparedStatement psCheckEmail = conn.prepareStatement(checkEmailSQL);
            psCheckEmail.setString(1, email);
            ResultSet rsEmail = psCheckEmail.executeQuery();
            rsEmail.next();
            if (rsEmail.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Email này đã tồn tại, vui lòng chọn email khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                rsEmail.close();
                psCheckEmail.close();
                return;
            }
            rsEmail.close();
            psCheckEmail.close();

            // Kiểm tra xem số điện thoại đã tồn tại trong cơ sở dữ liệu chưa
            String checkPhoneSQL = "SELECT COUNT(*) FROM employees WHERE phone_number = ?";
            PreparedStatement psCheckPhone = conn.prepareStatement(checkPhoneSQL);
            psCheckPhone.setString(1, phonenb);

            ResultSet rsPhone = psCheckPhone.executeQuery();
            rsPhone.next();
            if (rsPhone.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại, vui lòng chọn số điện thoại khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                rsPhone.close();
                psCheckPhone.close();
                return;
            }
            rsPhone.close();
            psCheckPhone.close();

            // Mã hóa mật khẩu mặc định
            String defaultPassword = "88888888";
            String hashedPassword = HashPassword.hashPassword(defaultPassword);

            // Thực hiện câu lệnh SQL để thêm nhân viên vào bảng
            String sql = "INSERT INTO employees (employee_id, full_name, email, phone_number, address, date_of_birth) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, ten);
            ps.setString(3, email);
            ps.setString(4, phonenb);
            ps.setString(5, address);
            ps.setDate(6, java.sql.Date.valueOf(ngaySinh));

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");

                // Thêm dữ liệu vào bảng attendances
                String sqlChamCong = "INSERT INTO attendances (employee_id, day, status) VALUES (?, CURRENT_DATE, 'Chưa chấm')";
                PreparedStatement psChamCong = conn.prepareStatement(sqlChamCong);
                psChamCong.setString(1, id);
                psChamCong.executeUpdate();
                psChamCong.close();

                // Thêm tài khoản cho nhân viên vào bảng account với mật khẩu đã mã hóa
                String sqlAccount = "INSERT INTO accounts (employee_id, username, password, email) VALUES (?, ?, ?, ?)";
                PreparedStatement psAccount = conn.prepareStatement(sqlAccount);
                psAccount.setString(1, id);  // employee_id
                psAccount.setString(2, email);  // username
                psAccount.setString(3, hashedPassword);  // mật khẩu đã mã hóa
                psAccount.setString(4, email); // email
                psAccount.executeUpdate();
                psAccount.close();

            } else {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            // Đóng kết nối
            ps.close();
            conn.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại, vui lòng chọn mã nhân viên khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi SQL: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtThemNhanVienActionPerformed

    private void jbtXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaNhanVienActionPerformed
        int selectedRow = jtbEmployee.getSelectedRow();

        // Kiểm tra xem có dòng nào được chọn không
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy mô hình bảng và ID nhân viên
        DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
        Object employeeIdObj = model.getValueAt(selectedRow, 0); // Cột 0 chứa employee_id

        // Chuyển employeeId thành String
        String employeeId = (employeeIdObj instanceof Integer) ? String.valueOf(employeeIdObj) : (String) employeeIdObj;

        // Kiểm tra nếu employeeId là "Admin"
        if ("Admin".equalsIgnoreCase(employeeId)) {
            JOptionPane.showMessageDialog(this, "Không thể xóa tài khoản Admin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Xác nhận việc xóa
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa bản ghi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Các câu lệnh SQL để xóa các bản ghi liên quan theo employee_id
            String deleteAccountsSql = "DELETE FROM accounts WHERE employee_id = ?";
            String deleteSalariesSql = "DELETE FROM salaries WHERE employee_id = ?";
            String deleteAttendancesSql = "DELETE FROM attendance WHERE employee_id = ?";
            String deleteEmployeeSql = "DELETE FROM employees WHERE employee_id = ?";

            // Kết nối và thực hiện các câu lệnh xóa
            try (Connection conn = new DatabaseConnection().getJDBCConnection()) {
                conn.setAutoCommit(false); // Bắt đầu transaction

                // Xóa từ bảng accounts (bỏ qua nếu không tìm thấy)
                try (PreparedStatement psAccounts = conn.prepareStatement(deleteAccountsSql)) {
                    psAccounts.setString(1, employeeId);
                    psAccounts.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("Không tìm thấy employee_id trong bảng accounts, tiếp tục xóa...");
                }

                // Xóa từ bảng salaries (bỏ qua nếu không tìm thấy)
                try (PreparedStatement psSalaries = conn.prepareStatement(deleteSalariesSql)) {
                    psSalaries.setString(1, employeeId);
                    psSalaries.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("Không tìm thấy employee_id trong bảng salaries, tiếp tục xóa...");
                }

                // Xóa từ bảng attendance (bỏ qua nếu không tìm thấy)
                try (PreparedStatement psAttendances = conn.prepareStatement(deleteAttendancesSql)) {
                    psAttendances.setString(1, employeeId);
                    psAttendances.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("Không tìm thấy employee_id trong bảng attendance, tiếp tục xóa...");
                }

                // Xóa từ bảng employees
                try (PreparedStatement psEmployee = conn.prepareStatement(deleteEmployeeSql)) {
                    psEmployee.setString(1, employeeId);
                    int result = psEmployee.executeUpdate();

                    if (result > 0) {
                        conn.commit(); // Xác nhận transaction
                        JOptionPane.showMessageDialog(this, "Xóa thành công!");
                        model.removeRow(selectedRow); // Xóa dòng khỏi bảng
                    } else {
                        conn.rollback(); // Hoàn tác nếu xóa nhân viên không thành công
                        JOptionPane.showMessageDialog(this, "Xóa nhân viên không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    conn.rollback(); // Hoàn tác nếu có lỗi khi xóa
                    JOptionPane.showMessageDialog(this, "Lỗi khi xóa từ bảng employees: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtXoaNhanVienActionPerformed

    private void jbtSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaNhanVienActionPerformed
        int selectedRow = jtbEmployee.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy dữ liệu từ bảng
        DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
        String employeeId = model.getValueAt(selectedRow, 0).toString();
        String ten = (String) model.getValueAt(selectedRow, 1);
        String Email = (String) model.getValueAt(selectedRow, 2);
        String soDienThoai = (String) model.getValueAt(selectedRow, 3);
        String diaChi = (String) model.getValueAt(selectedRow, 4);
        String ngaySinh = (String) model.getValueAt(selectedRow, 5);
        String roleId = model.getValueAt(selectedRow, 6).toString(); // Lấy role_id

        // Tạo các trường để sửa thông tin
        JTextField txtEmployeeId = new JTextField(employeeId);
        txtEmployeeId.setEditable(false);  // Đặt chỉ đọc cho ô mã nhân viên
        JTextField txtTen = new JTextField(ten);
        JTextField txtEmail = new JTextField(Email);
        JTextField txtSoDienThoai = new JTextField(soDienThoai);
        JTextField txtDiaChi = new JTextField(diaChi);

        // Sử dụng JDateChooser để chọn ngày sinh
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");  // Định dạng ngày hiển thị cho người dùng
        try {
            if (ngaySinh != null && !ngaySinh.isEmpty()) {
                SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
                Date parsedDate = sdfInput.parse(ngaySinh);
                SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd");
                dateChooser.setDate(parsedDate); // Đặt lại ngày sinh đã được chuyển đổi
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Chọn role_id từ ComboBox
        JComboBox<String> cboRole = new JComboBox<>();
        cboRole.addItem("Admin");
        cboRole.addItem("Employee");
        cboRole.setSelectedItem(roleId);  // Chọn role hiện tại của nhân viên

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("Employee ID:"));
        panel.add(txtEmployeeId);
        panel.add(new JLabel("Full Name:"));
        panel.add(txtTen);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(new JLabel("Phone Number:"));
        panel.add(txtSoDienThoai);
        panel.add(new JLabel("Address:"));
        panel.add(txtDiaChi);
        panel.add(new JLabel("Date of Birth (dd/MM/yyyy):"));
        panel.add(dateChooser);
        panel.add(new JLabel("Role:"));
        panel.add(cboRole);

        int result = JOptionPane.showConfirmDialog(this, panel, "Sửa thông tin", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // Kiểm tra nếu Số điện thoại và Email trống
                String newSoDienThoai = txtSoDienThoai.getText().trim();
                String newEmail = txtEmail.getText().trim();

                if (newSoDienThoai.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (newEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập email!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Thiết lập các trường rỗng thành "N/A"
                String newTen = txtTen.getText().trim();
                String newNgaySinh = null;

                // Nếu người dùng đã chọn ngày mới trong JDateChooser, lấy giá trị đó
                if (dateChooser.getDate() != null) {
                    SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd");
                    newNgaySinh = sdfOutput.format(dateChooser.getDate()); // Chuyển ngày sang định dạng yyyy-MM-dd
                }
                String newDiaChi = txtDiaChi.getText().trim();
                String newRole = (String) cboRole.getSelectedItem();

                // Cập nhật dữ liệu vào bảng employees
                String sqlUpdateEmployee = "UPDATE employees SET full_name = ?, email = ?, phone_number = ?, address = ?, date_of_birth = ? WHERE employee_id = ?";
                try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement psEmployee = conn.prepareStatement(sqlUpdateEmployee)) {

                    psEmployee.setString(1, newTen);
                    psEmployee.setString(2, newEmail);
                    psEmployee.setString(3, newSoDienThoai);
                    psEmployee.setString(4, newDiaChi);
                    psEmployee.setString(5, newNgaySinh);  // Ngày đã được chuyển sang định dạng yyyy-MM-dd
                    psEmployee.setString(6, employeeId);
                    int updateResult = psEmployee.executeUpdate();

                    if (updateResult > 0) {
                        // Cập nhật dữ liệu trong bảng UI
                        model.setValueAt(newTen, selectedRow, 1);
                        model.setValueAt(newEmail, selectedRow, 2);
                        model.setValueAt(newSoDienThoai, selectedRow, 3);
                        model.setValueAt(newDiaChi, selectedRow, 4);
                        model.setValueAt(newNgaySinh, selectedRow, 5);
                        model.setValueAt(newRole, selectedRow, 6);  // Cập nhật role_id

                        // Cập nhật bảng accounts với role mới
                        String sqlUpdateRole = "UPDATE accounts SET role_id = ? WHERE employee_id = ?";
                        try (PreparedStatement psRole = conn.prepareStatement(sqlUpdateRole)) {
                            psRole.setString(1, newRole.equals("Admin") ? "1" : "2");
                            psRole.setString(2, employeeId);
                            psRole.executeUpdate();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Cập nhật không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin nhân viên: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtSuaNhanVienActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        hienthi();
        jtfid.setText("");
        jtffullname.setText("");
        jtfPhone.setText("");
        jdcDateOfBirth.setDate(null);
        jtfEmail.setText("");
        jtfAddress.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        String searchText = jtfTimKiem.getText().trim();
        String searchCriteria = jcbbTimKiem.getSelectedItem().toString();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!");
            return;
        }

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "";

            // Khởi tạo câu truy vấn dựa trên tiêu chí tìm kiếm
            if ("ID".equals(searchCriteria)) {
                try {
                    Integer.parseInt(searchText);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "EmployeeID phải là một số nguyên!");
                    return;
                }
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.employee_id = ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(searchText));
            } else if ("Full Name".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.full_name LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            } else if ("Phone Number".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.phone_number LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            } else if ("Email".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.email LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            } else if ("Address".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.address LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            }

            if (ps == null) {
                JOptionPane.showMessageDialog(this, "Tiêu chí tìm kiếm không hợp lệ.");
                return;
            }

            rs = ps.executeQuery();

            // Tạo model mới cho bảng với các cột yêu cầu
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"EmployeeID", "Full Name", "Email", "Phone Number", "Address", "Date of Birth", "Role"},
                    0
            );

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                int employeeId = rs.getInt("employee_id");
                String fullName = rs.getString("full_name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");

                // Kiểm tra và xử lý cột Address
                String address = rs.getString("address");
                address = (address != null) ? address : "N/A";

                Date dateOfBirth = rs.getDate("date_of_birth");
                String dob = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";

                // Xử lý cột Role
                int roleId = rs.getInt("role_id");
                String role = (roleId == 1) ? "Admin" : (roleId == 2) ? "Employee" : "N/A";

                // Thêm hàng vào model
                model.addRow(new Object[]{
                    employeeId, fullName, email, phoneNumber, address, dob, role
                });
            }

            jtbEmployee.setModel(model);

            // Kiểm tra nếu không có kết quả nào
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jcbbTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbTimKiemActionPerformed
        jtfTimKiem.setText("");
        jtfTimKiem.requestFocus();
    }//GEN-LAST:event_jcbbTimKiemActionPerformed

    private void jtfTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbtTimKiem.doClick();
        }
    }//GEN-LAST:event_jtfTimKiemKeyPressed

    public void hienthi() {
        try {
            // Lấy model của bảng và xóa dữ liệu cũ
            DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
            model.setRowCount(0);

            // Kết nối cơ sở dữ liệu
            Connection conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null) {
                System.out.println("Không thể kết nối database");
                JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            System.out.println("Kết nối database thành công");

            // Câu lệnh SQL để lấy dữ liệu từ bảng employees và accounts
            String sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                    + "FROM employees e "
                    + "LEFT JOIN accounts a ON e.employee_id = a.employee_id";
            PreparedStatement ps = conn.prepareStatement(sql);

            System.out.println("Câu lệnh SQL: " + ps.toString());

            // Thực thi câu truy vấn
            ResultSet rs = ps.executeQuery();

            int recordCount = 0;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            // Duyệt qua các bản ghi trong ResultSet
            while (rs.next()) {
                recordCount++;
                Vector<Object> row = new Vector<>();

                // Thêm các cột vào hàng
                row.add(rs.getInt("employee_id")); // Cột EmployeeID
                row.add(rs.getString("full_name")); // Cột Full Name
                row.add(rs.getString("email")); // Cột Email
                row.add(rs.getString("phone_number")); // Cột Phone Number

                // Kiểm tra và xử lý cột Address
                String address = rs.getString("address");
                row.add(address != null ? address : "N/A"); // Nếu address không null thì hiển thị giá trị của address, nếu null thì hiển thị "N/A"

                // Xử lý ngày sinh (Date of Birth)
                Date dob = rs.getDate("date_of_birth");
                row.add(dob != null ? sdf.format(dob) : "N/A");

                // Lấy giá trị Role từ role_id
                int roleId = rs.getInt("role_id");
                row.add(roleId == 0 ? "N/A" : roleId); // Nếu role_id không có thì hiển thị "N/A"

                // Thêm hàng vào model
                model.addRow(row);
            }

            // Kiểm tra nếu không có dữ liệu nào để hiển thị
            if (recordCount == 0) {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu nào để hiển thị.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

            // Đóng các kết nối
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel j1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JButton jbtSuaNhanVien;
    private javax.swing.JButton jbtThemNhanVien;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoaNhanVien;
    private javax.swing.JComboBox<String> jcbbTimKiem;
    private com.toedter.calendar.JDateChooser jdcDateOfBirth;
    private javax.swing.JLabel jlbPhone;
    private javax.swing.JTable jtbEmployee;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfTimKiem;
    private javax.swing.JTextField jtffullname;
    private javax.swing.JTextField jtfid;
    // End of variables declaration//GEN-END:variables
}
