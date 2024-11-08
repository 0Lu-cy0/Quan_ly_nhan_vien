// AttendanceModels.java
package quan_ly_nhan_vien.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AttendanceModels {

    private int employeeId;
    private String month;
    private int dayOff;
    private int dayWork;
    private LocalDate day;
    private String status;

    // Default Constructor
    public AttendanceModels() {
    }

    // Constructor với 4 tham số chính
    public AttendanceModels(int employeeId, String month, int dayOff, int dayWork) {
        this.employeeId = employeeId;
        this.month = month;
        this.dayOff = dayOff;
        this.dayWork = dayWork;
    }

    // Constructor đầy đủ
    public AttendanceModels(int employeeId, String month, int dayOff, int dayWork, LocalDate day, String status) {
        this.employeeId = employeeId;
        this.month = month;
        this.dayOff = dayOff;
        this.dayWork = dayWork;
        this.day = day;
        this.status = status;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getMonth() {
        return month;
    }

    public int getDayOff() {
        return dayOff;
    }

    public int getDayWork() {
        return dayWork;
    }

    public LocalDate getDay() {
        return day;
    }

    public String getStatus() {
        return status;
    }

    public String getDayAsString() {
        if (day != null) {
            return day.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        return "";
    }

    // Setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setMonth(String month) {
        if (month == null || !month.matches("^(0[1-9]|1[0-2])/\\d{4}$")) {
            throw new IllegalArgumentException("Invalid month format");
        }
        this.month = month;
    }

    public void setDayOff(int dayOff) {
        if (dayOff < 0) {
            throw new IllegalArgumentException("Day off cannot be negative");
        }
        this.dayOff = dayOff;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Override toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "AttendanceModel{"
                + "employeeId=" + employeeId
                + ", month='" + month + '\''
                + ", dayOff=" + dayOff
                + ", dayWork=" + dayWork
                + ", day='" + day + '\''
                + ", status='" + status + '\''
                + '}';
    }

    // Override equals method for comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AttendanceModels that = (AttendanceModels) o;

        if (employeeId != that.employeeId) {
            return false;
        }
        if (dayOff != that.dayOff) {
            return false;
        }
        if (dayWork != that.dayWork) {
            return false;
        }
        if (!month.equals(that.month)) {
            return false;
        }
        if (day != null ? !day.equals(that.day) : that.day != null) {
            return false;
        }
        return status != null ? status.equals(that.status) : that.status == null;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + month.hashCode();
        result = 31 * result + dayOff;
        result = 31 * result + dayWork;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}