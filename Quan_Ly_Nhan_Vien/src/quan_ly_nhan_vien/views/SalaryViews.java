package quan_ly_nhan_vien.views;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.YearMonth;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class SalaryViews extends javax.swing.JPanel {

    private AttendanceViews attendanceViews;

    public SalaryViews(AttendanceViews attendanceViews) {
        this.attendanceViews = attendanceViews;
        initComponents();
        displaySalary();
        addTableClickListener();

    }

    // Constructor không tham số
    public SalaryViews() {
        this.attendanceViews = new AttendanceViews();
        initComponents();
        displaySalary();
        addTableClickListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtfEmployeeID = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbtLamMoi = new javax.swing.JButton();
        jbtTinhLuong = new javax.swing.JButton();
        jbtXuatEXEL = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfBaseSalary = new javax.swing.JTextField();
        jtfBonus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfMonth = new javax.swing.JTextField();
        jbtXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSalary = new javax.swing.JTable();
        jbtTimKiem = new javax.swing.JButton();
        jcbbTimKiem = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EmployeeID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, -1));

        jtfEmployeeID.setEditable(false);
        jtfEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmployeeIDActionPerformed(evt);
            }
        });
        jPanel2.add(jtfEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtLamMoi.setForeground(new java.awt.Color(0, 102, 102));
        jbtLamMoi.setText("Làm Mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel8.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 110, -1));

        jbtTinhLuong.setForeground(new java.awt.Color(0, 102, 102));
        jbtTinhLuong.setText("Tính Lương");
        jbtTinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTinhLuongActionPerformed(evt);
            }
        });
        jPanel8.add(jbtTinhLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, -1));

        jbtXuatEXEL.setForeground(new java.awt.Color(0, 102, 102));
        jbtXuatEXEL.setText("Xuất EXEL");
        jbtXuatEXEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXuatEXELActionPerformed(evt);
            }
        });
        jPanel8.add(jbtXuatEXEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 110, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("BaseSalary");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Bonus");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel8.add(jtfBaseSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        jtfBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBonusActionPerformed(evt);
            }
        });
        jPanel8.add(jtfBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Month");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jtfMonth.setEditable(false);
        jPanel8.add(jtfMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, -1));

        jbtXoa.setForeground(new java.awt.Color(0, 102, 102));
        jbtXoa.setText("Xoá");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });
        jPanel8.add(jbtXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 110, -1));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 540, 180));

        jtbSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Employee ID", "Month", "Day Off", "Base Salary", "Bonus", "Net Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbSalary);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 250));

        jbtTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        jbtTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });
        jPanel9.add(jbtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jcbbTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        jcbbTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jcbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EmployeeID", "Month", "DayOff", "BaseSalary", "Bonus", "NetSalary" }));
        jcbbTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbTimKiemActionPerformed(evt);
            }
        });
        jPanel9.add(jcbbTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, -1));

        jtfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimKiemKeyPressed(evt);
            }
        });
        jPanel9.add(jtfTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 340, -1));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmployeeIDActionPerformed

    }//GEN-LAST:event_jtfEmployeeIDActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        displaySalary();
        // Xóa các trường nhập liệu
        jtfBaseSalary.setText("");
        jtfEmployeeID.setText("");
        jtfBonus.setText("");
        jtfMonth.setText("");
        jtfTimKiem.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jbtTinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTinhLuongActionPerformed
        try {
            int employeeId = Integer.parseInt(jtfEmployeeID.getText());
            double baseSalary = Double.parseDouble(jtfBaseSalary.getText());

            double bonus = jtfBonus.getText().isEmpty() ? 0 : Double.parseDouble(jtfBonus.getText());

            // Lấy số ngày nghỉ từ bảng
            int dayOff = 0;
            int selectedRow = jtbSalary.getSelectedRow();
            if (selectedRow != -1) {
                dayOff = Integer.parseInt(jtbSalary.getValueAt(selectedRow, 4).toString()); // Cột Day Off
            }

            Connection conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null || conn.isClosed()) {
                System.out.println("Kết nối không thành công!");
                return;
            }
            System.out.println("Kết nối thành công!");

            // Lấy tháng và năm từ cơ sở dữ liệu
            String dateSql = "SELECT salary_month, salary_year FROM salaries WHERE employee_id = ? ORDER BY salary_year DESC, salary_month DESC LIMIT 1";
            PreparedStatement datePs = conn.prepareStatement(dateSql);
            datePs.setInt(1, employeeId);

            ResultSet dateRs = datePs.executeQuery();
            int month, year;
            if (dateRs.next()) {
                month = dateRs.getInt("salary_month");
                year = dateRs.getInt("salary_year");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy tháng và năm trong cơ sở dữ liệu!");
                dateRs.close();
                datePs.close();
                conn.close();
                return;
            }
            System.out.println("Month from DB: " + month + ", Year from DB: " + year);
            dateRs.close();
            datePs.close();

            // Tính số ngày trong tháng
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            // Tính thực lĩnh theo công thức mới
            double netSalary = baseSalary + bonus - (baseSalary / daysInMonth * dayOff);

            // Kiểm tra xem lương đã tồn tại cho tháng và năm từ database
            String checkSql = "SELECT COUNT(*) FROM salaries WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setInt(1, employeeId);
            checkPs.setInt(2, month);
            checkPs.setInt(3, year);

            ResultSet rs = checkPs.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            System.out.println("Record count: " + count);
            rs.close();
            checkPs.close();

            String sql;
            if (count > 0) {
                sql = "UPDATE salaries SET basic_salary = ?, bonuses = ?, net_salary = ? "
                        + "WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";
            } else {
                sql = "INSERT INTO salaries (employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
            }
            System.out.println("SQL Query: " + sql);

            PreparedStatement ps = conn.prepareStatement(sql);
            if (count > 0) {
                ps.setDouble(1, baseSalary);
                ps.setDouble(2, bonus);
                ps.setDouble(3, netSalary);
                ps.setInt(4, employeeId);
                ps.setInt(5, month);
                ps.setInt(6, year);
            } else {
                ps.setInt(1, employeeId);
                ps.setInt(2, month);
                ps.setInt(3, year);
                ps.setDouble(4, baseSalary);
                ps.setDouble(5, bonus);
                ps.setDouble(6, netSalary);
            }

            int result = ps.executeUpdate();
            System.out.println("Execute result: " + result);

            if (result > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Tính lương thành công và đã lưu vào cơ sở dữ liệu!");
                System.out.println("Da tinh luong");

                // Hiển thị thông tin chi tiết về việc tính lương
                String message = String.format(
                        "Chi tiết tính lương:\n"
                        + "Lương cơ bản: %.2f\n"
                        + "Thưởng: %.2f\n"
                        + "Số ngày nghỉ: %d\n"
                        + "Số ngày trong tháng: %d\n"
                        + "Thực lĩnh: %.2f",
                        baseSalary, bonus, dayOff, daysInMonth, netSalary
                );
                javax.swing.JOptionPane.showMessageDialog(this, message, "Chi tiết lương", JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi lưu lương vào cơ sở dữ liệu!");
            }
            ps.close();
            conn.close();
            displaySalary();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập số cho lương cơ bản và thưởng!");
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi kết nối cơ sở dữ liệu!");
        }
    }//GEN-LAST:event_jbtTinhLuongActionPerformed

    private void jtfBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBonusActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        int selectedRow = jtbSalary.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xoá.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá bản ghi này?", "Xác nhận xoá", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String employeeId = jtbSalary.getValueAt(selectedRow, 1).toString();
        String monthYear = jtbSalary.getValueAt(selectedRow, 2).toString();

        String[] parts = monthYear.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
            String sql = "DELETE FROM salaries WHERE employee_id = ? AND salary_month = ? AND salary_year = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(employeeId));
            ps.setInt(2, month);
            ps.setInt(3, year);

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Xoá bản ghi thành công!");
                displaySalary(); // Cập nhật lại bảng
                // Xoá dữ liệu trong các trường nhập liệu
                jtfEmployeeID.setText("");
                jtfBaseSalary.setText("");
                jtfBonus.setText("");
                jtfMonth.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Không thể xoá bản ghi. Vui lòng thử lại.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xoá bản ghi: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        String searchText = jtfTimKiem.getText().trim();
        String searchCriteria = jcbbTimKiem.getSelectedItem().toString();

        // Kiểm tra nếu ô tìm kiếm rỗng
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra nếu không có tiêu chí tìm kiếm hợp lệ được chọn
        if (searchCriteria == null || searchCriteria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tiêu chí tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra dữ liệu tìm kiếm hợp lệ (ví dụ: kiểm tra định dạng tháng/năm, ID...)
        if (!validateSearchCriteria(searchCriteria, searchText)) {
            JOptionPane.showMessageDialog(this, "Dữ liệu tìm kiếm không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
            String sql = "";

            // Xây dựng câu query dựa trên tiêu chí tìm kiếm
            switch (searchCriteria) {
                case "EmployeeID":
                    sql = "SELECT employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary "
                            + "FROM salary WHERE employee_id = ?";
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, Integer.parseInt(searchText));
                    break;

                case "Month":
                    sql = "SELECT employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary "
                            + "FROM salary WHERE CONCAT(salary_month, '/', salary_year) LIKE ?";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, "%" + searchText + "%");
                    break;

                case "BaseSalary":
                    sql = "SELECT employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary "
                            + "FROM salary WHERE basic_salary = ?";
                    ps = conn.prepareStatement(sql);
                    ps.setDouble(1, Double.parseDouble(searchText.replace(",", "")));
                    break;

                case "Bonus":
                    sql = "SELECT employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary "
                            + "FROM salary WHERE bonuses = ?";
                    ps = conn.prepareStatement(sql);
                    ps.setDouble(1, Double.parseDouble(searchText.replace(",", "")));
                    break;

                case "NetSalary":
                    sql = "SELECT employee_id, salary_month, salary_year, basic_salary, bonuses, net_salary "
                            + "FROM salary WHERE net_salary = ?";
                    ps = conn.prepareStatement(sql);
                    ps.setDouble(1, Double.parseDouble(searchText.replace(",", "")));
                    break;
            }

            rs = ps.executeQuery();

            // Tạo model mới cho bảng
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"STT", "EmployeeID", "Month", "Base Salary", "Bonus", "Thực lĩnh"},
                    0
            );

            int stt = 1;
            DecimalFormat formatter = new DecimalFormat("#,###.##");

            boolean foundResult = false;

            while (rs.next()) {
                foundResult = true;
                int employeeId = rs.getInt("employee_id");
                int month = rs.getInt("salary_month");
                int year = rs.getInt("salary_year");
                double baseSalary = rs.getDouble("basic_salary");
                double bonus = rs.getDouble("bonuses");
                double netSalary = rs.getDouble("net_salary");

                String monthYear = String.format("%02d/%d", month, year);

                model.addRow(new Object[]{
                    stt++,
                    employeeId,
                    monthYear,
                    formatter.format(baseSalary),
                    formatter.format(bonus),
                    formatter.format(netSalary)
                });
            }

            jtbSalary.setModel(model);

            // Kiểm tra nếu không có kết quả nào
            if (!foundResult) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jcbbTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbTimKiemActionPerformed
        jtfTimKiem.setText("");
        jtfTimKiem.requestFocus();
    }//GEN-LAST:event_jcbbTimKiemActionPerformed

    private void jtfTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbtTimKiem.doClick();
        }
    }//GEN-LAST:event_jtfTimKiemKeyPressed

    public boolean validateSearchCriteria(String criteria, String searchValue) {
        if (criteria.equals("EmployeeID") && !isValidEmployeeId(searchValue)) {
            return false; // Employee ID không hợp lệ
        }
        if (criteria.equals("Month") && !isValidMonth(searchValue)) {
            return false; // Tháng không hợp lệ
        }
        if (criteria.equals("BaseSalary") && !isValidSalary(searchValue)) {
            return false; // Lương cơ bản không hợp lệ
        }
        if (criteria.equals("Bonus") && !isValidSalary(searchValue)) {
            return false; // Tiền thưởng không hợp lệ
        }
        if (criteria.equals("NetSalary") && !isValidSalary(searchValue)) {
            return false; // Lương thực lĩnh không hợp lệ
        }
        return true;
    }

    private boolean isValidEmployeeId(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidMonth(String value) {
        // Kiểm tra định dạng tháng/năm (MM/YYYY)
        return value.matches("\\d{2}/\\d{4}");
    }

    private boolean isValidSalary(String value) {
        try {
            Double.parseDouble(value.replace(",", ""));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void jbtXuatEXELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXuatEXELActionPerformed
        String filePath = "E:\\Documents\\File Exel\\SalaryTable.xlsx"; // Đường dẫn lưu file Excel
        System.out.println("Đã nhấn nút xuất Excel");

        try {
            // Tạo workbook và sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Salary Table");

            // Lấy dữ liệu từ bảng
            TableModel model = jtbSalary.getModel(); // Giả sử bạn đã có bảng jtbSalary

            // Tạo tiêu đề cột
            Row headerRow = sheet.createRow(0);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(model.getColumnName(col));
            }

            // Lấy kết nối tới cơ sở dữ liệu
            Connection conn = null;
            conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Thêm dữ liệu vào các dòng
            for (int row = 0; row < model.getRowCount(); row++) {
                Row excelRow = sheet.createRow(row + 1);
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Cell cell = excelRow.createCell(col);
                    Object cellValue = model.getValueAt(row, col);

                    if (col == 0) { // Cột Employee ID, lấy thông tin từ cơ sở dữ liệu
                        int employeeId = (int) model.getValueAt(row, 0);
                        String fullName = getFullNameByEmployeeId(employeeId, conn); // Lấy tên đầy đủ từ bảng employees
                        cell.setCellValue(employeeId + " - " + fullName); // Kết hợp employee_id và full_name
                    } else {
                        if (cellValue != null) {
                            cell.setCellValue(cellValue.toString());
                        } else {
                            cell.setCellValue("N/A"); // Hiển thị "N/A" nếu giá trị là null
                        }
                    }
                }
            }
            // Ghi vào file
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
            workbook.close(); // Đóng workbook
            JOptionPane.showMessageDialog(null, "Xuất bảng lương ra Excel thành công!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất Excel: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jbtXuatEXELActionPerformed

// Phương thức lấy full name của employee theo employee_id
    private String getFullNameByEmployeeId(int employeeId, Connection conn) {
        String fullName = "";
        String sql = "SELECT full_name FROM employees WHERE employee_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                fullName = rs.getString("full_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fullName;
    }

    public void displaySalary() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Kết nối database
            conn = new DatabaseConnection().getJDBCConnection();

            if (conn == null) {
                System.out.println("Kết nối không thành công!");
                return;
            }

            // Query SQL kết hợp salary_month và salary_year
            String sql = "SELECT employee_id, salary_month, salary_year, "
                    + "basic_salary, bonuses, net_salary "
                    + "FROM salaries "
                    + "ORDER BY salary_year DESC, salary_month DESC";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            // Tạo model cho JTable với các cột phù hợp
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"STT", "EmployeeID", "Month", "Base Salary", "Day Off", "Bonus", "Net Salary"},
                    0 // số hàng ban đầu
            );

            int stt = 1; // Biến đếm STT

            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet
                int employeeId = rs.getInt("employee_id");
                int month = rs.getInt("salary_month");
                int year = rs.getInt("salary_year");
                String monthYear = String.format("%02d/%d", month, year);

                int dayOff = attendanceViews.getDayOffForEmployee(employeeId, monthYear); // Cập nhật để lấy số ngày nghỉ theo monthYear

                double baseSalary = rs.getDouble("basic_salary");
                double bonus = rs.getDouble("bonuses");
                double netSalary = rs.getDouble("net_salary");

                // Format số tiền với dấu phẩy ngăn cách hàng nghìn
                DecimalFormat formatter = new DecimalFormat("#,###.##");
                String formattedBaseSalary = formatter.format(baseSalary);
                String formattedBonus = formatter.format(bonus);
                String formattedNetSalary = formatter.format(netSalary);

                // Thêm dòng mới vào model
                model.addRow(new Object[]{
                    stt++, // STT tự tăng
                    employeeId, // Mã nhân viên
                    monthYear, // Tháng/năm đã format
                    formattedBaseSalary, // Lương cơ bản đã format
                    dayOff, // Ngày nghỉ
                    formattedBonus, // Thưởng đã format
                    formattedNetSalary // Thực lĩnh đã format
                });
            }

            // Set model cho JTable
            jtbSalary.setModel(model);

            // Căn chỉnh độ rộng cột
            if (jtbSalary.getColumnModel().getColumnCount() > 0) {
                jtbSalary.getColumnModel().getColumn(0).setPreferredWidth(50);
            }
        } catch (SQLException e) {
            System.err.println("Lỗi truy vấn database: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Lỗi không xác định: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Đóng các resource
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("Lỗi khi đóng kết nối: " + e.getMessage());
            }
        }
    }

    private void addTableClickListener() {
        jtbSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jtbSalary.getSelectedRow(); // Lấy chỉ số hàng được chọn
                if (row != -1) {
                    // Lấy dữ liệu từ các cột của hàng được chọn
                    String employeeId = jtbSalary.getValueAt(row, 1).toString();
                    String baseSalary = jtbSalary.getValueAt(row, 3).toString();
                    String bonus = jtbSalary.getValueAt(row, 5).toString();
                    String monthYear = jtbSalary.getValueAt(row, 2).toString();

                    // Hiển thị dữ liệu vào các JTextField tương ứng
                    jtfEmployeeID.setText(employeeId);

                    // Loại bỏ dấu phẩy từ baseSalary và bonus trước khi hiển thị
                    jtfBaseSalary.setText(baseSalary.replace(",", ""));
                    jtfBonus.setText(bonus.replace(",", ""));
                    jtfMonth.setText(monthYear);
                }
            }
        });
    }

    public void updateDayOff(int employeeId, String monthYear) {
        // Tách tháng và năm từ monthYear
        String[] parts = monthYear.split("/");
        if (parts.length != 2) {
            return;
        }

        int month;
        int year;
        try {
            month = Integer.parseInt(parts[0]);
            year = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return;
        }

        // Lấy số ngày nghỉ cho nhân viên
        int dayOff = attendanceViews.getDayOffForEmployee(employeeId, monthYear);

        // Cập nhật giá trị Day Off trong bảng jtbSalary
        boolean found = false;
        for (int i = 0; i < jtbSalary.getRowCount(); i++) {
            if (jtbSalary.getValueAt(i, 1).toString().equals(String.valueOf(employeeId))
                    && jtbSalary.getValueAt(i, 2).toString().equals(monthYear)) {
                jtbSalary.setValueAt(dayOff, i, 4);
                found = true;
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtTinhLuong;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JButton jbtXuatEXEL;
    private javax.swing.JComboBox<String> jcbbTimKiem;
    private javax.swing.JTable jtbSalary;
    private javax.swing.JTextField jtfBaseSalary;
    private javax.swing.JTextField jtfBonus;
    private javax.swing.JTextField jtfEmployeeID;
    private javax.swing.JTextField jtfMonth;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}
