package quan_ly_nhan_vien.views;

import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class EmployeeViews extends javax.swing.JPanel {

    public EmployeeViews() {
        initComponents();
        setupTable();
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
        jtfFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtRule = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtThemNhanVien = new javax.swing.JButton();
        jbtXoaNhanVien = new javax.swing.JButton();
        jbtSuaNhanVien = new javax.swing.JButton();
        jbtLamMoi = new javax.swing.JButton();
        jdcDateOfBirth = new com.toedter.calendar.JDateChooser();
        jbtPhoneNumber = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jcbbTimKiem = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Email", "Phone Number", "Address", "Date Of Birth", "Role"
            }
        ));
        jScrollPane2.setViewportView(jtbEmployee);

        j1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 260));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Full Name");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 86, -1));
        jPanel5.add(jtfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 15, 120, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone Number");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 100, -1));
        jPanel5.add(jbtRule, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Of Birth");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 86, -1));
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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Role");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 93, 86, -1));

        jbtThemNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThemNhanVien.setText("Thêm");
        jbtThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtThemNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jbtXoaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtXoaNhanVien.setText("Xoá");
        jbtXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtXoaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jbtSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtSuaNhanVien.setText("Sửa");
        jbtSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtSuaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jbtLamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtLamMoi.setText("Làm mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel5.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));
        jPanel5.add(jdcDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 90, 120, -1));
        jPanel5.add(jbtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 120, 25));

        j1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 540, 170));

        jbtTimKiem.setText("Tìm kiếm");
        j1.add(jbtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jcbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Email", "Phone Number", "Address", "Date Of Birth", "Role" }));
        j1.add(jcbbTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, -1));
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
            String id = jtfFullName.getText().trim();
            String ten = jbtRule.getText().trim();
            String cv = jtfEmail.getText().trim();
            String dc = jtfAddress.getText().trim();

            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tài khoản không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Date ngaySinhDate = (Date) jdcDateOfBirth.getDate();
            if (ngaySinhDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate ngaySinh = ngaySinhDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            int namSinh = ngaySinh.getYear();
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Câu lệnh SQL thêm nhân viên vào database
            String sql = "INSERT INTO employee (employee_id, fullname, date_of_birth, job_title, address, password) VALUES (?, ?, ?, ?, ?, ?)";
            Connection conn = new DatabaseConnection().getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, ten);
            ps.setDate(3, java.sql.Date.valueOf(ngaySinh));
            ps.setString(4, cv);
            ps.setString(5, dc);

            int result = ps.executeUpdate();
            if (result > 0) {
                // Chỉ thêm dữ liệu vào bảng sau khi thêm vào database thành công
                DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();

                JOptionPane.showMessageDialog(this, "Thêm thành công!");

                // Cập nhật lại bảng
                hienthi();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            ps.close();
            conn.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { // Mã lỗi cho trường hợp trùng lặp trong MySQL
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại, vui lòng chọn mã nhân viên khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (ex.getErrorCode() == 1406) { // Mã lỗi cho trường hợp dữ liệu quá dài
                JOptionPane.showMessageDialog(this, "Dữ liệu quá dài, vui lòng rút ngắn thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi SQL: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtThemNhanVienActionPerformed

    private void jbtXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaNhanVienActionPerformed
        int selectedRow = jtbEmployee.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
        String employeeId = (String) model.getValueAt(selectedRow, 0);

        // Kiểm tra xem employeeId có phải là "Admin" không
        if ("Admin".equals(employeeId)) {
            JOptionPane.showMessageDialog(this, "Không thể xóa tài khoản Admin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa bản ghi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Connection conn = new DatabaseConnection().getJDBCConnection();
            try {

                // Bắt đầu transaction
                conn.setAutoCommit(false); // Tắt tự động cam kết

                // Xóa các bản ghi trong bảng attendance liên quan đến employee
                String deleteAttendanceSql = "DELETE FROM attendance WHERE employee_id = ?";
                PreparedStatement psDeleteAttendance = conn.prepareStatement(deleteAttendanceSql);
                psDeleteAttendance.setString(1, employeeId);
                psDeleteAttendance.executeUpdate();

                // Xóa các bản ghi trong bảng benefits liên quan đến employee
                String deleteBenefitsSql = "DELETE FROM benefits WHERE employee_id = ?";
                PreparedStatement psDeleteBenefits = conn.prepareStatement(deleteBenefitsSql);
                psDeleteBenefits.setString(1, employeeId);
                psDeleteBenefits.executeUpdate();

                // Xóa các bản ghi trong bảng salary liên quan đến employee
                String deleteSalarySql = "DELETE FROM salary WHERE employee_id = ?";
                PreparedStatement psDeleteSalary = conn.prepareStatement(deleteSalarySql);
                psDeleteSalary.setString(1, employeeId);
                psDeleteSalary.executeUpdate();

                String sql = "DELETE FROM employee WHERE employee_id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, employeeId);

                int result = ps.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    model.removeRow(selectedRow);  // Xóa dòng đã chọn trong bảng
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                // Cam kết transaction
                conn.commit();

                ps.close();
                psDeleteAttendance.close();
                psDeleteBenefits.close();
                psDeleteSalary.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                // Nếu có lỗi xảy ra, rollback transaction
                try {
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jbtXoaNhanVienActionPerformed

    private void jbtSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaNhanVienActionPerformed
        int selectedRow = jtbEmployee.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
        String employeeId = (String) model.getValueAt(selectedRow, 0);
        String ten = (String) model.getValueAt(selectedRow, 1);
        String ngaySinh = (String) model.getValueAt(selectedRow, 2);
        String chucVu = (String) model.getValueAt(selectedRow, 3);
        String diaChi = (String) model.getValueAt(selectedRow, 4);
        String matKhau = (String) model.getValueAt(selectedRow, 5);

        JTextField txtEmployeeId = new JTextField(employeeId);
        txtEmployeeId.setEditable(false);  // Đặt chỉ đọc cho ô mã nhân viên
        JTextField txtTen = new JTextField(ten);

        // Sử dụng JDateChooser thay thế JTextField để chọn ngày
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");  // Đặt định dạng ngày tháng

        // Nếu ngày sinh không rỗng, đặt giá trị ban đầu cho JDateChooser
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if (ngaySinh != null && !ngaySinh.isEmpty()) {
                dateChooser.setDate(sdf.parse(ngaySinh));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JTextField txtChucVu = new JTextField(chucVu);
        JTextField txtDiaChi = new JTextField(diaChi);
        JTextField txtMatKhau = new JTextField(matKhau);

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("ID Nhân viên:"));
        panel.add(txtEmployeeId);
        panel.add(new JLabel("Họ và tên:"));
        panel.add(txtTen);
        panel.add(new JLabel("Ngày sinh (dd/MM/yyyy):"));
        panel.add(dateChooser);  // Thêm JDateChooser vào panel thay cho JTextField
        panel.add(new JLabel("Chức vụ:"));
        panel.add(txtChucVu);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(txtDiaChi);
        panel.add(new JLabel("Mật khẩu:"));
        panel.add(txtMatKhau);

        int result = JOptionPane.showConfirmDialog(this, panel, "Sửa thông tin", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // Thiết lập các trường rỗng thành "N/A"
                String newTen = txtTen.getText().trim().isEmpty() ? "N/A" : txtTen.getText();
                String newNgaySinh = ngaySinh;
                String newChucVu = txtChucVu.getText().trim().isEmpty() ? "N/A" : txtChucVu.getText();
                String newDiaChi = txtDiaChi.getText().trim().isEmpty() ? "N/A" : txtDiaChi.getText();
                String newMatKhau = txtMatKhau.getText().trim().isEmpty() ? "N/A" : txtMatKhau.getText();

                // Nếu người dùng đã chọn ngày mới trong JDateChooser, lấy giá trị đó
                if (dateChooser.getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    newNgaySinh = sdf.format(dateChooser.getDate());
                }

                String sql = "UPDATE employee SET fullname = ?, date_of_birth = ?, job_title = ?, address = ?, password = ? WHERE employee_id = ?";
                Connection conn = new DatabaseConnection().getJDBCConnection();
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, newTen);

                // Nếu newNgaySinh không phải là "N/A", thì mới thực hiện chuyển đổi và định dạng ngày tháng
                if (!newNgaySinh.equals("N/A")) {
                    try {
                        ps.setDate(2, java.sql.Date.valueOf(LocalDate.parse(newNgaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                    } catch (DateTimeParseException e) {
                        JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ! Vui lòng nhập theo định dạng dd/MM/yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    ps.setString(2, null);  // Nếu để trống hoặc là "N/A", thì giữ giá trị ngày sinh như cũ
                }

                ps.setString(3, newChucVu);
                ps.setString(4, newDiaChi);
                ps.setString(5, newMatKhau);
                ps.setString(6, employeeId);

                int updateResult = ps.executeUpdate();

                if (updateResult > 0) {
                    model.setValueAt(newTen, selectedRow, 1);
                    model.setValueAt(newNgaySinh, selectedRow, 2);
                    model.setValueAt(newChucVu, selectedRow, 3);
                    model.setValueAt(newDiaChi, selectedRow, 4);
                    model.setValueAt(newMatKhau, selectedRow, 5);

                    JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                ps.close();
                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtSuaNhanVienActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        hienthi();
        jtfFullName.setText("");
        jbtRule.setText("");
        jdcDateOfBirth.setDate(null);
        jtfEmail.setText("");
        jtfAddress.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    public void hienthi() {
        try {
            DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
            model.setRowCount(0); // Xóa dữ liệu cũ

            Connection conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null) {
                System.out.println("Không thể kết nối database");
                JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            System.out.println("Kết nối database thành công");

            String sql = "SELECT CONCAT(e.employee_id, ' - ', e.full_name) AS employee_info, " +
             "e.email, e.phone_number, e.address, e.date_of_birth, a.role_id " +
             "FROM employees e " +
             "LEFT JOIN accounts a ON e.employee_id = a.employee_id";
            PreparedStatement ps = conn.prepareStatement(sql);

            System.out.println("Câu lệnh SQL: " + ps.toString());

            ResultSet rs = ps.executeQuery();

            int recordCount = 0;
            while (rs.next()) {
                recordCount++;
                Vector<Object> row = new Vector<>();
                row.add(rs.getString("employee_info"));
                row.add(rs.getString("email"));
                row.add(rs.getString("phone_number"));
                row.add(rs.getString("address"));

                // Xử lý ngày sinh
                Date dob = rs.getDate("date_of_birth");
                row.add(dob != null ? new SimpleDateFormat("dd/MM/yyyy").format(dob) : "N/A");

                // Thêm role_id
                row.add(rs.getString("role_id"));

                model.addRow(row);
            }

            System.out.println("Số lượng bản ghi đã thêm vào bảng: " + recordCount);

            if (recordCount == 0) {
                System.out.println("Không có dữ liệu nào được trả về từ cơ sở dữ liệu.");
                JOptionPane.showMessageDialog(this, "Không có dữ liệu nào để hiển thị.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Thêm phương thức setupTable()
    private void setupTable() {
        // Cấu hình các cột cho bảng
        String[] columnNames = {"EmployeeID", "Email", "Phone Number",
            "Address", "Date Of Birth", "Role"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép edit trực tiếp trên bảng
            }
        };
        jtbEmployee.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel j1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JTextField jbtPhoneNumber;
    private javax.swing.JTextField jbtRule;
    private javax.swing.JButton jbtSuaNhanVien;
    private javax.swing.JButton jbtThemNhanVien;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoaNhanVien;
    private javax.swing.JComboBox<String> jcbbTimKiem;
    private com.toedter.calendar.JDateChooser jdcDateOfBirth;
    private javax.swing.JTable jtbEmployee;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}
