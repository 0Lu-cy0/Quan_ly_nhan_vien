package quan_ly_nhan_vien.views;

import java.util.ArrayList;
import java.util.List;
import quan_ly_nhan_vien.controllers.ChuyenManHinh;
import quan_ly_nhan_vien.models.DanhMuc;
import quan_ly_nhan_vien.utils.DatabaseConnection;

public class TrangChinh extends javax.swing.JFrame {

    ChuyenManHinh controllerCH; 
    public TrangChinh() {
        initComponents();
        controllerCH = new ChuyenManHinh(jpnViews);
        controllerCH.setView(jpnNhanVien, jlbNhanVien);
        List<DanhMuc> listItem = new ArrayList<>();
        listItem.add(new DanhMuc("NhanVien", jpnNhanVien, jlbNhanVien));
        listItem.add(new DanhMuc("ChamCong", jpnChamCong, jlbChamCong));
        listItem.add(new DanhMuc("TinhLuong", jpnTinhLuong, jlbTinhLuong));
        listItem.add(new DanhMuc("About", jpnAbout, jlbAbout));
        controllerCH.setEvent(listItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTinhLuong = new javax.swing.JPanel();
        jlbTinhLuong = new javax.swing.JLabel();
        jpnChamCong = new javax.swing.JPanel();
        jlbChamCong = new javax.swing.JLabel();
        jpnAbout = new javax.swing.JPanel();
        jlbAbout = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlbNhanVien3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlbNhanVien4 = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnViews = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(740, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, -1));

        jpnTinhLuong.setForeground(new java.awt.Color(0, 102, 102));
        jpnTinhLuong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTinhLuong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbTinhLuong.setText("Tính lương");
        jpnTinhLuong.add(jlbTinhLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        jPanel1.add(jpnTinhLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 170, 60));

        jpnChamCong.setForeground(new java.awt.Color(0, 102, 102));
        jpnChamCong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbChamCong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbChamCong.setText("Chấm công");
        jpnChamCong.add(jlbChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        jPanel1.add(jpnChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 60));

        jpnAbout.setForeground(new java.awt.Color(0, 102, 102));
        jpnAbout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbAbout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbAbout.setText("Về chúng tôi");
        jpnAbout.add(jlbAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, -1));

        jPanel1.add(jpnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 60));

        jPanel7.setForeground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNhanVien3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNhanVien3.setText("Đăng xuất");
        jPanel7.add(jlbNhanVien3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        jPanel8.setForeground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNhanVien4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNhanVien4.setText("Nhân viên");
        jPanel8.add(jlbNhanVien4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 60));

        jpnNhanVien.setForeground(new java.awt.Color(0, 102, 102));
        jpnNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNhanVien.setText("Nhân viên");
        jpnNhanVien.add(jlbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        jPanel1.add(jpnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 170, 500));

        jpnViews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jpnViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jlbAbout;
    private javax.swing.JLabel jlbChamCong;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbNhanVien3;
    private javax.swing.JLabel jlbNhanVien4;
    private javax.swing.JLabel jlbTinhLuong;
    private javax.swing.JPanel jpnAbout;
    private javax.swing.JPanel jpnChamCong;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnTinhLuong;
    private javax.swing.JPanel jpnViews;
    // End of variables declaration//GEN-END:variables
}
