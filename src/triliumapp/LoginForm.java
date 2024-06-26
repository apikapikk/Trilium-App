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
public class LoginForm extends javax.swing.JFrame {
    int xx,xy;
    
    public LoginForm() {
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

        bg1 = new triliumapp.custom.customPanel();
        customPanel1 = new triliumapp.custom.customPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logintxt1 = new javax.swing.JLabel();
        usernameValue = new javax.swing.JTextField();
        passwordValue = new javax.swing.JTextField();
        motto = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        registerbtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();

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

        bg1.setBackground(new java.awt.Color(223, 245, 255));
        bg1.setRoundBottomLeft(30);
        bg1.setRoundBottomRight(30);
        bg1.setRoundTopLeft(30);
        bg1.setRoundTopRight(30);

        customPanel1.setBackground(new java.awt.Color(83, 86, 255));
        customPanel1.setRoundBottomRight(30);
        customPanel1.setRoundTopRight(30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triliumapp/image/Presentation (2).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TRILIUM");

        jLabel3.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cari Guru Privat Anda dengan mudah dan modern");

        jLabel4.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("versi 0.01");

        javax.swing.GroupLayout customPanel1Layout = new javax.swing.GroupLayout(customPanel1);
        customPanel1.setLayout(customPanel1Layout);
        customPanel1Layout.setHorizontalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanel1Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1Layout.createSequentialGroup()
                        .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1))
                            .addGroup(customPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19))))
        );
        customPanel1Layout.setVerticalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );

        logintxt1.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 36)); // NOI18N
        logintxt1.setForeground(new java.awt.Color(0, 0, 0));
        logintxt1.setText("Selamat Datang");

        usernameValue.setBackground(new java.awt.Color(103, 198, 227));
        usernameValue.setForeground(new java.awt.Color(255, 255, 255));
        usernameValue.setText("Username");
        usernameValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 140, 231)));

        passwordValue.setBackground(new java.awt.Color(103, 198, 227));
        passwordValue.setForeground(new java.awt.Color(255, 255, 255));
        passwordValue.setText("Password");
        passwordValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 140, 231)));

        motto.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 12)); // NOI18N
        motto.setForeground(new java.awt.Color(102, 102, 102));
        motto.setText("Silahkan Masukkan Username dan Password anda");

        loginbtn.setBackground(new java.awt.Color(83, 86, 255));
        loginbtn.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 12)); // NOI18N
        loginbtn.setText("Login ");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });

        registerbtn.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        registerbtn.setForeground(new java.awt.Color(83, 86, 255));
        registerbtn.setText("Belum mempunyai akun? silahkan register");
        registerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerbtnMouseClicked(evt);
            }
        });

        closebtn.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(83, 86, 255));
        closebtn.setText("tutup aplikasi");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(logintxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameValue)
                                .addComponent(passwordValue)
                                .addComponent(motto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(registerbtn)))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(customPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(logintxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(motto)
                .addGap(21, 21, 21)
                .addComponent(usernameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebtn)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void registerbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtnMouseClicked
       Chooser cs = new Chooser();
       cs.setVisible(true);
       cs.revalidate();
       dispose();
    }//GEN-LAST:event_registerbtnMouseClicked

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        ChooserLogin cl = new ChooserLogin();
        cl.setVisible(true);
        cl.revalidate();
        dispose();
    }//GEN-LAST:event_loginbtnMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private triliumapp.custom.customPanel bg1;
    private javax.swing.JLabel closebtn;
    private triliumapp.custom.customPanel customPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel logintxt1;
    private javax.swing.JLabel motto;
    private javax.swing.JTextField passwordValue;
    private javax.swing.JLabel registerbtn;
    private javax.swing.JTextField usernameValue;
    // End of variables declaration//GEN-END:variables
}
