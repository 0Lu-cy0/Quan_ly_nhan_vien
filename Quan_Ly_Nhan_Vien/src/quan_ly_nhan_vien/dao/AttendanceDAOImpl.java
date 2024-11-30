// AttendanceDAOImpl.java
package quan_ly_nhan_vien.dao;

import quan_ly_nhan_vien.utils.DatabaseConnection;
import quan_ly_nhan_vien.models.AttendanceModels;
import java.sql.*;
import java.util.*;

public class AttendanceDAOImpl implements AttendanceDAO {

    @Override
    public List<AttendanceModels> getAllAttendance() {
        List<AttendanceModels> attendanceList = new ArrayList<>();
        String sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                + "FROM attendances "
                + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y')";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                AttendanceModels attendance = new AttendanceModels(
                        rs.getInt("employee_id"),
                        rs.getString("month"),
                        rs.getInt("dayOff"),
                        rs.getInt("dayWork")
                );
                attendanceList.add(attendance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendanceList;
    }

    @Override
    public List<AttendanceModels> getAttendanceByEmployeeId(int employeeId) {
        List<AttendanceModels> attendanceList = new ArrayList<>();
        String sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                + "FROM attendances WHERE employee_id = ? "
                + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y')";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employeeId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    AttendanceModels attendance = new AttendanceModels(
                            rs.getInt("employee_id"),
                            rs.getString("month"),
                            rs.getInt("dayOff"),
                            rs.getInt("dayWork")
                    );
                    attendanceList.add(attendance);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendanceList;
    }

    @Override
    public List<AttendanceModels> getAttendanceByMonth(String month) {
        List<AttendanceModels> attendanceList = new ArrayList<>();
        String sql = "SELECT employee_id, DATE_FORMAT(day, '%m/%Y') as month, "
                + "SUM(CASE WHEN status = 'Nghỉ' THEN 1 ELSE 0 END) as dayOff, "
                + "SUM(CASE WHEN status = 'Đi Làm' THEN 1 ELSE 0 END) as dayWork "
                + "FROM attendances WHERE DATE_FORMAT(day, '%m/%Y') = ? "
                + "GROUP BY employee_id, DATE_FORMAT(day, '%m/%Y')";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, month);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    AttendanceModels attendance = new AttendanceModels(
                            rs.getInt("employee_id"),
                            rs.getString("month"),
                            rs.getInt("dayOff"),
                            rs.getInt("dayWork")
                    );
                    attendanceList.add(attendance);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendanceList;
    }

    @Override
    public List<AttendanceModels> searchAttendance(String criteria, String value) {
        List<AttendanceModels> attendanceList = new ArrayList<>();
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
                    AttendanceModels attendance = new AttendanceModels(
                            rs.getInt("employee_id"),
                            rs.getString("month"),
                            rs.getInt("dayOff"),
                            rs.getInt("dayWork")
                    );
                    attendanceList.add(attendance);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attendanceList;
    }

    @Override
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

    @Override
    public boolean addAttendance(AttendanceModels attendance) {
        String sql = "INSERT INTO attendances (employee_id, day, status) VALUES (?, ?, ?)";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, attendance.getEmployeeId());
            ps.setDate(2, java.sql.Date.valueOf(attendance.getDay()));
            ps.setString(3, attendance.getStatus());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteAttendance(int employeeId, String day) {
        String sql = "DELETE FROM attendances WHERE employee_id = ? AND day = ?";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employeeId);
            ps.setDate(2, java.sql.Date.valueOf(day));
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateAttendance(AttendanceModels attendance) {
        String sql = "UPDATE attendances SET status = ? WHERE employee_id = ? AND day = ?";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, attendance.getStatus());
            ps.setInt(2, attendance.getEmployeeId());
            ps.setDate(3, java.sql.Date.valueOf(attendance.getDay()));

            int result = ps.executeUpdate();
            return result > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<AttendanceModels> getDetailedAttendanceByEmployeeAndMonth(int employeeId, String monthYear) {
        List<AttendanceModels> detailedAttendance = new ArrayList<>();
        String sql = "SELECT * FROM attendances WHERE employee_id = ? AND DATE_FORMAT(day, '%m/%Y') = ? ORDER BY day";

        try (Connection conn = new DatabaseConnection().getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employeeId);
            ps.setString(2, monthYear);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    AttendanceModels attendance = new AttendanceModels();
                    attendance.setEmployeeId(rs.getInt("employee_id"));

                    // Chuyển đổi java.sql.Date sang LocalDate
                    java.sql.Date sqlDate = rs.getDate("day");
                    if (sqlDate != null) {
                        attendance.setDay(sqlDate.toLocalDate());
                    }

                    attendance.setStatus(rs.getString("status"));
                    attendance.setMonth(monthYear);
                    detailedAttendance.add(attendance);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detailedAttendance;
    }
}
