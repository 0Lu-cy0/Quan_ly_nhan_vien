package quan_ly_nhan_vien.controllers;

import quan_ly_nhan_vien.dao.SalaryDAO;
import quan_ly_nhan_vien.dao.SalaryDAOImpl;
import quan_ly_nhan_vien.models.SalaryModels;

import java.util.List;

public class SalaryControllers {

    private SalaryDAO salaryDAO;

    // Constructor khởi tạo SalaryController với SalaryDAO
    public SalaryControllers() {
        this.salaryDAO = new SalaryDAOImpl(); // Khởi tạo đối tượng SalaryDAOImpl
    }

    /**
     * Lấy tất cả thông tin lương của nhân viên.
     * @return danh sách các đối tượng SalaryModels.
     */
    public List<SalaryModels> getAllSalaries() {
        return salaryDAO.getAllSalaries();
    }

    /**
     * Lấy thông tin lương của một nhân viên theo ID, tháng và năm.
     * @param employeeId ID của nhân viên.
     * @param month tháng cần lấy lương.
     * @param year năm cần lấy lương.
     * @return đối tượng SalaryModels chứa thông tin lương của nhân viên.
     */
    public SalaryModels getSalaryByEmployeeId(int employeeId, int month, int year) {
        return salaryDAO.getSalaryByEmployeeId(employeeId, month, year);
    }

    /**
     * Thêm thông tin lương mới cho một nhân viên.
     * @param salary đối tượng SalaryModels chứa thông tin lương cần thêm.
     */
    public void addSalary(SalaryModels salary) {
        salaryDAO.addSalary(salary);
    }

    /**
     * Cập nhật thông tin lương cho một nhân viên.
     * @param salary đối tượng SalaryModels chứa thông tin lương cần cập nhật.
     */
    public void updateSalary(SalaryModels salary) {
        salaryDAO.updateSalary(salary);
    }

    /**
     * Xóa thông tin lương của một nhân viên theo ID, tháng và năm.
     * @param employeeId ID của nhân viên.
     * @param month tháng cần xóa lương.
     * @param year năm cần xóa lương.
     */
    public void deleteSalary(int employeeId, int month, int year) {
        salaryDAO.deleteSalary(employeeId, month, year);
    }

    /**
     * Tìm kiếm thông tin lương dựa trên tiêu chí và giá trị.
     * @param criteria tiêu chí tìm kiếm (ví dụ: EmployeeID, Month, Year).
     * @param value giá trị cần tìm kiếm.
     * @return danh sách các đối tượng SalaryModels thỏa mãn tiêu chí tìm kiếm.
     */
    public List<SalaryModels> searchSalaries(String criteria, String value) {
        return salaryDAO.searchSalaries(criteria, value);
    }
}