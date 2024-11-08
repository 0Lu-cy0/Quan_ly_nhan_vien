// AttendanceController.java
package quan_ly_nhan_vien.controllers;

import quan_ly_nhan_vien.dao.AttendanceDAO;
import quan_ly_nhan_vien.dao.AttendanceDAOImpl;
import quan_ly_nhan_vien.models.AttendanceModels;
import quan_ly_nhan_vien.views.AttendanceDate;
import java.util.Calendar;
import java.util.List;

public class AttendanceControllers {

    private AttendanceDAO attendanceDAO;

    public AttendanceControllers() {
        this.attendanceDAO = new AttendanceDAOImpl();
    }

    public List<AttendanceModels> getAllAttendance() {
        return attendanceDAO.getAllAttendance();
    }

    public List<AttendanceModels> getAttendanceByEmployeeId(int employeeId) {
        return attendanceDAO.getAttendanceByEmployeeId(employeeId);
    }

    public List<AttendanceModels> getAttendanceByMonth(String month) {
        return attendanceDAO.getAttendanceByMonth(month);
    }

    public List<AttendanceModels> searchAttendance(String criteria, String value) {
        if (!validateSearchCriteria(criteria, value)) {
            throw new IllegalArgumentException("Dữ liệu tìm kiếm không hợp lệ");
        }
        return attendanceDAO.searchAttendance(criteria, value);
    }

    public boolean validateSearchCriteria(String criteria, String value) {
        // Thêm kiểm tra null cho criteria
        if (criteria == null) {
            return false;
        }

        if (value == null || value.trim().isEmpty()) {
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
            if (id <= 0) {
                return false;
            }
            return attendanceDAO.checkEmployeeExists(id);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validateMonth(String month) {
        if (!month.matches("^(0[1-9]|1[0-2])/\\d{4}$")) {
            return false;
        }

        String[] parts = month.split("/");
        int monthVal = Integer.parseInt(parts[0]);
        int yearVal = Integer.parseInt(parts[1]);

        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

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

    public boolean addAttendance(AttendanceModels attendance) {
        return attendanceDAO.addAttendance(attendance);
    }

    public boolean updateAttendance(AttendanceModels attendance) {
        try {
            return attendanceDAO.updateAttendance(attendance);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteAttendance(int employeeId, String day) {
        return attendanceDAO.deleteAttendance(employeeId, day);
    }

    public void showAttendanceDate(java.awt.Frame parent, int employeeId) {
        AttendanceDate dialog = new AttendanceDate(parent, employeeId);
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }

    public List<AttendanceModels> getDetailedAttendance(int employeeId, int month, int year) {
        String monthYear = String.format("%02d/%04d", month, year);
        return attendanceDAO.getDetailedAttendanceByEmployeeAndMonth(employeeId, monthYear);
    }
}
