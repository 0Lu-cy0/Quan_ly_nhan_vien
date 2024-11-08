package quan_ly_nhan_vien.views;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.YearMonth;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class SalaryViews extends javax.swing.JPanel {

    private AttendanceViews attendanceViews;

    public SalaryViews(AttendanceViews attendanceViews) {
        this.attendanceViews = attendanceViews;
        initComponents();
        displaySalary();
        addTableClickListener();

    }

    // Constructor không tham số
    public SalaryViews() {
        this.attendanceViews = new AttendanceViews();
        initComponents();
        displaySalary();
        addTableClickListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtfEmployeeID = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbtLamMoi = new javax.swing.JButton();
        jbtTinhLuong = new javax.swing.JButton();
        jbtXuatPDF = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfBaseSalary = new javax.swing.JTextField();
        jtfBonus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfMonth = new javax.swing.JTextField();
        jbtXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSalary = new javax.swing.JTable();
        jbtTimKiem1 = new javax.swing.JButton();
        jcbbTimKiem1 = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("EmployeeID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, -1));

        jtfEmployeeID.setEditable(false);
        jtfEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmployeeIDActionPerformed(evt);
            }
        });
        jPanel2.add(jtfEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtLamMoi.setText("Làm Mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel8.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 110, -1));

        jbtTinhLuong.setText("Tính Lương");
        jbtTinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTinhLuongActionPerformed(evt);
            }
        });
        jPanel8.add(jbtTinhLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, -1));

        jbtXuatPDF.setText("Xuất PDF");
        jPanel8.add(jbtXuatPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 110, -1));

        jLabel15.setText("BaseSalary");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel16.setText("Bonus");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel8.add(jtfBaseSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        jtfBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBonusActionPerformed(evt);
            }
        });
        jPanel8.add(jtfBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, -1));

        jLabel1.setText("Month");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jtfMonth.setEditable(false);
        jPanel8.add(jtfMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, -1));

        jbtXoa.setText("Xoá");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });
        jPanel8.add(jbtXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 110, -1));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 540, 180));

        jtbSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Employee ID", "Month", "Day Off", "Base Salary", "Bonus", "Net Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbSalary);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 250));

        jbtTimKiem1.setText("Tìm kiếm");
        jPanel9.add(jbtTimKiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jcbbTimKiem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EmployeeID", "Month", "DayOff", "BaseSalary", "Bonus", "NetSalary" }));
        jPanel9.add(jcbbTimKiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, -1));
        jPanel9.add(jtfTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 340, -1));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmployeeIDActionPerformed

    }//GEN-LAST:event_jtfEmployeeIDActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        displaySalary();
        // Xóa các trường nhập liệu
        jtfBaseSalary.setText("");
        jtfEmployeeID.setText("");
        jtfBonus.setText("");
        jtfMonth.setText("");
        jtfTimKiem.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jbtTinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTinhLuongActionPerformed
        try {
            int employeeId = Integer.parseInt(jtfEmployeeID.getText());
            double baseSalary = Double.parseDouble(jtfBaseSalary.getText());

            double bonus = jtfBonus.getText().isEmpty() ? 0 : Double.parseDouble(jtfBonus.getText());

            // Lấy số ngày nghỉ từ bảng
            int dayOff = 0;
            int selectedRow = jtbSalary.getSelectedRow();
            if (selectedRow != -1) {
                dayOff = Integer.parseInt(jtbSalary.getValueAt(selectedRow, 4).toString()); // Cột Day Off
            }

            Connection conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null || conn.isClosed()) {
                System.out.println("Kết nối không thành công!");
                return;
            }
            System.out.println("Kết nối thành công!");

            // Lấy tháng và năm từ cơ sở dữ liệu
            String dateSql = "SELECT salary_month, salary_year FROM salaries WHERE employee_id = ? ORDER BY salary_year DESC, salary_month DESC LIMIT 1";
            PreparedStatement datePs = conn.prepareStatement(dateSql);
            datePs.setInt(1, employeeId);

            ResultSet dateRs = datePs.executeQuery();
            int month, year;
            if (dateRs.next()) {
                month = dateRs.getInt("salary_month");
                year = dateRs.getInt("salary_year");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy tháng và năm trong cơ sở dữ liệu!");
                dateRs.close();
                datePs.close();
                conn.close();
                return;
            }
            System.out.println("Month from DB: " + month + ", Year from DB: " + year);
            dateRs.close();
            datePs.close();

            // Tính số ngày trong tháng
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            // Tính thực lĩnh theo công thức mới
            double netSalary = baseSalary + bonus - (baseSalary / daysInMonth * dayOff);

            // Kiểm tra xem lương đã tồn tại cho tháng và năm từ database
            String checkSql = "SELECT COUNT(*) FROM salaries WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setInt(1, employeeId);
            checkPs.setInt(2, month);
            checkPs.setInt(3, year);

            ResultSet rs = checkPs.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            System.out.println("Record count: " + count);
            rs.close();
            checkPs.close();

            String sql;
            if (count > 0) {
                sql = "UPDATE salaries SET basic_salary = ?, bonuses = ?, net_salary = ? "
                        + "WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";
            } else {
                sql = "INSERT INTO salaries (employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
            }
            System.out.println("SQL Query: " + sql);

            PreparedStatement ps = conn.prepareStatement(sql);
            if (count > 0) {
                ps.setDouble(1, baseSalary);
                ps.setDouble(2, bonus);
                ps.setDouble(3, netSalary);
                ps.setInt(4, employeeId);
                ps.setInt(5, month);
                ps.setInt(6, year);
            } else {
                ps.setInt(1, employeeId);
                ps.setInt(2, month);
                ps.setInt(3, year);
                ps.setDouble(4, baseSalary);
                ps.setDouble(5, bonus);
                ps.setDouble(6, netSalary);
            }

            int result = ps.executeUpdate();
            System.out.println("Execute result: " + result);

            if (result > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Tính lương thành công và đã lưu vào cơ sở dữ liệu!");

                // Hiển thị thông tin chi tiết về việc tính lương
                String message = String.format(
                        "Chi tiết tính lương:\n"
                        + "Lương cơ bản: %.2f\n"
                        + "Thưởng: %.2f\n"
                        + "Số ngày nghỉ: %d\n"
                        + "Số ngày trong tháng: %d\n"
                        + "Thực lĩnh: %.2f",
                        baseSalary, bonus, dayOff, daysInMonth, netSalary
                );
                javax.swing.JOptionPane.showMessageDialog(this, message, "Chi tiết lương", JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi lưu lương vào cơ sở dữ liệu!");
            }
            ps.close();
            conn.close();
            displaySalary();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập số cho lương cơ bản và thưởng!");
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi kết nối cơ sở dữ liệu!");
        }
    }//GEN-LAST:event_jbtTinhLuongActionPerformed

    private void jtfBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBonusActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        int selectedRow = jtbSalary.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xoá.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá bản ghi này?", "Xác nhận xoá", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String employeeId = jtbSalary.getValueAt(selectedRow, 1).toString();
        String monthYear = jtbSalary.getValueAt(selectedRow, 2).toString();

        String[] parts = monthYear.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
            String sql = "DELETE FROM salaries WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(employeeId));
            ps.setInt(2, month);
            ps.setInt(3, year);

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Xoá bản ghi thành công!");
                displaySalary(); // Cập nhật lại bảng
                // Xoá dữ liệu trong các trường nhập liệu
                jtfEmployeeID.setText("");
                jtfBaseSalary.setText("");
                jtfBonus.setText("");
                jtfMonth.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Không thể xoá bản ghi. Vui lòng thử lại.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xoá bản ghi: " + e.getMessage());
        } finally {
            try {
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
    }//GEN-LAST:event_jbtXoaActionPerformed

    public void displaySalary() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Kết nối database
            conn = new DatabaseConnection().getJDBCConnection();

            if (conn == null) {
                System.out.println("Kết nối không thành công!");
                return;
            }

            // Query SQL kết hợp salary_month và salary_year
            String sql = "SELECT employee_id, salary_month, salary_year, "
                    + "basic_salary, bonuses, net_salary "
                    + "FROM salaries "
                    + "ORDER BY salary_year DESC, salary_month DESC";

            System.out.println("Chạy truy vấn: " + sql); // Debug: In ra câu lệnh SQL

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            // Tạo model cho JTable với các cột phù hợp
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"STT", "EmployeeID", "Month", "Base Salary", "Day Off", "Bonus", "Net Salary"},
                    0 // số hàng ban đầu
            );

            int stt = 1; // Biến đếm STT

            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet
                int employeeId = rs.getInt("employee_id");
                int month = rs.getInt("salary_month");
                int year = rs.getInt("salary_year");
                String monthYear = String.format("%02d/%d", month, year); // Format tháng/năm

                // Debug: In ra thông tin nhân viên
                System.out.println("Lấy dữ liệu cho Employee ID: " + employeeId + ", MonthYear: " + monthYear);

                int dayOff = attendanceViews.getDayOffForEmployee(employeeId, monthYear); // Cập nhật để lấy số ngày nghỉ theo monthYear

                double baseSalary = rs.getDouble("basic_salary");
                double bonus = rs.getDouble("bonuses");
                double netSalary = rs.getDouble("net_salary");

                // Format số tiền với dấu phẩy ngăn cách hàng nghìn
                DecimalFormat formatter = new DecimalFormat("#,###.##");
                String formattedBaseSalary = formatter.format(baseSalary);
                String formattedBonus = formatter.format(bonus);
                String formattedNetSalary = formatter.format(netSalary);

                // Thêm dòng mới vào model
                model.addRow(new Object[]{
                    stt++, // STT tự tăng
                    employeeId, // Mã nhân viên
                    monthYear, // Tháng/năm đã format
                    formattedBaseSalary, // Lương cơ bản đã format
                    dayOff, // Ngày nghỉ
                    formattedBonus, // Thưởng đã format
                    formattedNetSalary // Thực lĩnh đã format
                });

                // Debug: In ra thông tin dòng đã thêm
                System.out.println("Thêm dòng: " + (stt - 1) + " - Employee ID: " + employeeId + ", Base Salary: " + formattedBaseSalary + ", Bonus: " + formattedBonus + ", Net Salary: " + formattedNetSalary + ", Day Off: " + dayOff);
            }

            // Set model cho JTable
            jtbSalary.setModel(model);

            // Căn chỉnh độ rộng cột
            if (jtbSalary.getColumnModel().getColumnCount() > 0) {
                jtbSalary.getColumnModel().getColumn(0).setPreferredWidth(50);
            }

            // Debug: In ra số hàng đã được thêm vào bảng
            System.out.println("Tổng số bản ghi hiển thị: " + model.getRowCount());

        } catch (SQLException e) {
            System.err.println("Lỗi truy vấn database: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Lỗi không xác định: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Đóng các resource
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("Lỗi khi đóng kết nối: " + e.getMessage());
            }
        }
    }

    private void addTableClickListener() {
        jtbSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jtbSalary.getSelectedRow(); // Lấy chỉ số hàng được chọn
                if (row != -1) {
                    // Lấy dữ liệu từ các cột của hàng được chọn
                    String employeeId = jtbSalary.getValueAt(row, 1).toString();
                    String baseSalary = jtbSalary.getValueAt(row, 3).toString();
                    String bonus = jtbSalary.getValueAt(row, 5).toString();
                    String monthYear = jtbSalary.getValueAt(row, 2).toString();

                    // Hiển thị dữ liệu vào các JTextField tương ứng
                    jtfEmployeeID.setText(employeeId);

                    // Loại bỏ dấu phẩy từ baseSalary và bonus trước khi hiển thị
                    jtfBaseSalary.setText(baseSalary.replace(",", ""));
                    jtfBonus.setText(bonus.replace(",", ""));
                    jtfMonth.setText(monthYear);
                }
            }
        });
    }

    private void updateDayOff(int employeeId, String monthYear) {
        // Tách tháng và năm từ monthYear
        String[] parts = monthYear.split("/");
        if (parts.length != 2) {
            System.out.println("Định dạng monthYear không hợp lệ: " + monthYear);
            return; // Thoát nếu định dạng không hợp lệ
        }

        int month;
        int year;
        try {
            month = Integer.parseInt(parts[0]); // Tháng
            year = Integer.parseInt(parts[1]); // Năm
        } catch (NumberFormatException e) {
            System.out.println("Lỗi khi chuyển đổi month hoặc year: " + e.getMessage());
            return; // Thoát nếu có lỗi khi chuyển đổi
        }

        // Lấy số ngày nghỉ cho nhân viên
        int dayOff = attendanceViews.getDayOffForEmployee(employeeId, monthYear);

        // Debug: In ra số ngày nghỉ
        System.out.println("Employee ID: " + employeeId + ", MonthYear: " + monthYear + ", Day Off: " + dayOff);

        // Cập nhật giá trị Day Off trong bảng jtbSalary
        boolean found = false; // Biến để kiểm tra nếu tìm thấy hàng
        for (int i = 0; i < jtbSalary.getRowCount(); i++) {
            if (jtbSalary.getValueAt(i, 1).toString().equals(String.valueOf(employeeId))
                    && jtbSalary.getValueAt(i, 2).toString().equals(monthYear)) { // So sánh với monthYear
                jtbSalary.setValueAt(dayOff, i, 4); // Giả sử cột Day Off là cột thứ 4
                found = true; // Đánh dấu là đã tìm thấy
                break;
            }
        }

        // Debug: Kiểm tra xem có tìm thấy hàng không
        if (!found) {
            System.out.println("Không tìm thấy bản ghi cho Employee ID: " + employeeId + " và MonthYear: " + monthYear);
        } else {
            System.out.println("Cập nhật thành công số ngày nghỉ cho Employee ID: " + employeeId);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JButton jbtTimKiem1;
    private javax.swing.JButton jbtTinhLuong;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JButton jbtXuatPDF;
    private javax.swing.JComboBox<String> jcbbTimKiem1;
    private javax.swing.JTable jtbSalary;
    private javax.swing.JTextField jtfBaseSalary;
    private javax.swing.JTextField jtfBonus;
    private javax.swing.JTextField jtfEmployeeID;
    private javax.swing.JTextField jtfMonth;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}
