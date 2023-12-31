/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ApplicantSearch extends javax.swing.JFrame {

    /**
     * Creates new form ApplicantSearch
     */
    
    //Data Members
    int iD=0;
    DBConnection db= new DBConnection();
    
    public ApplicantSearch() {
        initComponents();
        applicantPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtSearchId = new javax.swing.JTextField();
        applicantPanel = new javax.swing.JPanel();
        IdTitle = new javax.swing.JLabel();
        nameTitle = new javax.swing.JLabel();
        fNameTitle = new javax.swing.JLabel();
        emailTitle = new javax.swing.JLabel();
        genderTitle = new javax.swing.JLabel();
        dobTitle = new javax.swing.JLabel();
        addressTitle = new javax.swing.JLabel();
        cnicTitle = new javax.swing.JLabel();
        cnicTitle1 = new javax.swing.JLabel();
        statusTitle = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        fatherNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cnicLabel = new javax.swing.JLabel();
        birthPlaceLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Search Applicant");

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 255, 204));
        btnBack.setText("< Back");
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearchId.setBackground(new java.awt.Color(0, 51, 0));
        txtSearchId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearchId.setForeground(new java.awt.Color(204, 255, 204));
        txtSearchId.setToolTipText("");
        txtSearchId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Applicant ID: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(204, 255, 204))); // NOI18N

        applicantPanel.setBackground(new java.awt.Color(0, 51, 0));

        IdTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IdTitle.setForeground(new java.awt.Color(204, 255, 204));
        IdTitle.setText("Applicant's ID: ");

        nameTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameTitle.setForeground(new java.awt.Color(204, 255, 204));
        nameTitle.setText("Applicant's Name: ");

        fNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fNameTitle.setForeground(new java.awt.Color(204, 255, 204));
        fNameTitle.setText("Father Name: ");

        emailTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailTitle.setForeground(new java.awt.Color(204, 255, 204));
        emailTitle.setText("E-mail: ");

        genderTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderTitle.setForeground(new java.awt.Color(204, 255, 204));
        genderTitle.setText("Gender:");

        dobTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dobTitle.setForeground(new java.awt.Color(204, 255, 204));
        dobTitle.setText("Date of Birth: ");

        addressTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addressTitle.setForeground(new java.awt.Color(204, 255, 204));
        addressTitle.setText("Address: ");

        cnicTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cnicTitle.setForeground(new java.awt.Color(204, 255, 204));
        cnicTitle.setText("CNIC:");

        cnicTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cnicTitle1.setForeground(new java.awt.Color(204, 255, 204));
        cnicTitle1.setText("Birth Place: ");

        statusTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statusTitle.setForeground(new java.awt.Color(204, 255, 204));
        statusTitle.setText("Status:");

        IdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(204, 255, 204));
        IdLabel.setText("jLabel1");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 255, 204));
        nameLabel.setText("jLabel1");

        fatherNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fatherNameLabel.setForeground(new java.awt.Color(204, 255, 204));
        fatherNameLabel.setText("jLabel1");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(204, 255, 204));
        emailLabel.setText("jLabel1");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(204, 255, 204));
        genderLabel.setText("jLabel1");

        dobLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(204, 255, 204));
        dobLabel.setText("jLabel1");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(204, 255, 204));
        addressLabel.setText("jLabel1");

        cnicLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cnicLabel.setForeground(new java.awt.Color(204, 255, 204));
        cnicLabel.setText("jLabel1");

        birthPlaceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthPlaceLabel.setForeground(new java.awt.Color(204, 255, 204));
        birthPlaceLabel.setText("jLabel1");

        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(204, 255, 204));
        statusLabel.setText("jLabel1");

        javax.swing.GroupLayout applicantPanelLayout = new javax.swing.GroupLayout(applicantPanel);
        applicantPanel.setLayout(applicantPanelLayout);
        applicantPanelLayout.setHorizontalGroup(
            applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicantPanelLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusTitle)
                    .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameTitle)
                        .addComponent(fNameTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(emailTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(genderTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dobTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addressTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cnicTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cnicTitle1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(IdTitle, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(applicantPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fatherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cnicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthPlaceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(applicantPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                .addGap(187, 187, 187))
        );
        applicantPanelLayout.setVerticalGroup(
            applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicantPanelLayout.createSequentialGroup()
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdTitle)
                    .addComponent(IdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTitle)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameTitle)
                    .addComponent(fatherNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTitle)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderTitle)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobTitle)
                    .addComponent(dobLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTitle)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnicTitle)
                    .addComponent(cnicLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnicTitle1)
                    .addComponent(birthPlaceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusTitle)
                    .addComponent(statusLabel))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        searchBtn.setBackground(new java.awt.Color(51, 153, 0));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(204, 255, 204));
        searchBtn.setText("Search");
        searchBtn.setBorderPainted(false);
        searchBtn.setFocusPainted(false);
        searchBtn.setRequestFocusEnabled(false);
        searchBtn.setRolloverEnabled(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)
                        .addGap(0, 239, Short.MAX_VALUE))
                    .addComponent(applicantPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applicantPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        LoginAs aslogin= new LoginAs();
        this.setVisible(false);
        aslogin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:

        try {
            iD= Integer.parseInt(txtSearchId.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid Input");
        }

        String fetchQuery= "SELECT * FROM Applicants WHERE applicantID= '"+iD+"'";

        ResultSet dataSet=db.selectData(fetchQuery);

        try {
            if(dataSet.next()) {
                applicantPanel.setVisible(true);

                IdLabel.setText(String.valueOf(dataSet.getInt(1)));
                nameLabel.setText(String.valueOf(dataSet.getString(2)));
                fatherNameLabel.setText(String.valueOf(dataSet.getString(3)));
                emailLabel.setText(String.valueOf(dataSet.getString(4)));
                genderLabel.setText(String.valueOf(dataSet.getString(5)));
                dobLabel.setText(String.valueOf(dataSet.getString(6)));
                addressLabel.setText(String.valueOf(dataSet.getString(7)));
                cnicLabel.setText(String.valueOf(dataSet.getString(8)));
                birthPlaceLabel.setText(String.valueOf(dataSet.getString(9)));
                statusLabel.setText(String.valueOf(dataSet.getString(10)));
            }
            else {
                JOptionPane.showMessageDialog(null, "Error: Not Data Found");
                applicantPanel.setVisible(false);
            }
        } catch (HeadlessException | SQLException e) {
            applicantPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Error Occured");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ApplicantSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicantSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicantSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicantSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ApplicantSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel IdTitle;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressTitle;
    private javax.swing.JPanel applicantPanel;
    private javax.swing.JLabel birthPlaceLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel cnicLabel;
    private javax.swing.JLabel cnicTitle;
    private javax.swing.JLabel cnicTitle1;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dobTitle;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailTitle;
    private javax.swing.JLabel fNameTitle;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameTitle;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusTitle;
    private javax.swing.JTextField txtSearchId;
    // End of variables declaration//GEN-END:variables
}
