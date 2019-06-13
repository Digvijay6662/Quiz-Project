/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tqa.music.ButtonMusic;
import tqa.pojo.UserProfile;

/**
 *
 * @author DIGVIJAY
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserAdminFrame
     */
    public AdminOptionsFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        super.setTitle("THE QUIZ APP");
        Toolkit t = Toolkit.getDefaultToolkit();
        this.setIconImage(t.getImage(getClass().getResource("../images/adminIcon.png")));
        lblUserName.setText("Hello " + UserProfile.getUsername());
        customCursor();
    }

    public void customCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage(getClass().getResource("../images/MangekyouCursor.png"));
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "MangekyouCursor");
        this.setCursor(cursor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        imgAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbSet = new javax.swing.JRadioButton();
        jrbEdit = new javax.swing.JRadioButton();
        jrbRegister = new javax.swing.JRadioButton();
        jrbView = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(138, 46, 226));

        imgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tqa/images/admin.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Minion Pro Cond", 0, 36)); // NOI18N
        jLabel1.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        jLabel2.setFont(new java.awt.Font("Stencil Std", 0, 18)); // NOI18N
        jLabel2.setText("MAKE A CHOICE");

        buttonGroup1.add(jrbSet);
        jrbSet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbSet.setText("SET A PAPER");

        buttonGroup1.add(jrbEdit);
        jrbEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbEdit.setText("EDIT PAPER");

        buttonGroup1.add(jrbRegister);
        jrbRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbRegister.setText("REGISTER STUDENT");

        buttonGroup1.add(jrbView);
        jrbView.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbView.setText("VIEW SCORES");

        btnDoTask.setBackground(new java.awt.Color(204, 0, 204));
        btnDoTask.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        btnDoTask.setText("DO TASK");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setText("LOGOUT");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoTask)
                    .addComponent(jrbEdit)
                    .addComponent(jrbRegister)
                    .addComponent(jrbView)
                    .addComponent(jrbSet)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imgAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jrbSet)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jrbRegister)
                        .addGap(18, 18, 18)
                        .addComponent(jrbView)))
                .addGap(18, 18, 18)
                .addComponent(btnDoTask)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame userFrame = new LoginFrame();
        userFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        Font f = new Font("Tahoma", Font.ITALIC + Font.BOLD, 14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        Font f = new Font("Tahoma", Font.BOLD, 14);
        lblLogout.setFont(f);

    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        ButtonMusic bm = new ButtonMusic();
        bm.start();
        String task = getOption();
        if (task == null) {
            JOptionPane.showMessageDialog(null, "Please Choose An Option", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JFrame jf = null;
        if (task.equals("SET A PAPER")) {
            jf = new SetPaperFrame();
        } else if (task.equals("EDIT PAPER")) {
            jf = new EditPaperFrame();
        } else if (task.equals("REGISTER STUDENT")) {
            jf = new RegisterStudentFrame();
        } else {
            jf = new ViewScoresFrame();
        }
        jf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    private String getOption() {
        if (jrbSet.isSelected()) {
            return jrbSet.getText();
        } else if (jrbEdit.isSelected()) {
            return jrbEdit.getText();
        } else if (jrbRegister.isSelected()) {
            return jrbRegister.getText();
        } else if (jrbView.isSelected()) {
            return jrbView.getText();
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbEdit;
    private javax.swing.JRadioButton jrbRegister;
    private javax.swing.JRadioButton jrbSet;
    private javax.swing.JRadioButton jrbView;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}