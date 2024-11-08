// AttendanceDAO.java
package quan_ly_nhan_vien.dao;

import quan_ly_nhan_vien.models.AttendanceModels;
import java.util.List;

public interface AttendanceDAO {

    List<AttendanceModels> getAllAttendance();

    List<AttendanceModels> getAttendanceByEmployeeId(int employeeId);

    List<AttendanceModels> getAttendanceByMonth(String month);

    List<AttendanceModels> searchAttendance(String criteria, String value);

    boolean checkEmployeeExists(int employeeId);

    boolean updateAttendance(AttendanceModels attendance);

    boolean addAttendance(AttendanceModels attendance);

    boolean deleteAttendance(int employeeId, String day);

    List<AttendanceModels> getDetailedAttendanceByEmployeeAndMonth(int employeeId, String monthYear);
}
