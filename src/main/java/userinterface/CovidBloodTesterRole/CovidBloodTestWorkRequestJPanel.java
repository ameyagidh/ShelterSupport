/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CovidBloodTesterRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LocalHospitalAgencyEnterprise;
import Business.Network.Network;
import Business.Organization.DiseaseAnalysisOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodTestWorkRequest;
import Business.WorkQueue.DiseaseAnalyzerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class CovidBloodTestWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    BloodTestWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public CovidBloodTestWorkRequestJPanel(JPanel userProcessContainer, BloodTestWorkRequest request, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        populateTable();
    }

       /**
     * Populates table
     */
    public void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblHomelessPersonRecords1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblHomelessPersonRecords2.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        if (request.getHomelessPerson() != null) {
            Object[] row = new Object[8];
            row[0] = request.getHomelessPerson().getName();
            row[1] = request.getHomelessPerson().getDob();
            row[2] = request.getHomelessPerson().getCity();
            row[3] = request.getHomelessPerson().getCurrentAddress();
            row[4] = request.getHomelessPerson().getSSNNo();
            row[5] = request.getHomelessPerson().getContactNo();
            row[6] = request.getHomelessPerson().getEmailAddress();
            row[7] = request.getHomelessPerson().getDependents();
            model1.addRow(row);
            Object[] rowSecond = new Object[6];
            rowSecond[0] = request.gethospitalAllocationWorkRequest().getSymptoms().toString();
            rowSecond[1] = request.getHomelessPerson().getGender();
            rowSecond[2] = request.getHomelessPerson().isHasCriminalRecord() ? "Yes" : "No";
            rowSecond[3] = request.getHomelessPerson().isMajorIllness() ? "Yes" : "No";
            rowSecond[4] = request.getHomelessPerson().isCarrierDisease() ? "Yes" : "No";
            rowSecond[5] = request.getHomelessPerson().isGeneticDisease() ? "Yes" : "No";
            model2.addRow(rowSecond);

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
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords2 = new javax.swing.JTable();
        btnPassCheck = new javax.swing.JButton();
        btnFailCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(104, 144, 146));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        tblHomelessPersonRecords1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecords1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "DOB", "City", "current address", "SSNNo", "Contact No", "Email Address", "Dependents"
            }
        ));
        jScrollPane1.setViewportView(tblHomelessPersonRecords1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 185, 1155, 103));

        tblHomelessPersonRecords2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecords2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Symptoms", "Gender", "Criminal Record?", "Major Illness??", "Carrier Illness??", "Genetic Illness??"
            }
        ));
        jScrollPane2.setViewportView(tblHomelessPersonRecords2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 300, 1155, 105));

        btnPassCheck.setBackground(new java.awt.Color(104, 144, 146));
        btnPassCheck.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnPassCheck.setText("Mark Covid -");
        btnPassCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnPassCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 423, 250, 50));

        btnFailCheck.setBackground(new java.awt.Color(104, 144, 146));
        btnFailCheck.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnFailCheck.setText("Mark Covid +");
        btnFailCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFailCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnFailCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 423, 250, 50));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 144, 146));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Covid Blood Test WORK AREA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1155, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Person Details:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, 1155, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1173, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CovidBloodTestWorkAreaJPanel dwjp = (CovidBloodTestWorkAreaJPanel) component;
        dwjp.populateReceiveTable();
        dwjp.populateSentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnPassCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassCheckActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        request.setStatus("Completed");
        request.setTestResult("Sent to Disease Analyzer");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.gethospitalAllocationWorkRequest().setReceiver(account);
        request.gethospitalAllocationWorkRequest().setTestResult("Completed by Covid Blood Tester and and sent to Disease Analyzerr");
        DiseaseAnalyzerWorkRequest fcRequest = new DiseaseAnalyzerWorkRequest();
        fcRequest.setMessage("Disease Analysis");
        fcRequest.setSender(userAccount);
        fcRequest.setStatus("Sent");
        fcRequest.setHomelessPerson(request.getHomelessPerson());
        fcRequest.sethospitalAllocationWorkRequest(request.gethospitalAllocationWorkRequest());
        Date d = new Date();
        fcRequest.setRequestDate(d);
        Organization org = null;

        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof LocalHospitalAgencyEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DiseaseAnalysisOrganization) {
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
            JOptionPane.showMessageDialog(this, "Request Sent to Disease Analysis Organization");
        }
    }//GEN-LAST:event_btnPassCheckActionPerformed

    private void btnFailCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFailCheckActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.gethospitalAllocationWorkRequest().setReceiver(account);
        request.gethospitalAllocationWorkRequest().setTestResult("The request has been denied by Covid Blood Checker!");
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(this, "Volunteer has been updated abt failure!");
    }//GEN-LAST:event_btnFailCheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnFailCheck;
    private javax.swing.JButton btnPassCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHomelessPersonRecords1;
    private javax.swing.JTable tblHomelessPersonRecords2;
    // End of variables declaration//GEN-END:variables
}
