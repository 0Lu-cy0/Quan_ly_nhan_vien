package quan_ly_nhan_vien.views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.ZoneId;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import com.toedter.calendar.JDateChooser;

public class AdminHomePage extends javax.swing.JFrame {

    public AdminHomePage() {
        initComponents();
        hienthi();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/quan_ly_nhan_vien/utils/Image/Home_icon.png")));
        j1.setVisible(true);
        j2.setVisible(false);
        jPanel2.setVisible(false);
        j4.setVisible(false);
        tab1.setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        PlainDocument doc = (PlainDocument) jtfEmployeeID.getDocument();
        doc.setDocumentFilter(new NumberFilter());  // Áp dụng NumberFilter
        jdcDateOfBirth.setDateFormatString("dd/MM/yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        j1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfEmployeeID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfJobTitle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtThemNhanVien = new javax.swing.JButton();
        jbtXoaNhanVien = new javax.swing.JButton();
        jbtSuaNhanVien = new javax.swing.JButton();
        jbtLamMoi = new javax.swing.JButton();
        jdcDateOfBirth = new com.toedter.calendar.JDateChooser();
        j2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        j4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "employee_id", "fullname", "date_of_birth", "job_title", "address", "password"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        j1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 290));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("employee_id");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 86, -1));
        jPanel5.add(jtfEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 15, 120, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("fullname");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 86, -1));
        jPanel5.add(jtfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 120, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("date_of_birth");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 86, -1));
        jPanel5.add(jtfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 89, 120, 25));
        jPanel5.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 52, 120, 25));
        jPanel5.add(jtfJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 15, 120, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("job_title");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 19, 86, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("address");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 52, 86, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("password");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 93, 86, -1));

        jbtThemNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThemNhanVien.setText("Thêm");
        jbtThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtThemNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jbtXoaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtXoaNhanVien.setText("Xoá");
        jbtXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtXoaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jbtSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtSuaNhanVien.setText("Sửa");
        jbtSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtSuaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jbtLamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtLamMoi.setText("Làm mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel5.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));
        jPanel5.add(jdcDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 90, 130, -1));

        j1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 540, 170));

        j2.setBackground(new java.awt.Color(255, 255, 255));
        j2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "attendance_id", "employee_id", "so ngay nghi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        j2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 540, 280));

        jLabel10.setText("attendance_id");
        j2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, -1));

        jLabel14.setText("so ngay nghi");
        j2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 80, -1));
        j2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        j2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 140, -1));

        jButton3.setText("thêm");
        j2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "salary_id", "employee_id", "base_salary", "bonus", "thực lĩnh"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        jLabel12.setText("salary_id");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 60, -1));

        jLabel15.setText("base_salary");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 140, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 140, -1));

        jLabel16.setText("bonus");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jButton4.setText("tính lương");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        j4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout j4Layout = new javax.swing.GroupLayout(j4);
        j4.setLayout(j4Layout);
        j4Layout.setHorizontalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        j4Layout.setVerticalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 550, 470));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setBackground(new java.awt.Color(153, 153, 255));
        tab1.setPreferredSize(new java.awt.Dimension(114, 63));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nhân viên");
        tab1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 16, 80, 31));

        jPanel3.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 170, 62));

        tab2.setBackground(new java.awt.Color(153, 153, 255));
        tab2.setPreferredSize(new java.awt.Dimension(114, 63));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });
        tab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Chấm công");
        jLabel2.setPreferredSize(new java.awt.Dimension(77, 21));
        tab2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 16, 85, 31));

        jPanel3.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 170, -1));

        tab3.setBackground(new java.awt.Color(153, 153, 255));
        tab3.setRequestFocusEnabled(false);
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });
        tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Tính lương");
        jLabel3.setPreferredSize(new java.awt.Dimension(77, 21));
        tab3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 16, 87, 31));

        jPanel3.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, 170, -1));

        tab4.setBackground(new java.awt.Color(153, 153, 255));
        tab4.setPreferredSize(new java.awt.Dimension(114, 63));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab4MouseEntered(evt);
            }
        });
        tab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("About me");
        tab4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 6, 80, 51));

        jPanel3.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 296, 170, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Admin");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Đăng xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 373, 170, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public class NumberFilter extends DocumentFilter {

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string != null && string.matches("\\d+")) { // Chỉ cho phép số
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text == null || text.isEmpty() || text.matches("\\d+")) { // Chấp nhận chuỗi rỗng hoặc chỉ cho phép số
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        // TODO add your handling code here:
        j1.setVisible(true);
        j2.setVisible(false);
        jPanel2.setVisible(false);
        j4.setVisible(false);
        tab1.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204, 204, 255));
        tab3.setBackground(new Color(204, 204, 255));
        tab4.setBackground(new Color(204, 204, 255));


    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        // TODO add your handling code here:
        j1.setVisible(false);
        j2.setVisible(true);
        jPanel2.setVisible(false);
        j4.setVisible(false);
        tab2.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204, 204, 255));
        tab3.setBackground(new Color(204, 204, 255));
        tab4.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
        j1.setVisible(false);
        j2.setVisible(false);
        jPanel2.setVisible(true);
        j4.setVisible(false);
        tab3.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204, 204, 255));
        tab1.setBackground(new Color(204, 204, 255));
        tab4.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_tab3MouseClicked

    private void tab4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseEntered

    }//GEN-LAST:event_tab4MouseEntered

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
        j1.setVisible(false);
        j2.setVisible(false);
        jPanel2.setVisible(false);
        j4.setVisible(true);
        tab4.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204, 204, 255));
        tab3.setBackground(new Color(204, 204, 255));
        tab1.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_tab4MouseClicked

    private void jbtThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemNhanVienActionPerformed
        try {
            String id = jtfEmployeeID.getText().trim();  // Lấy ID và loại bỏ khoảng trắng
            String ten = jtfFullName.getText().trim();  // Lấy tên và loại bỏ khoảng trắng
            String cv = jtfJobTitle.getText().trim();  // Lấy chức vụ
            String dc = jtfAddress.getText().trim();  // Lấy địa chỉ
            String pass = jtfPassword.getText().trim();  // Lấy mật khẩu

            // Kiểm tra xem các trường thông tin có bị rỗng hay không
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tài khoản không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Lấy ngày sinh từ JDateChooser
            Date ngaySinhDate = (Date) jdcDateOfBirth.getDate(); // Lấy ngày sinh từ JDateChooser
            if (ngaySinhDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate ngaySinh = ngaySinhDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Kiểm tra năm sinh
            int namSinh = ngaySinh.getYear();
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Mã hoá mật khẩu
            String hashedPassword = hashPassword(pass);

            // Câu lệnh SQL thêm nhân viên vào database
            String sql = "INSERT INTO employee (employee_id, fullname, date_of_birth, job_title, address, password) VALUES (?, ?, ?, ?, ?, ?)";
            Connection conn = new DatabaseConnection().getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, ten);
            ps.setDate(3, java.sql.Date.valueOf(ngaySinh));
            ps.setString(4, cv);
            ps.setString(5, dc);
            ps.setString(6, hashedPassword);

            int result = ps.executeUpdate();
            if (result > 0) {
                // Chỉ thêm dữ liệu vào bảng sau khi thêm vào database thành công
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.addRow(new Object[]{id, ten, ngaySinh.format(formatter), cv, dc, hashedPassword});

                JOptionPane.showMessageDialog(this, "Thêm thành công!");

                // Cập nhật lại bảng
                hienthi();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            ps.close();
            conn.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { // Mã lỗi cho trường hợp trùng lặp trong MySQL
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại, vui lòng chọn mã nhân viên khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (ex.getErrorCode() == 1406) { // Mã lỗi cho trường hợp dữ liệu quá dài
                JOptionPane.showMessageDialog(this, "Dữ liệu quá dài, vui lòng rút ngắn thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi SQL: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtThemNhanVienActionPerformed

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void jbtXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaNhanVienActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String employeeId = (String) model.getValueAt(selectedRow, 0);

        // Kiểm tra xem employeeId có phải là "Admin" không
        if ("Admin".equals(employeeId)) {
            JOptionPane.showMessageDialog(this, "Không thể xóa tài khoản Admin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa bản ghi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Connection conn = new DatabaseConnection().getJDBCConnection();
            try {

                // Bắt đầu transaction
                conn.setAutoCommit(false); // Tắt tự động cam kết

                // Xóa các bản ghi trong bảng attendance liên quan đến employee
                String deleteAttendanceSql = "DELETE FROM attendance WHERE employee_id = ?";
                PreparedStatement psDeleteAttendance = conn.prepareStatement(deleteAttendanceSql);
                psDeleteAttendance.setString(1, employeeId);
                psDeleteAttendance.executeUpdate();

                // Xóa các bản ghi trong bảng benefits liên quan đến employee
                String deleteBenefitsSql = "DELETE FROM benefits WHERE employee_id = ?";
                PreparedStatement psDeleteBenefits = conn.prepareStatement(deleteBenefitsSql);
                psDeleteBenefits.setString(1, employeeId);
                psDeleteBenefits.executeUpdate();

                // Xóa các bản ghi trong bảng salary liên quan đến employee
                String deleteSalarySql = "DELETE FROM salary WHERE employee_id = ?";
                PreparedStatement psDeleteSalary = conn.prepareStatement(deleteSalarySql);
                psDeleteSalary.setString(1, employeeId);
                psDeleteSalary.executeUpdate();

                // Cuối cùng, xóa bản ghi nhân viên
                String sql = "DELETE FROM employee WHERE employee_id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, employeeId);

                int result = ps.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    model.removeRow(selectedRow);  // Xóa dòng đã chọn trong bảng
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                // Cam kết transaction
                conn.commit();

                // Đóng tất cả PreparedStatement
                ps.close();
                psDeleteAttendance.close();
                psDeleteBenefits.close();
                psDeleteSalary.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                // Nếu có lỗi xảy ra, rollback transaction
                try {
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jbtXoaNhanVienActionPerformed

    private void jbtSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaNhanVienActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String employeeId = (String) model.getValueAt(selectedRow, 0);
        String ten = (String) model.getValueAt(selectedRow, 1);
        String ngaySinh = (String) model.getValueAt(selectedRow, 2);
        String chucVu = (String) model.getValueAt(selectedRow, 3);
        String diaChi = (String) model.getValueAt(selectedRow, 4);
        String matKhau = (String) model.getValueAt(selectedRow, 5);

        JTextField txtEmployeeId = new JTextField(employeeId);
        txtEmployeeId.setEditable(false);  // Đặt chỉ đọc cho ô mã nhân viên
        JTextField txtTen = new JTextField(ten);

        // Sử dụng JDateChooser thay thế JTextField để chọn ngày
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");  // Đặt định dạng ngày tháng

        // Nếu ngày sinh không rỗng, đặt giá trị ban đầu cho JDateChooser
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if (ngaySinh != null && !ngaySinh.isEmpty()) {
                dateChooser.setDate(sdf.parse(ngaySinh));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JTextField txtChucVu = new JTextField(chucVu);
        JTextField txtDiaChi = new JTextField(diaChi);
        JTextField txtMatKhau = new JTextField(matKhau);

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("ID Nhân viên:"));
        panel.add(txtEmployeeId);
        panel.add(new JLabel("Họ và tên:"));
        panel.add(txtTen);
        panel.add(new JLabel("Ngày sinh (dd/MM/yyyy):"));
        panel.add(dateChooser);  // Thêm JDateChooser vào panel thay cho JTextField
        panel.add(new JLabel("Chức vụ:"));
        panel.add(txtChucVu);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(txtDiaChi);
        panel.add(new JLabel("Mật khẩu:"));
        panel.add(txtMatKhau);

        int result = JOptionPane.showConfirmDialog(this, panel, "Sửa thông tin", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // Thiết lập các trường rỗng thành "N/A"
                String newTen = txtTen.getText().trim().isEmpty() ? "N/A" : txtTen.getText();
                String newNgaySinh = ngaySinh;  // Sử dụng giá trị ngày sinh cũ mặc định
                String newChucVu = txtChucVu.getText().trim().isEmpty() ? "N/A" : txtChucVu.getText();
                String newDiaChi = txtDiaChi.getText().trim().isEmpty() ? "N/A" : txtDiaChi.getText();
                String newMatKhau = txtMatKhau.getText().trim().isEmpty() ? "N/A" : txtMatKhau.getText();

                // Nếu người dùng đã chọn ngày mới trong JDateChooser, lấy giá trị đó
                if (dateChooser.getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    newNgaySinh = sdf.format(dateChooser.getDate());
                }

                String sql = "UPDATE employee SET fullname = ?, date_of_birth = ?, job_title = ?, address = ?, password = ? WHERE employee_id = ?";
                Connection conn = new DatabaseConnection().getJDBCConnection();
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, newTen);

                // Nếu newNgaySinh không phải là "N/A", thì mới thực hiện chuyển đổi và định dạng ngày tháng
                if (!newNgaySinh.equals("N/A")) {
                    try {
                        ps.setDate(2, java.sql.Date.valueOf(LocalDate.parse(newNgaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                    } catch (DateTimeParseException e) {
                        JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ! Vui lòng nhập theo định dạng dd/MM/yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    ps.setString(2, null);  // Nếu để trống hoặc là "N/A", thì giữ giá trị ngày sinh như cũ
                }

                ps.setString(3, newChucVu);
                ps.setString(4, newDiaChi);
                ps.setString(5, newMatKhau);
                ps.setString(6, employeeId);

                int updateResult = ps.executeUpdate();

                if (updateResult > 0) {
                    model.setValueAt(newTen, selectedRow, 1);
                    model.setValueAt(newNgaySinh, selectedRow, 2);
                    model.setValueAt(newChucVu, selectedRow, 3);
                    model.setValueAt(newDiaChi, selectedRow, 4);
                    model.setValueAt(newMatKhau, selectedRow, 5);

                    JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                ps.close();
                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtSuaNhanVienActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        hienthi();
        jtfEmployeeID.setText("");
        jtfFullName.setText("");
        jdcDateOfBirth.setDate(null);  // Đặt lại giá trị của JDateChooser
        jtfJobTitle.setText("");
        jtfAddress.setText("");
        jtfPassword.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Người dùng xác nhận muốn đăng xuất
            // Mở lại màn hình đăng nhập
            Login login = new Login();
            login.setVisible(true);
            dispose();  // Đóng AdminHomePage
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    public void hienthi() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = new DatabaseConnection().getJDBCConnection();

            // Câu lệnh SQL để lấy dữ liệu
            String sql = "SELECT employee_id, fullname, date_of_birth, job_title, address, password FROM employee";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            // Tạo một mô hình bảng không thể chỉnh sửa
            DefaultTableModel model = new DefaultTableModel(new String[]{"Employee ID", "Full Name", "Date of Birth", "Job Title", "Address", "Password"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Vô hiệu hóa việc chỉnh sửa cho tất cả các ô
                    return false;
                }
            };

            // Định dạng để hiển thị ngày tháng theo kiểu dd/MM/yyyy
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                String id = rs.getString("employee_id") != null ? rs.getString("employee_id") : "N/A";
                String ten = rs.getString("fullname") != null ? rs.getString("fullname") : "N/A";

                String ngaySinhGoc = rs.getString("date_of_birth");
                String ngaySinh = "N/A"; // Giá trị mặc định
                if (ngaySinhGoc != null && !ngaySinhGoc.isEmpty()) {
                    try {
                        // Chuyển đổi từ chuỗi sang java.util.Date bằng SimpleDateFormat
                        Date ngaySinhDate = new SimpleDateFormat("yyyy-MM-dd").parse(ngaySinhGoc);
                        ngaySinh = dateFormat.format(ngaySinhDate); // Định dạng ngày tháng
                    } catch (ParseException e) {
                        // Trường hợp định dạng không hợp lệ, vẫn giữ nguyên "N/A"
                        e.printStackTrace();
                    }
                }

                String chucVu = rs.getString("job_title") != null ? rs.getString("job_title") : "N/A";
                String diaChi = rs.getString("address") != null ? rs.getString("address") : "N/A";
                String matKhau = "********"; // Thay thế mật khẩu bằng chuỗi "********"

                // Thêm dữ liệu vào bảng
                model.addRow(new Object[]{id, ten, ngaySinh, chucVu, diaChi, matKhau});
            }

            // Cập nhật mô hình cho jTable2
            jTable2.setModel(model);

            // Đóng kết nối
            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            // Vô hiệu hóa việc chỉnh sửa cho tất cả các ô
            return false;
        }
    };

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AdminHomePage().setVisible(true);

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JButton jbtSuaNhanVien;
    private javax.swing.JButton jbtThemNhanVien;
    private javax.swing.JButton jbtXoaNhanVien;
    private com.toedter.calendar.JDateChooser jdcDateOfBirth;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmployeeID;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JTextField jtfJobTitle;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    // End of variables declaration//GEN-END:variables
}
