/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package triliumapp;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class RegisterForm1 extends javax.swing.JFrame {

   int xx,xy;
    public RegisterForm1() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customPanel1 = new triliumapp.custom.customPanel();
        customPanel2 = new triliumapp.custom.customPanel();
        nameRegValue = new javax.swing.JTextField();
        reglabel = new javax.swing.JLabel();
        reglabel1 = new javax.swing.JLabel();
        addressRegValue = new javax.swing.JTextField();
        reglabel2 = new javax.swing.JLabel();
        yearRegValue1 = new javax.swing.JTextField();
        reglabel5 = new javax.swing.JLabel();
        schoolsRegValue = new javax.swing.JTextField();
        reglabel6 = new javax.swing.JLabel();
        historyRegValue = new javax.swing.JTextField();
        reglabel7 = new javax.swing.JLabel();
        emailRegValue = new javax.swing.JTextField();
        reglabel8 = new javax.swing.JLabel();
        usernameRegValue = new javax.swing.JTextField();
        passwordRegValue = new javax.swing.JTextField();
        reglabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        customPanel1.setBackground(new java.awt.Color(83, 86, 255));
        customPanel1.setRoundBottomLeft(30);
        customPanel1.setRoundBottomRight(30);
        customPanel1.setRoundTopLeft(30);
        customPanel1.setRoundTopRight(30);

        customPanel2.setBackground(new java.awt.Color(223, 245, 255));
        customPanel2.setRoundBottomLeft(30);
        customPanel2.setRoundBottomRight(30);
        customPanel2.setRoundTopLeft(50);
        customPanel2.setRoundTopRight(50);

        nameRegValue.setBackground(new java.awt.Color(103, 198, 227));
        nameRegValue.setForeground(new java.awt.Color(255, 255, 255));
        nameRegValue.setText("Nama");

        reglabel.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel.setForeground(new java.awt.Color(0, 204, 204));
        reglabel.setText("Nama Lengkap");

        reglabel1.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel1.setForeground(new java.awt.Color(0, 204, 204));
        reglabel1.setText("Domisili ( Kota Tinggal )");

        addressRegValue.setBackground(new java.awt.Color(103, 198, 227));
        addressRegValue.setForeground(new java.awt.Color(255, 255, 255));
        addressRegValue.setText("Kota");

        reglabel2.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel2.setForeground(new java.awt.Color(0, 204, 204));
        reglabel2.setText("Tahun, Tanggal Kelahiran");

        yearRegValue1.setBackground(new java.awt.Color(103, 198, 227));
        yearRegValue1.setForeground(new java.awt.Color(255, 255, 255));
        yearRegValue1.setText("cth :02-07-1995");

        reglabel5.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel5.setForeground(new java.awt.Color(0, 204, 204));
        reglabel5.setText("Lembaga Sekolahan Terakhir");

        schoolsRegValue.setBackground(new java.awt.Color(103, 198, 227));
        schoolsRegValue.setForeground(new java.awt.Color(255, 255, 255));
        schoolsRegValue.setText("cth : Universitas Negeri Surabaya");

        reglabel6.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel6.setForeground(new java.awt.Color(0, 204, 204));
        reglabel6.setText("Pengalaman Mengajar ");

        historyRegValue.setBackground(new java.awt.Color(103, 198, 227));
        historyRegValue.setForeground(new java.awt.Color(255, 255, 255));
        historyRegValue.setText("cth : 2 Tahun");
        historyRegValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyRegValueActionPerformed(evt);
            }
        });

        reglabel7.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel7.setForeground(new java.awt.Color(0, 204, 204));
        reglabel7.setText("Email ");

        emailRegValue.setBackground(new java.awt.Color(103, 198, 227));
        emailRegValue.setForeground(new java.awt.Color(255, 255, 255));
        emailRegValue.setText("Masukkan Email");
        emailRegValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRegValueActionPerformed(evt);
            }
        });

        reglabel8.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel8.setForeground(new java.awt.Color(0, 204, 204));
        reglabel8.setText("Username");

        usernameRegValue.setBackground(new java.awt.Color(103, 198, 227));
        usernameRegValue.setForeground(new java.awt.Color(255, 255, 255));
        usernameRegValue.setText("Username");
        usernameRegValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRegValueActionPerformed(evt);
            }
        });

        passwordRegValue.setBackground(new java.awt.Color(103, 198, 227));
        passwordRegValue.setForeground(new java.awt.Color(255, 255, 255));
        passwordRegValue.setText("Password");
        passwordRegValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRegValueActionPerformed(evt);
            }
        });

        reglabel9.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        reglabel9.setForeground(new java.awt.Color(0, 204, 204));
        reglabel9.setText("Passowrd");

        jButton3.setBackground(new java.awt.Color(83, 86, 255));
        jButton3.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Batal");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customPanel2Layout = new javax.swing.GroupLayout(customPanel2);
        customPanel2.setLayout(customPanel2Layout);
        customPanel2Layout.setHorizontalGroup(
            customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customPanel2Layout.createSequentialGroup()
                        .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(yearRegValue1)
                                .addComponent(reglabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addressRegValue, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(nameRegValue)
                                .addComponent(reglabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reglabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(schoolsRegValue)
                            .addComponent(reglabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historyRegValue)
                            .addComponent(reglabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailRegValue)
                            .addComponent(reglabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameRegValue)
                        .addComponent(reglabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordRegValue)
                        .addComponent(reglabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customPanel2Layout.setVerticalGroup(
            customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel2Layout.createSequentialGroup()
                        .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customPanel2Layout.createSequentialGroup()
                                .addComponent(reglabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(customPanel2Layout.createSequentialGroup()
                                .addComponent(reglabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schoolsRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reglabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel2Layout.createSequentialGroup()
                        .addComponent(reglabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historyRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customPanel2Layout.createSequentialGroup()
                        .addComponent(reglabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearRegValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customPanel2Layout.createSequentialGroup()
                        .addComponent(reglabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reglabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reglabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordRegValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jLabel1.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buat Akunmu");

        jLabel4.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Silahkan Masukkan data diri anda sesuai dengan ketentuan yang diminta");

        javax.swing.GroupLayout customPanel1Layout = new javax.swing.GroupLayout(customPanel1);
        customPanel1.setLayout(customPanel1Layout);
        customPanel1Layout.setHorizontalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(customPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        customPanel1Layout.setVerticalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(customPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       xx = evt.getX();
       xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x- xx, y- xy);
    }//GEN-LAST:event_formMouseDragged

    private void emailRegValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRegValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailRegValueActionPerformed

    private void passwordRegValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRegValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordRegValueActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.revalidate();
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void usernameRegValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRegValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRegValueActionPerformed

    private void historyRegValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyRegValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyRegValueActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressRegValue;
    private triliumapp.custom.customPanel customPanel1;
    private triliumapp.custom.customPanel customPanel2;
    private javax.swing.JTextField emailRegValue;
    private javax.swing.JTextField historyRegValue;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameRegValue;
    private javax.swing.JTextField passwordRegValue;
    private javax.swing.JLabel reglabel;
    private javax.swing.JLabel reglabel1;
    private javax.swing.JLabel reglabel2;
    private javax.swing.JLabel reglabel5;
    private javax.swing.JLabel reglabel6;
    private javax.swing.JLabel reglabel7;
    private javax.swing.JLabel reglabel8;
    private javax.swing.JLabel reglabel9;
    private javax.swing.JTextField schoolsRegValue;
    private javax.swing.JTextField usernameRegValue;
    private javax.swing.JTextField yearRegValue1;
    // End of variables declaration//GEN-END:variables
}
