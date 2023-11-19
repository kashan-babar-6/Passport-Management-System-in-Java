
import com.sun.source.tree.VariableTree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class LoginAs extends javax.swing.JFrame {

    /**
     * Creates new form LoginAs
     */
    public LoginAs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        loginAsLabel = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnApplicant = new javax.swing.JButton();
        btnApplicant1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        bgPanel.setBackground(new java.awt.Color(0, 51, 0));

        loginAsLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginAsLabel.setForeground(new java.awt.Color(204, 255, 204));
        loginAsLabel.setText("Proceed As");

        btnAdmin.setBackground(new java.awt.Color(51, 102, 0));
        btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(204, 255, 204));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/adminUser.png"))); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.setBorder(null);
        btnAdmin.setBorderPainted(false);
        btnAdmin.setFocusPainted(false);
        btnAdmin.setFocusable(false);
        btnAdmin.setRequestFocusEnabled(false);
        btnAdmin.setRolloverEnabled(false);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnApplicant.setBackground(new java.awt.Color(51, 102, 0));
        btnApplicant.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnApplicant.setForeground(new java.awt.Color(204, 255, 204));
        btnApplicant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N
        btnApplicant.setText("Applicant");
        btnApplicant.setBorder(null);
        btnApplicant.setBorderPainted(false);
        btnApplicant.setFocusPainted(false);
        btnApplicant.setFocusable(false);
        btnApplicant.setRequestFocusEnabled(false);
        btnApplicant.setRolloverEnabled(false);
        btnApplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicantActionPerformed(evt);
            }
        });

        btnApplicant1.setBackground(new java.awt.Color(51, 102, 0));
        btnApplicant1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnApplicant1.setForeground(new java.awt.Color(204, 255, 204));
        btnApplicant1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/searchApplicants.png"))); // NOI18N
        btnApplicant1.setText(" Search Applicant");
        btnApplicant1.setBorder(null);
        btnApplicant1.setBorderPainted(false);
        btnApplicant1.setFocusPainted(false);
        btnApplicant1.setFocusable(false);
        btnApplicant1.setRequestFocusEnabled(false);
        btnApplicant1.setRolloverEnabled(false);
        btnApplicant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicant1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(loginAsLabel)
                .addGap(242, 242, 242))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnApplicant1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(loginAsLabel)
                .addGap(73, 73, 73)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnApplicant1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        AdminLogin adminLogin= new AdminLogin();
        this.setVisible(false);
        adminLogin.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnApplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicantActionPerformed
        // TODO add your handling code here:
        ApplicantSignup asSignup= new ApplicantSignup();
        asSignup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnApplicantActionPerformed

    private void btnApplicant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicant1ActionPerformed
        // TODO add your handling code here:
        ApplicantSearch asSearch= new ApplicantSearch();
        this.setVisible(false);
        asSearch.setVisible(true);
    }//GEN-LAST:event_btnApplicant1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnApplicant;
    private javax.swing.JButton btnApplicant1;
    private javax.swing.JLabel loginAsLabel;
    // End of variables declaration//GEN-END:variables
}
