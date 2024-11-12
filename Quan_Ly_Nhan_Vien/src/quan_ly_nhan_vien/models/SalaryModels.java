package quan_ly_nhan_vien.models;

public class SalaryModels {

    private int employeeId;      // ID của nhân viên
    private int salaryMonth;     // Tháng lương
    private int salaryYear;      // Năm lương
    private double basicSalary;   // Lương cơ bản
    private double bonuses;       // Thưởng
    private double netSalary;     // Lương thực nhận

    // Constructor mặc định
    public SalaryModels() {
    }

    // Constructor đầy đủ
    public SalaryModels(int employeeId, int salaryMonth, int salaryYear, double basicSalary, double bonuses, double netSalary) {
        this.employeeId = employeeId;
        this.salaryMonth = salaryMonth;
        this.salaryYear = salaryYear;
        this.basicSalary = basicSalary;
        this.bonuses = bonuses;
        this.netSalary = netSalary;
    }

    // Getter và Setter cho employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter và Setter cho salaryMonth
    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    // Getter và Setter cho salaryYear
    public int getSalaryYear() {
        return salaryYear;
    }

    public void setSalaryYear(int salaryYear) {
        this.salaryYear = salaryYear;
    }

    // Getter và Setter cho basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter và Setter cho bonuses
    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    // Getter và Setter cho netSalary
    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    // Override toString method để hiển thị thông tin lương
    @Override
    public String toString() {
        return "SalaryModels{" +
                "employeeId=" + employeeId +
                ", salaryMonth=" + salaryMonth +
                ", salaryYear=" + salaryYear +
                ", basicSalary=" + basicSalary +
                ", bonuses=" + bonuses +
                ", netSalary=" + netSalary +
                '}';
    }
}