package quan_ly_nhan_vien.views;

import quan_ly_nhan_vien.utils.DatabaseConnection;
import com.toedter.calendar.JDayChooser;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class AttendanceDate extends javax.swing.JDialog {

    private Map<Integer, String> dayStatus = new HashMap<>(); // Lưu trạng thái của từng ngày
    private List<Integer> offDays = new ArrayList<>(); // Danh sách các ngày nghỉ
    private Map<String, Map<Integer, String>> monthDayStatus = new HashMap<>(); // Lưu trạng thái cho từng tháng
    private int employeeId;
    private SalaryViews salaryViews; // Khai báo đối tượng SalaryViews

    public AttendanceDate(java.awt.Frame parent, int employeeId, int month, int year) {
        super(parent, true);
        initComponents();
        this.employeeId = employeeId; // Gán employeeId từ tham số
        monthDayStatus.clear(); // Xóa trạng thái cũ để tránh bị ảnh hưởng bởi nhân viên khác
        offDays.clear(); // Xóa danh sách ngày nghỉ cũ
        // Cập nhật lịch với tháng và năm được truyền vào
        Calendar calendar = jcldAttendenceDate.getCalendar();
        calendar.set(Calendar.MONTH, month - 1); // Calendar.MONTH bắt đầu từ 0
        calendar.set(Calendar.YEAR, year);
        jcldAttendenceDate.setCalendar(calendar);

        // Tải dữ liệu theo employeeId và các năm chỉ định
        loadDataFromDatabase(2022, 2024);

        // Thêm sự kiện nhấp chuột vào ngày
        addCalendarMouseListener();

        // Khởi tạo trạng thái mặc định cho các ngày
        initializeDayStatuses(month, year);
    }

    // Trong class AttendanceDate
    public AttendanceDate(java.awt.Frame parent, int employeeId) {
        this(parent, employeeId, Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public AttendanceDate(int employeeId, SalaryViews salaryViews) {
        this.employeeId = employeeId;
        this.salaryViews = salaryViews; // Gán đối tượng SalaryViews
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcldAttendenceDate = new com.toedter.calendar.JCalendar();
        jbtThem = new javax.swing.JButton();
        jbtHienThiNgayNghi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcldAttendenceDate.setBackground(new java.awt.Color(255, 255, 255));
        jcldAttendenceDate.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jcldAttendenceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 430));

        jbtThem.setBackground(new java.awt.Color(0, 102, 102));
        jbtThem.setForeground(new java.awt.Color(255, 255, 255));
        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });
        jPanel1.add(jbtThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jbtHienThiNgayNghi.setBackground(new java.awt.Color(0, 102, 102));
        jbtHienThiNgayNghi.setForeground(new java.awt.Color(255, 255, 255));
        jbtHienThiNgayNghi.setText("Hiển thị ngày nghỉ");
        jbtHienThiNgayNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHienThiNgayNghiActionPerformed(evt);
            }
        });
        jPanel1.add(jbtHienThiNgayNghi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.getJDBCConnection();

        Calendar calendar = jcldAttendenceDate.getCalendar();
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String monthYearKey = month + "/" + year;
        Map<Integer, String> dayStatus = monthDayStatus.get(monthYearKey);

        if (dayStatus == null) {
            initializeDayStatuses(month, year);
            dayStatus = monthDayStatus.get(monthYearKey);
        }

        // Lưu trạng thái chấm công vào cơ sở dữ liệu
        try {
            for (int day = 1; day <= 31; day++) {
                if (isDateValid(year, month, day)) {
                    String status = dayStatus.getOrDefault(day, "Đi Làm");

                    // Kiểm tra xem ngày đã tồn tại trong bảng attendances chưa
                    String checkQuery = "SELECT COUNT(*) AS count FROM attendances WHERE DAY(day) = ? AND MONTH(day) = ? AND YEAR(day) = ? AND employee_id = ?";

                    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                        checkStmt.setInt(1, day);
                        checkStmt.setInt(2, month);
                        checkStmt.setInt(3, year);
                        checkStmt.setInt(4, this.employeeId);
                        ResultSet rs = checkStmt.executeQuery();
                        rs.next();
                        int count = rs.getInt("count");

                        if (count == 0) {
                            // Thêm mới
                            String query = "INSERT INTO attendances (day, status, employee_id) VALUES (STR_TO_DATE('" + day + "/" + month + "/" + year + "', '%d/%m/%Y'), ?, ?)";
                            try (PreparedStatement insertStmt = conn.prepareStatement(query)) {
                                insertStmt.setString(1, status);
                                insertStmt.setInt(2, this.employeeId);
                                insertStmt.executeUpdate();
                            }
                        } else {
                            // Cập nhật trạng thái nếu đã tồn tại
                            String query = "UPDATE attendances SET status = ? WHERE DAY(day) = ? AND MONTH(day) = ? AND YEAR(day) = ? AND employee_id = ?";
                            try (PreparedStatement updateStmt = conn.prepareStatement(query)) {
                                updateStmt.setString(1, status);
                                updateStmt.setInt(2, day);
                                updateStmt.setInt(3, month);
                                updateStmt.setInt(4, year);
                                updateStmt.setInt(5, this.employeeId);
                                updateStmt.executeUpdate();
                            }
                        }
                    }
                }
            }

            // Cập nhật bảng salaries sau khi lưu trạng thái chấm công
            String monthYear = month + "/" + year;
            insertIntoSalary(this.employeeId, monthYear);

            // Gọi phương thức updateDayOff từ SalaryViews để cập nhật số ngày nghỉ
            if (salaryViews != null) {
                salaryViews.updateDayOff(this.employeeId, monthYear);
            }

            // Thông báo thành công
            JOptionPane.showMessageDialog(null, "Đã lưu trạng thái chấm công cho nhân viên " + this.employeeId + " thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lưu trạng thái chấm công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            dbConnection.closeConnection();
        }

    }//GEN-LAST:event_jbtThemActionPerformed

    private void insertIntoSalary(int employeeId, String monthYear) {
        String[] parts = monthYear.split("/");
        if (parts.length != 2) {
            return;
        }

        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        // Insert vào bảng salaries
        String sql = "INSERT INTO salaries (employee_id, salary_month, salary_year) VALUES (?, ?, ?)";
        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void jbtHienThiNgayNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHienThiNgayNghiActionPerformed
        updateOffDaysColor(jcldAttendenceDate.getDayChooser().getDayPanel().getComponents());
    }//GEN-LAST:event_jbtHienThiNgayNghiActionPerformed

//Phương thức lấy dữ liệu từ database
    private void loadDataFromDatabase(int startYear, int endYear) {
        PreparedStatement ps = null;
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection conn = dbConnection.getJDBCConnection();

        String query = "SELECT DAY(day) AS day, MONTH(day) AS month, YEAR(day) AS year, status "
                + "FROM attendances WHERE employee_id = ? AND YEAR(day) BETWEEN ? AND ?";
        offDays.clear(); // Xóa danh sách ngày nghỉ trước khi thêm mới

        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, this.employeeId);  // Sử dụng employeeId truyền từ AttendanceDateViews
            ps.setInt(2, startYear);
            ps.setInt(3, endYear);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int day = rs.getInt("day");
                int month = rs.getInt("month");
                int year = rs.getInt("year");
                String status = rs.getString("status");

                // Khóa tháng/năm dùng để phân biệt trạng thái các ngày
                String monthYearKey = month + "/" + year;

                // Đảm bảo khởi tạo nếu chưa có trạng thái cho tháng/năm này
                monthDayStatus.putIfAbsent(monthYearKey, new HashMap<>());
                Map<Integer, String> dayStatus = monthDayStatus.get(monthYearKey);

                // Cập nhật trạng thái cho ngày cụ thể
                dayStatus.put(day, status);

                // Thêm vào danh sách ngày nghỉ nếu trạng thái là "Nghỉ"
                if ("Nghỉ".equals(status)) {
                    offDays.add(day);
                }
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Đóng kết nối với cơ sở dữ liệu
            dbConnection.closeConnection();
        }

        // Cập nhật màu cho các ngày nghỉ trong bảng lịch
        updateOffDaysColor(jcldAttendenceDate.getDayChooser().getDayPanel().getComponents());
    }

    private void updateCalendarForSelectedMonth() {
        Calendar selectedCalendar = jcldAttendenceDate.getCalendar();
        int selectedMonth = selectedCalendar.get(Calendar.MONTH) + 1;
        int selectedYear = selectedCalendar.get(Calendar.YEAR);

        String selectedMonthYearKey = selectedMonth + "/" + selectedYear;
        Map<Integer, String> dayStatus = monthDayStatus.getOrDefault(selectedMonthYearKey, new HashMap<>());

        offDays.clear();
        for (Map.Entry<Integer, String> entry : dayStatus.entrySet()) {
            if ("Nghỉ".equals(entry.getValue())) {
                offDays.add(entry.getKey());
            }
        }

        updateOffDaysColor(jcldAttendenceDate.getDayChooser().getDayPanel().getComponents());
    }

    //Phương thức gán trạng thái mặc định cho các ngày trong tháng là đi làm
    private void initializeDayStatuses(int month, int year) {
        String monthYearKey = month + "/" + year;
        if (!monthDayStatus.containsKey(monthYearKey)) {
            Map<Integer, String> dayStatus = new HashMap<>();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, 1);
            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            for (int day = 1; day <= daysInMonth; day++) {
                calendar.set(Calendar.DAY_OF_MONTH, day);
                dayStatus.put(day, "Đi Làm");
            }
            monthDayStatus.put(monthYearKey, dayStatus);
        }
    }

    //Phương thức chuyển đổi trạng thái ngày khi nhấp vào
    private void addCalendarMouseListener() {
        JDayChooser dayChooser = jcldAttendenceDate.getDayChooser();
        Component[] days = dayChooser.getDayPanel().getComponents();

        for (Component dayComponent : days) {
            if (dayComponent instanceof JButton) {
                JButton dayButton = (JButton) dayComponent;

                dayButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String dayText = dayButton.getText();
                        if (!isNumeric(dayText)) {
                            System.out.println("Bạn đã nhấp vào ô không phải là ngày hợp lệ!");
                            return;
                        }

                        int day = Integer.parseInt(dayText);
                        Calendar calendar = jcldAttendenceDate.getCalendar();
                        int month = calendar.get(Calendar.MONTH) + 1;
                        int year = calendar.get(Calendar.YEAR);
                        String monthYearKey = month + "/" + year;

                        monthDayStatus.putIfAbsent(monthYearKey, new HashMap<>());
                        Map<Integer, String> dayStatus = monthDayStatus.get(monthYearKey);

                        String status = dayStatus.getOrDefault(day, "Đi Làm");
                        if ("Đi Làm".equals(status)) {
                            dayStatus.put(day, "Nghỉ");
                            if (!offDays.contains(day)) {
                                offDays.add(day);
                            }
                        } else {
                            dayStatus.put(day, "Đi Làm");
                            offDays.remove((Integer) day);
                        }

                        updateOffDaysColor(days);
                    }
                });
            }
        }

        // Thêm sự kiện lắng nghe thay đổi tháng
        dayChooser.addPropertyChangeListener(evt -> {
            if ("month".equals(evt.getPropertyName()) || "year".equals(evt.getPropertyName())) {
                updateCalendarForSelectedMonth();
            }
        });
    }

    // Phương thức cập nhật màu cho tất cả các ngày trong danh sách nghỉ
    private void updateOffDaysColor(Component[] days) {
        Calendar calendar = jcldAttendenceDate.getCalendar();
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String monthYearKey = month + "/" + year;

        Map<Integer, String> dayStatus = monthDayStatus.getOrDefault(monthYearKey, new HashMap<>());

        for (Component dayComponent : days) {
            if (dayComponent instanceof JButton) {
                JButton dayButton = (JButton) dayComponent;
                String dayText = dayButton.getText();

                if (isNumeric(dayText)) {
                    int day = Integer.parseInt(dayText);
                    if (offDays.contains(day) && dayStatus.containsKey(day) && "Nghỉ".equals(dayStatus.get(day))) {
                        dayButton.setBackground(Color.RED);
                    } else {
                        dayButton.setBackground(null);
                    }
                }
            }
        }
    }

    // Phương thức kiểm tra chuỗi có phải là số không
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Phướng thức kiểm tra tính hợp lệ của ngày
    private boolean isDateValid(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Tháng từ 0-11
        return (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == month - 1 && calendar.get(Calendar.DAY_OF_MONTH) == day);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtHienThiNgayNghi;
    private javax.swing.JButton jbtThem;
    private com.toedter.calendar.JCalendar jcldAttendenceDate;
    // End of variables declaration//GEN-END:variables
}
