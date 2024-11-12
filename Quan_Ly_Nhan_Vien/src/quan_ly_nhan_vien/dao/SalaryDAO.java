package quan_ly_nhan_vien.dao;

import quan_ly_nhan_vien.models.SalaryModels;
import java.util.List;

public interface SalaryDAO {
    List<SalaryModels> getAllSalaries();
    SalaryModels getSalaryByEmployeeId(int employeeId, int month, int year);
    void addSalary(SalaryModels salary);
    void updateSalary(SalaryModels salary);
    void deleteSalary(int employeeId, int month, int year);
    List<SalaryModels> searchSalaries(String criteria, String value);
}