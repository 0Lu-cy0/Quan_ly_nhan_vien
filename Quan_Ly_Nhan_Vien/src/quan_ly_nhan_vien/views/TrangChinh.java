package quan_ly_nhan_vien.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import quan_ly_nhan_vien.models.DanhMuc;

public class TrangChinh extends javax.swing.JFrame {

    ChuyenManHinh controllerCH;

    public TrangChinh() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Admin Hoamepage");
        controllerCH = new ChuyenManHinh(jpnViews);
        controllerCH.setView(jpnNhanVien, jlbNhanVien);

// Tạo một danh sách chứa các thông tin về từng mục
        List<Object[]> listItem = new ArrayList<>();
        listItem.add(new Object[]{"NhanVien", jpnNhanVien, jlbNhanVien});
        listItem.add(new Object[]{"ChamCong", jpnChamCong, jlbChamCong});
        listItem.add(new Object[]{"TinhLuong", jpnTinhLuong, jlbTinhLuong});
        listItem.add(new Object[]{"About", jpnAbout, jlbAbout});

// Gọi phương thức setEvent với danh sách thông tin
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
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jbtDangXuat = new javax.swing.JButton();
        jpnViews = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(740, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ADMIN");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, -1));

        jpnTinhLuong.setBackground(new java.awt.Color(0, 102, 102));
        jpnTinhLuong.setForeground(new java.awt.Color(0, 102, 102));
        jpnTinhLuong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTinhLuong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbTinhLuong.setForeground(new java.awt.Color(255, 255, 255));
        jlbTinhLuong.setText("Tính lương");
        jpnTinhLuong.add(jlbTinhLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        jPanel1.add(jpnTinhLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 170, 60));

        jpnChamCong.setBackground(new java.awt.Color(0, 102, 102));
        jpnChamCong.setForeground(new java.awt.Color(0, 102, 102));
        jpnChamCong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbChamCong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbChamCong.setForeground(new java.awt.Color(255, 255, 255));
        jlbChamCong.setText("Chấm công");
        jpnChamCong.add(jlbChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        jPanel1.add(jpnChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 60));

        jpnAbout.setBackground(new java.awt.Color(0, 102, 102));
        jpnAbout.setForeground(new java.awt.Color(0, 102, 102));
        jpnAbout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbAbout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbAbout.setForeground(new java.awt.Color(255, 255, 255));
        jlbAbout.setText("Thông tin");
        jpnAbout.add(jlbAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, -1));

        jPanel1.add(jpnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 60));

        jpnNhanVien.setBackground(new java.awt.Color(0, 102, 102));
        jpnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jpnNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setText("Nhân viên");
        jpnNhanVien.add(jlbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        jPanel1.add(jpnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 60));

        jbtDangXuat.setBackground(new java.awt.Color(0, 102, 102));
        jbtDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jbtDangXuat.setText("Đăng Xuất");
        jbtDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(jbtDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 170, 500));

        jpnViews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jpnViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class ChuyenManHinh {

        private JPanel root;
        private String kindSelected = "";
        private String kindHovered = "";
        private List<Object[]> listItem;

        public ChuyenManHinh(JPanel jpnRoot) {
            this.root = jpnRoot;
        }

        public void setView(JPanel jpnItem, JLabel jlbItem) {
            kindSelected = "SanPham";
            jlbItem.setBackground(new Color(0, 51, 51));
            jpnItem.setBackground(new Color(0, 51, 51));
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(new EmployeeViews(), BorderLayout.CENTER);
            root.revalidate();
            root.repaint();
        }

        public void setEvent(List<Object[]> listItem) {
            this.listItem = listItem;
            for (Object[] item : listItem) {
                JLabel jlb = (JLabel) item[2];
                JPanel jpn = (JPanel) item[1];
                String kind = (String) item[0];
                jlb.addMouseListener(new LaBelEvent(kind, jpn, jlb));
            }
        }

        class LaBelEvent implements MouseListener {

            private String kind;
            private JPanel jpnItem;

            public LaBelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
                this.kind = kind;
                this.jpnItem = jpnItem;
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                JPanel node = switch (kind) {
                    case "NhanVien" ->
                        new EmployeeViews();
                    case "ChamCong" ->
                        new AttendanceViews();
                    case "TinhLuong" ->
                        new SalaryViews();
                    case "About" ->
                        new About();
                    default ->
                        new JPanel();
                };
                root.removeAll();
                root.setLayout(new BorderLayout());
                root.add(node, BorderLayout.CENTER);
                root.revalidate();
                root.repaint();
                setChangeBackground();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                kindHovered = kind;
                setChangeBackground();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                kindHovered = "";
                setChangeBackground();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                kindSelected = kind;
                setChangeBackground();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        }

        private void setChangeBackground() {
            for (Object[] item : listItem) {
                JLabel jlb = (JLabel) item[2];
                JPanel jpn = (JPanel) item[1];
                if (kindSelected.equals(item[0]) || kindHovered.equals(item[0])) {
                    jlb.setBackground(new Color(0, 51, 51));
                    jpn.setBackground(new Color(0, 51, 51));
                } else {
                    jlb.setBackground(new Color(0, 102, 102));
                    jpn.setBackground(new Color(0, 102, 102));
                }
            }
        }
    }

    private void jbtDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangXuatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            LoginViews login = new LoginViews();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtDangXuatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TrangChinh().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtDangXuat;
    private javax.swing.JLabel jlbAbout;
    private javax.swing.JLabel jlbChamCong;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbTinhLuong;
    private javax.swing.JPanel jpnAbout;
    private javax.swing.JPanel jpnChamCong;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnTinhLuong;
    private javax.swing.JPanel jpnViews;
    // End of variables declaration//GEN-END:variables
}
