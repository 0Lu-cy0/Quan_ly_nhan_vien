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
        jtfid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtRule = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfphone = new javax.swing.JLabel();
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
                "ID", "FullName", "Phone Number", "Address", "Date Of Birth", "Email"
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
        jPanel5.add(jbtRule, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 25));

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

        jtfphone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfphone.setForeground(new java.awt.Color(255, 255, 255));
        jtfphone.setText("Phone number");
        jPanel5.add(jtfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 93, 86, -1));

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
            String id = jtfid.getText().trim();
            String ten = jtffullname.getText(); 
            String email = jtfEmail.getText();   
            String address = jtfAddress.getText();  
            String phonenb = jtfphone.getText();
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Date ngaySinhDate = (Date) jdcDateOfBirth.getDate();
            if (ngaySinhDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate ngaySinh = ngaySinhDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int namSinh = ngaySinh.getYear();
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO employees (employee_id, full_name, email, phone_number, address, date_of_birth) VALUES (?, ?, ?, ?, ?, ?)";
            Connection conn = new DatabaseConnection().getJDBCConnection();
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
                String sqlChamCong = "INSERT INTO attendances (employee_id, day, status) VALUES (?, CURRENT_DATE, 'Chưa chấm')";
                PreparedStatement psChamCong = conn.prepareStatement(sqlChamCong);
                psChamCong.setString(1, id);
                psChamCong.executeUpdate();
                psChamCong.close();
                
                String sqlTinhLuong = "INSERT INTO salaries (employee_id) VALUES (?)";
                PreparedStatement psTinhLuong = conn.prepareStatement(sqlTinhLuong); 
                psTinhLuong.setString(1, id);
                psTinhLuong.executeUpdate();
                psTinhLuong.close();
                hienthi(); 
            } else {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            ps.close();
            conn.close();
    } catch (SQLException ex) {
        if (ex.getErrorCode() == 1062) { // Lỗi trùng mã nhân viên
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

    // Kiểm tra nếu employeeId là Integer, chuyển nó thành String
    String employeeId = (employeeIdObj instanceof Integer) ? String.valueOf(employeeIdObj) : (String) employeeIdObj;

    // Kiểm tra không xóa tài khoản Admin
    if ("Admin".equalsIgnoreCase(employeeId)) {
        JOptionPane.showMessageDialog(this, "Không thể xóa tài khoản Admin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Xác nhận việc xóa
    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa bản ghi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Câu lệnh SQL xóa nhân viên theo employee_id
        String sql = "DELETE FROM employees WHERE employee_id = ?";
        
        // Kết nối và thực hiện câu lệnh xóa
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, employeeId);  // Gán ID nhân viên cần xóa
            int result = ps.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                model.removeRow(selectedRow);  // Xóa dòng khỏi bảng
            } else {
                JOptionPane.showMessageDialog(this, "Xóa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jbtXoaNhanVienActionPerformed

    private void jbtSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaNhanVienActionPerformed
        
    }//GEN-LAST:event_jbtSuaNhanVienActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        hienthi();
        jtfid.setText("");
        jtffullname.setText("");
        jbtRule.setText("");
        jdcDateOfBirth.setDate(null);
        jtfEmail.setText("");
        jtfAddress.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    
    public void hienthi() {
    try {
        DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        // Kết nối cơ sở dữ liệu
        Connection conn = new DatabaseConnection().getJDBCConnection();
        if (conn == null) {
            System.out.println("Không thể kết nối database");
            JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Kết nối database thành công");

        // Câu lệnh SQL đã chỉnh sửa
        String sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth " +
                     "FROM employees e";
        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.println("Câu lệnh SQL: " + ps.toString());

        ResultSet rs = ps.executeQuery();

        int recordCount = 0;
        while (rs.next()) {
            recordCount++;
            Vector<Object> row = new Vector<>();
            row.add(rs.getInt("employee_id"));  // Thêm cột employee_id
            row.add(rs.getString("full_name"));  // Thêm cột full_name
            row.add(rs.getString("email"));     // Cột email
            row.add(rs.getString("phone_number"));// Cột phone_number
            row.add(rs.getString("address"));   // Cột address

            // Xử lý ngày sinh
            Date dob = rs.getDate("date_of_birth");
            row.add(dob != null ? new SimpleDateFormat("dd/MM/yyyy").format(dob) : "N/A");

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
        String[] columnNames = {"EmployeeID", "Full name", "Email",
            "Phone number", "Address", "Date Of Birth"};
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtLamMoi;
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
    private javax.swing.JTextField jtfTimKiem;
    private javax.swing.JTextField jtffullname;
    private javax.swing.JTextField jtfid;
    private javax.swing.JLabel jtfphone;
    // End of variables declaration//GEN-END:variables
}
