package quan_ly_nhan_vien.dao;

import quan_ly_nhan_vien.dao.SalaryDAO;
import quan_ly_nhan_vien.models.SalaryModels;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class SalaryDAOImpl implements SalaryDAO {

    private Connection getConnection() throws SQLException {
        return new DatabaseConnection().getJDBCConnection();
    }

    @Override
    public List<SalaryModels> getAllSalaries() {
        // Lấy tất cả thông tin lương của nhân viên từ cơ sở dữ liệu
        List<SalaryModels> salaries = new ArrayList<>();
        String sql = "SELECT * FROM salaries";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                SalaryModels salary = new SalaryModels();
                salary.setEmployeeId(rs.getInt("employee_id"));
                salary.setSalaryMonth(rs.getInt("salary_month"));
                salary.setSalaryYear(rs.getInt("salary_year"));
                salary.setBasicSalary(rs.getDouble("basic_salary"));
                salary.setBonuses(rs.getDouble("bonuses"));
                salary.setNetSalary(rs.getDouble("net_salary"));
                salaries.add(salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salaries;
    }

    @Override
    public SalaryModels getSalaryByEmployeeId(int employeeId, int month, int year) {
        // Lấy thông tin lương của một nhân viên theo ID, tháng và năm
        SalaryModels salary = null;
        String sql = "SELECT * FROM salaries WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ps.setInt(2, month);
            ps.setInt(3, year);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    salary = new SalaryModels();
                    salary.setEmployeeId(rs.getInt("employee_id"));
                    salary.setSalaryMonth(rs.getInt("salary_month"));
                    salary.setSalaryYear(rs.getInt("salary_year"));
                    salary.setBasicSalary(rs.getDouble("basic_salary"));
                    salary.setBonuses(rs.getDouble("bonuses"));
                    salary.setNetSalary(rs.getDouble("net_salary"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salary;
    }

    @Override
    public void addSalary(SalaryModels salary) {
        // Thêm thông tin lương mới cho một nhân viên vào cơ sở dữ liệu
        String sql = "INSERT INTO salaries (employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, salary.getEmployeeId());
            ps.setInt(2, salary.getSalaryMonth());
            ps.setInt(3, salary.getSalaryYear());
            ps.setDouble(4, salary.getBasicSalary());
            ps.setDouble(5, salary.getBonuses());
            ps.setDouble(6, salary.getNetSalary());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateSalary(SalaryModels salary) {
// Cập nhật thông tin lương cho một nhân viên trong cơ sở dữ liệu
        String sql = "UPDATE salaries SET basic_salary = ?, bonuses = ?, net_salary = ? WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, salary.getBasicSalary());
            ps.setDouble(2, salary.getBonuses());
            ps.setDouble(3, salary.getNetSalary());
            ps.setInt(4, salary.getEmployeeId());
            ps.setInt(5, salary.getSalaryMonth());
            ps.setInt(6, salary.getSalaryYear());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteSalary(int employeeId, int month, int year) {
// Xóa thông tin lương của một nhân viên theo ID, tháng và năm trong cơ sở dữ liệu
        String sql = "DELETE FROM salaries WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SalaryModels> searchSalaries(String criteria, String value) {
// Tìm kiếm thông tin lương dựa trên tiêu chí và giá trị trong cơ sở dữ liệu
        List<SalaryModels> salaries = new ArrayList<>();
        String sql = "";

        switch (criteria) {
            case "EmployeeID":
                sql = "SELECT * FROM salaries WHERE employee_id = ?";
                break;
            case "Month":
                sql = "SELECT * FROM salaries WHERE salary_month = ?";
                break;
            case "Year":
                sql = "SELECT * FROM salaries WHERE salary_year = ?";
                break;
            // Có thể thêm các tiêu chí khác nếu cần
        }

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            if (criteria.equals("EmployeeID")) {
                ps.setInt(1, Integer.parseInt(value));
            } else {
                ps.setInt(1, Integer.parseInt(value));
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    SalaryModels salary = new SalaryModels();
                    salary.setEmployeeId(rs.getInt("employee_id"));
                    salary.setSalaryMonth(rs.getInt("salary_month"));
                    salary.setSalaryYear(rs.getInt("salary_year"));
                    salary.setBasicSalary(rs.getDouble("basic_salary"));
                    salary.setBonuses(rs.getDouble("bonuses"));
                    salary.setNetSalary(rs.getDouble("net_salary"));
                    salaries.add(salary);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salaries;
    }
}
