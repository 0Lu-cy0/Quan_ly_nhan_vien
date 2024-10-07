package quan_ly_nhan_vien.views;

public class ChangePassword extends javax.swing.JFrame {

    public ChangePassword() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Đổi mật khẩu");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jtfTaiKhoan = new javax.swing.JTextField();
        jtfMatKhauHienTai = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jtfNhapMaXacNhanOTP = new javax.swing.JPasswordField();
        lblPasswordError = new javax.swing.JLabel();
        jtfMatKhauMoi = new javax.swing.JPasswordField();
        cbHienThiMatKhau = new javax.swing.JCheckBox();
        jbtNhanMaOTP = new javax.swing.JButton();
        jtfXacNhanMatKhau = new javax.swing.JPasswordField();
        jbtXacNhanDoiMatKhau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 40));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 470, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "ĐỔI MẬT KHẨU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfTaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Tài khoản(MNV)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTaiKhoanActionPerformed(evt);
            }
        });
        jPanel5.add(jtfTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 452, 50));

        jtfMatKhauHienTai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfMatKhauHienTai.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mật khẩu hiện tại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfMatKhauHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatKhauHienTaiActionPerformed(evt);
            }
        });
        jPanel5.add(jtfMatKhauHienTai, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, 452, 50));

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, -1));

        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblConfirmPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 440, -1));

        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblUsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 440, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfNhapMaXacNhanOTP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfNhapMaXacNhanOTP.setForeground(new java.awt.Color(0, 102, 102));
        jtfNhapMaXacNhanOTP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mã xác nhận", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfNhapMaXacNhanOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNhapMaXacNhanOTPActionPerformed(evt);
            }
        });
        jPanel6.add(jtfNhapMaXacNhanOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 452, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 300, 460, 63));

        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lblPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 380, -1));

        jtfMatKhauMoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfMatKhauMoi.setForeground(new java.awt.Color(0, 102, 102));
        jtfMatKhauMoi.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Mật khẩu mới", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatKhauMoiActionPerformed(evt);
            }
        });
        jPanel5.add(jtfMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 452, 50));

        cbHienThiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbHienThiMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        cbHienThiMatKhau.setText("Hiển thị");
        cbHienThiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienThiMatKhauActionPerformed(evt);
            }
        });
        jPanel5.add(cbHienThiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jbtNhanMaOTP.setText("Nhận mã");
        jbtNhanMaOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNhanMaOTPActionPerformed(evt);
            }
        });
        jPanel5.add(jbtNhanMaOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jtfXacNhanMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfXacNhanMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jtfXacNhanMatKhau.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Xác nhận mật khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfXacNhanMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfXacNhanMatKhauActionPerformed(evt);
            }
        });
        jPanel5.add(jtfXacNhanMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 233, 452, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 470, 390));

        jbtXacNhanDoiMatKhau.setText("Đổi mật khẩu");
        jbtXacNhanDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXacNhanDoiMatKhauActionPerformed(evt);
            }
        });
        getContentPane().add(jbtXacNhanDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbHienThiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienThiMatKhauActionPerformed
        if (cbHienThiMatKhau.isSelected()) {
            jtfMatKhauMoi.setEchoChar((char) 0);  // Hiển thị mật khẩu
            jtfNhapMaXacNhanOTP.setEchoChar((char) 0); //Hiển thị nhập lại mk
        } else {
            jtfMatKhauMoi.setEchoChar('*');  // Ẩn mật khẩu
            jtfNhapMaXacNhanOTP.setEchoChar('*'); //Ẩn nhập lại mk
        }
    }//GEN-LAST:event_cbHienThiMatKhauActionPerformed

    private void jtfTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTaiKhoanActionPerformed

    private void jtfNhapMaXacNhanOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNhapMaXacNhanOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNhapMaXacNhanOTPActionPerformed

    private void jtfMatKhauHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatKhauHienTaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatKhauHienTaiActionPerformed

    private void jtfMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatKhauMoiActionPerformed

    private void jtfXacNhanMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfXacNhanMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfXacNhanMatKhauActionPerformed

    private void jbtNhanMaOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNhanMaOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtNhanMaOTPActionPerformed

    private void jbtXacNhanDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXacNhanDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtXacNhanDoiMatKhauActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbHienThiMatKhau;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton jbtNhanMaOTP;
    private javax.swing.JButton jbtXacNhanDoiMatKhau;
    private javax.swing.JTextField jtfMatKhauHienTai;
    private javax.swing.JPasswordField jtfMatKhauMoi;
    private javax.swing.JPasswordField jtfNhapMaXacNhanOTP;
    private javax.swing.JTextField jtfTaiKhoan;
    private javax.swing.JPasswordField jtfXacNhanMatKhau;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    // End of variables declaration//GEN-END:variables
}
