package quan_ly_nhan_vien.views;

import javax.swing.SwingUtilities;
import java.awt.Frame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class AttendanceViews extends javax.swing.JPanel {


    public AttendanceViews() {
        initComponents();
        setupTableListener();
        displayAttendance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbBangChamCong = new javax.swing.JTable();
        jbtTimKiem = new javax.swing.JButton();
        jcbbTimKiem = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbtCapNhat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        NgayChamCong5 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        NgayChamCong1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        NgayChamCong2 = new javax.swing.JTable();
        JScrollPanel = new javax.swing.JScrollPane();
        NgayChamCong3 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        NgayChamCong4 = new javax.swing.JTable();
        jbtChamCong = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(540, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbBangChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Employee ID", "Month", "Day Off", "Day Work"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbBangChamCong);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 170));

        jbtTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        jbtTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(jbtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jcbbTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        jcbbTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jcbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EmployeeID", "Month", "DayOff", "DayWork" }));
        jPanel3.add(jcbbTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, -1));
        jPanel3.add(jtfTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 340, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 200));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtCapNhat.setForeground(new java.awt.Color(0, 102, 102));
        jbtCapNhat.setText("Cập nhật dữ liệu");
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });
        jPanel1.add(jbtCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 30));

        NgayChamCong5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(NgayChamCong5);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 0, 108, 210));

        NgayChamCong1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(NgayChamCong1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 108, 210));

        NgayChamCong2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(NgayChamCong2);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 0, 108, 210));

        NgayChamCong3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPanel.setViewportView(NgayChamCong3);

        jPanel1.add(JScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 0, 108, 210));

        NgayChamCong4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(NgayChamCong4);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 0, 108, 210));

        jbtChamCong.setForeground(new java.awt.Color(0, 102, 102));
        jbtChamCong.setText("Chấm công");
        jbtChamCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtChamCongActionPerformed(evt);
            }
        });
        jPanel1.add(jbtChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 207, 540, 260));

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCapNhatActionPerformed
        displayAttendance();
        JOptionPane.showMessageDialog(this, "Dữ liệu đã được cập nhật.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbtCapNhatActionPerformed

    private void jbtChamCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtChamCongActionPerformed
        int selectedRow = jtbBangChamCong.getSelectedRow();
        if (selectedRow >= 0) {
            try {
                int employeeId = (int) jtbBangChamCong.getValueAt(selectedRow, 1);
                String monthYear = (String) jtbBangChamCong.getValueAt(selectedRow, 2);
                String[] parts = monthYear.split("/");
                int month = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);

                // Lấy Frame cha
                Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);

                // Tạo dialog với Frame cha
                AttendanceDate dialog = new AttendanceDate(parentFrame, employeeId, month, year);
                dialog.setLocationRelativeTo(this);
                dialog.setVisible(true);

                // Refresh bảng sau khi đóng dialog
                displayAttendance();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "Có lỗi xảy ra khi mở form chấm công: " + e.getMessage(),
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Vui lòng chọn nhân viên cần chấm công!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtChamCongActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        String criteria = jcbbTimKiem.getSelectedItem().toString();
        String searchValue = jtfTimKiem.getText().trim();

        try {
            if (validateSearchCriteria(criteria, searchValue)) {
                List<Map<String, Object>> results = searchAttendance(criteria, searchValue);
                updateTableWithResults(results);
                if (results.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (searchValue.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Dữ liệu tìm kiếm không hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    public boolean validateSearchCriteria(String criteria, String value) {
        if (criteria == null || value == null || value.trim().isEmpty()) {
            return false;
        }

        switch (criteria) {
            case "EmployeeID":
                return validateEmployeeID(value);
            case "Month":
                return validateMonth(value);
            case "Day Off":
            case "Day Work":
                return validateDayCount(value);
            default:
                return false;
        }
    }

    private boolean validateEmployeeID(String employeeID) {
        try {
            int id = Integer.parseInt(employeeID);
            return id > 0 && checkEmployeeExists(id);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean checkEmployeeExists(int employeeId) {
        String sql = "SELECT COUNT(*) FROM attendances WHERE employee_id = ?";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean validateMonth(String month) {
        if (!month.matches("^(0[1-9]|1[0-2])/\\d{4}$")) {
            return false;
        }

        String[] parts = month.split("/");
        int monthVal = Integer.parseInt(parts[0]);
        int yearVal = Integer.parseInt(parts[1]);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return yearVal <= currentYear;
    }

    private boolean validateDayCount(String dayCount) {
        try {
            int days = Integer.parseInt(dayCount);
            return days >= 0 && days <= 31;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public List<Map<String, Object>> searchAttendance(String criteria, String value) {
        List<Map<String, Object>> attendanceList = new ArrayList<>();
        String sql = "";

        switch (criteria) {
            case "EmployeeID":
                sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                        + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                        + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                        + "FROM attendances WHERE employee_id = ? "
                        + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y')";
                break;
            case "Month":
                sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                        + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                        + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                        + "FROM attendances WHERE DATE_FORMAT(day, '%m/%Y') = ? "
                        + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y')";
                break;
            case "Day Off":
                sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                        + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                        + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                        + "FROM attendances "
                        + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y') "
                        + "HAVING SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) = ?";
                break;
            case "Day Work":
                sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                        + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                        + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                        + "FROM attendances "
                        + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y') "
                        + "HAVING SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) = ?";
                break;
        }

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            if (criteria.equals("EmployeeID")) {
                ps.setInt(1, Integer.parseInt(value));
            } else {
                ps.setString(1, value);
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> row = new HashMap<>();
                    row.put("employee_id", rs.getInt("employee_id"));
                    row.put("month", rs.getString("month"));
                    row.put("dayOff", rs.getInt("dayOff"));
                    row.put("dayWork", rs.getInt("dayWork"));
                    attendanceList.add(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendanceList;
    }

    private void displayAttendance() {
        List<Map<String, Object>> attendanceList = AttendanceData();
        updateTableWithResults(attendanceList);
    }//có

    private List<Map<String, Object>> AttendanceData() {
        List<Map<String, Object>> attendanceList = new ArrayList<>();
        String sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                + "FROM attendances "
                + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y')";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("employee_id", rs.getInt("employee_id"));
                row.put("month", rs.getString("month"));
                row.put("dayOff", rs.getInt("dayOff"));
                row.put("dayWork", rs.getInt("dayWork"));
                attendanceList.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendanceList;
    }//có

    private void displayDetailedAttendance(int employeeId, String monthYear) {
        try {
            // Tách chuỗi monthYear thành tháng và năm
            String[] parts = monthYear.split("/");
            int month = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]);

            // Lấy dữ liệu chấm công chi tiết
            List<Map<String, Object>> detailedAttendance = getDetailedAttendance(employeeId, month, year);

            // Xóa dữ liệu cũ trong các bảng
            clearAttendanceTables();

            // Tính số ngày trong tháng
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            // Map để lưu trữ trạng thái của mỗi ngày
            Map<Integer, String> attendanceMap = new HashMap<>();

            // Lưu trữ thông tin chi tiết chấm công vào Map
            for (Map<String, Object> attendance : detailedAttendance) {
                // Lấy ngày từ kết quả
                String dayStr = (String) attendance.get("day");
                int day = Integer.parseInt(dayStr.split("/")[0]);
                attendanceMap.put(day, (String) attendance.get("status"));
            }

            // Phân chia dữ liệu cho 5 bảng
            int daysPerTable = (daysInMonth + 4) / 5;

            for (int i = 0; i < 5; i++) {
                int startDay = i * daysPerTable + 1;
                int endDay = Math.min(startDay + daysPerTable - 1, daysInMonth);

                // Lấy model của bảng hiện tại
                DefaultTableModel model = (DefaultTableModel) getAttendanceTableByIndex(i + 1).getModel();
                model.setRowCount(0);

                // Thêm dữ liệu vào bảng
                for (int day = startDay; day <= endDay; day++) {
                    String status = attendanceMap.getOrDefault(day, "N/A");
                    model.addRow(new Object[]{day, status});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Có lỗi xảy ra khi hiển thị chi tiết chấm công: " + e.getMessage(),
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//Có

    public List<Map<String, Object>> getDetailedAttendance(int employeeId, int month, int year) {
        String monthYear = String.format("%02d/%04d", month, year);
        return getDetailedAttendanceByEmployeeAndMonth(employeeId, monthYear);
    }//có

    public List<Map<String, Object>> getDetailedAttendanceByEmployeeAndMonth(int employeeId, String monthYear) {
        List<Map<String, Object>> detailedAttendance = new ArrayList<>();
        String sql = "SELECT employee_id, DATE_FORMAT(day, '%d/%m/%Y') as day, status "
                + "FROM attendances WHERE employee_id = ? AND DATE_FORMAT(day, '%m/%Y') = ? ORDER BY day";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employeeId);
            ps.setString(2, monthYear);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> attendance = new HashMap<>();
                    attendance.put("employee_id", rs.getInt("employee_id"));
                    attendance.put("day", rs.getString("day"));
                    attendance.put("status", rs.getString("status"));
                    detailedAttendance.add(attendance);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detailedAttendance;
    }//có

    private void clearAttendanceTables() {
        DefaultTableModel model1 = (DefaultTableModel) NgayChamCong1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) NgayChamCong2.getModel();
        DefaultTableModel model3 = (DefaultTableModel) NgayChamCong3.getModel();
        DefaultTableModel model4 = (DefaultTableModel) NgayChamCong4.getModel();
        DefaultTableModel model5 = (DefaultTableModel) NgayChamCong5.getModel();

        model1.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);
        model5.setRowCount(0);
    }//có

    private JTable getAttendanceTableByIndex(int index) {
        switch (index) {
            case 1:
                return NgayChamCong1;
            case 2:
                return NgayChamCong2;
            case 3:
                return NgayChamCong3;
            case 4:
                return NgayChamCong4;
            case 5:
                return NgayChamCong5;
            default:
                throw new IllegalArgumentException("Invalid table index");
        }
    }//có

    private void setupTableListener() {
        jtbBangChamCong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtbBangChamCong.getSelectedRow();
                if (row != -1) {
                    int employeeId = (Integer) jtbBangChamCong.getValueAt(row, 1);
                    String monthYear = (String) jtbBangChamCong.getValueAt(row, 2);
                    displayDetailedAttendance(employeeId, monthYear);
                }
            }
        });
    }//Có

    private void updateTableWithResults(List<Map<String, Object>> results) {
        DefaultTableModel model = (DefaultTableModel) jtbBangChamCong.getModel();
        model.setRowCount(0);

        int stt = 1;
        for (Map<String, Object> row : results) {
            model.addRow(new Object[]{
                stt++,
                row.get("employee_id"),
                row.get("month"),
                row.get("dayOff"),
                row.get("dayWork")
            });
        }
    }//có

    public int getDayOffForEmployee(int employeeId, String monthYear) {
        // Tách monthYear thành tháng và năm
        String[] parts = monthYear.split("/");
        if (parts.length != 2) {
            return 0; // Thoát nếu định dạng không hợp lệ
        }

        int month;
        int year;
        try {
            month = Integer.parseInt(parts[0]); // Lấy tháng
            year = Integer.parseInt(parts[1]); // Lấy năm
        } catch (NumberFormatException e) {
            return 0; // Thoát nếu có lỗi khi chuyển đổi
        }

        for (int i = 0; i < jtbBangChamCong.getRowCount(); i++) {
            // Lấy giá trị tháng và năm từ cột monthYear
            String monthYearValue = jtbBangChamCong.getValueAt(i, 2).toString();
            String[] monthYearParts = monthYearValue.split("/");

            if (monthYearParts.length == 2) {
                int rowMonth = Integer.parseInt(monthYearParts[0]); // Lấy tháng
                int rowYear = Integer.parseInt(monthYearParts[1]); // Lấy năm

                // Kiểm tra employeeId, month, và year có khớp không
                if (jtbBangChamCong.getValueAt(i, 1).toString().equals(String.valueOf(employeeId))
                        && rowMonth == month && rowYear == year) {
                    int dayOff = Integer.parseInt(jtbBangChamCong.getValueAt(i, 3).toString()); // Cột Day Off
                    return dayOff;
                }
            }
        }

        // Trả về 0 nếu không tìm thấy
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPanel;
    private javax.swing.JTable NgayChamCong1;
    private javax.swing.JTable NgayChamCong2;
    private javax.swing.JTable NgayChamCong3;
    private javax.swing.JTable NgayChamCong4;
    private javax.swing.JTable NgayChamCong5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtChamCong;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JComboBox<String> jcbbTimKiem;
    private javax.swing.JTable jtbBangChamCong;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}
