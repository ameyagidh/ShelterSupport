/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LocalHospitalAgencyEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReportGenerationOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DiseaseAnalyzerWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.ReportGenerationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class PharmacyWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PharmacyWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public PharmacyWorkRequestJPanel(JPanel userProcessContainer, PharmacyWorkRequest request, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblPersonRecords.getModel();
        model1.setRowCount(0);
        if (request.getHomelessPerson() != null) {
            Object[] row = new Object[4];
            row[0] = request.getHomelessPerson().getName();
            row[1] = request.getHomelessPerson().getIncome();
            row[2] = request.getHospitalAllocationWorkRequest().getDiseasesForHomeless().get(0);
            row[3] = request.getHomelessPerson().getContactNo();
            model1.addRow(row);
        }

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
        jPanel2 = new javax.swing.JPanel();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFieldSchemeOption1 = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonRecords = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(223, 190, 153));

        submitJButton.setBackground(new java.awt.Color(181, 189, 137));
        submitJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Medicines Given");

        backJButton.setBackground(new java.awt.Color(181, 189, 137));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        tblPersonRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Income", "Disease Details", "Contact Number"
            }
        ));
        jScrollPane1.setViewportView(tblPersonRecords);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Provide Medicines");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(114, 158, 161));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Give Medicines");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Medicines will be allocated to below Person:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFieldSchemeOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 750, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(76, 76, 76)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldSchemeOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1131, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        if (txtFieldSchemeOption1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Atleast provide one scheme option!");
            return;
        }
        List<String> schemes = new ArrayList<>();
        if (!txtFieldSchemeOption1.getText().equals("")) {
            schemes.add(txtFieldSchemeOption1.getText());
        }

        request.setTestResult("Send For Health Report Genration");
        request.setStatus("Completed");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getHospitalAllocationWorkRequest().setReceiver(account);
        request.getHospitalAllocationWorkRequest().setTestResult("Completed by Scheme Provider and sent to ReportFinalizer");
        ReportGenerationWorkRequest fcRequest = new ReportGenerationWorkRequest();
        fcRequest.setMessage("Finalize Report");
        fcRequest.setSender(userAccount);
        fcRequest.setStatus("Sent");
        fcRequest.setHomelessPerson(request.getHomelessPerson());
        fcRequest.sethospitalAllocationWorkRequest(request.getHospitalAllocationWorkRequest());
        fcRequest.setFinalmedicines(schemes.get(0));
        Date d = new Date();
        fcRequest.setRequestDate(d);
        Organization org = null;
        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof LocalHospitalAgencyEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof ReportGenerationOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(fcRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(fcRequest);
            JOptionPane.showMessageDialog(this, "Request Sent to Health Report Generation");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyWorkAreaJPanel dwjp = (PharmacyWorkAreaJPanel) component;
        dwjp.populateReceiveTable();
        dwjp.populateSentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable tblPersonRecords;
    private javax.swing.JTextField txtFieldSchemeOption1;
    // End of variables declaration//GEN-END:variables
}