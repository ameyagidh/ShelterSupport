/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SymptomsCheckerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TestingEnterprise;
import Business.Network.Network;
import Business.Organization.CovidBloodTestOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodTestWorkRequest;
import Business.WorkQueue.SymptomsCheckWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class SymptomsCheckWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterFacilitationWorkRequestJPanel
     */
    JPanel userProcessContainer;
    SymptomsCheckWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;

    SymptomsCheckWorkRequestJPanel(JPanel userProcessContainer, SymptomsCheckWorkRequest request, UserAccount userAccount, EcoSystem business) {
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
            Object[] rowSecond = new Object[5];
            rowSecond[0] = request.getHomelessPerson().getGender();
            rowSecond[1] = request.getHomelessPerson().isHasCriminalRecord() ? "Yes" : "No";
            rowSecond[2] = request.getHomelessPerson().isMajorIllness() ? "Yes" : "No";
            rowSecond[3] = request.getHomelessPerson().isCarrierDisease() ? "Yes" : "No";
            rowSecond[4] = request.getHomelessPerson().isGeneticDisease() ? "Yes" : "No";
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
        btnPassCheck = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords2 = new javax.swing.JTable();
        btnFailCheck = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        flueCheckBox = new javax.swing.JCheckBox();
        coldjCheckBox = new javax.swing.JCheckBox();
        feverjCheckBox = new javax.swing.JCheckBox();
        heartjCheckBox = new javax.swing.JCheckBox();
        kidneyjCheckBox = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPassCheck.setBackground(new java.awt.Color(181, 189, 137));
        btnPassCheck.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPassCheck.setText("Pass Symptoms Check");
        btnPassCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnPassCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 558, 250, 50));

        backJButton.setBackground(new java.awt.Color(181, 189, 137));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        tblHomelessPersonRecords1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "DOB", "City", "Current Location", "SSN", "Contact No", "Email Address", "Dependents"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHomelessPersonRecords1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, 1064, 150));

        tblHomelessPersonRecords2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gender", "Criminal Record?", "Major Illness??", "Carrier Illness??", "Genetic Illness??"
            }
        ));
        jScrollPane2.setViewportView(tblHomelessPersonRecords2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 362, 1064, 150));

        btnFailCheck.setBackground(new java.awt.Color(181, 189, 137));
        btnFailCheck.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnFailCheck.setText("Fail Symptoms Check");
        btnFailCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFailCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnFailCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 558, 250, 50));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(114, 158, 161));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SYMPTOMS CHECK");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1064, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Check Symptoms From below Person:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 148, 369, 34));

        jLabel1.setText("Symptoms");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 527, -1, -1));

        flueCheckBox.setText("Flu");

        coldjCheckBox.setText("Cold");

        feverjCheckBox.setText("Fever");

        heartjCheckBox.setText("Heart Pain");

        kidneyjCheckBox.setText("Kidney Pain");

        jLayeredPane1.setLayer(flueCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(coldjCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(feverjCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(heartjCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(kidneyjCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(flueCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coldjCheckBox)
                .addGap(18, 18, 18)
                .addComponent(feverjCheckBox)
                .addGap(18, 18, 18)
                .addComponent(heartjCheckBox)
                .addGap(18, 18, 18)
                .addComponent(kidneyjCheckBox)
                .addGap(0, 324, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flueCheckBox)
                    .addComponent(coldjCheckBox)
                    .addComponent(feverjCheckBox)
                    .addComponent(heartjCheckBox)
                    .addComponent(kidneyjCheckBox))
                .addContainerGap())
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 690, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1076, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPassCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassCheckActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        request.setTestResult("Sent to Covid Blood Tester");
        request.setStatus("Completed");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getHospitalAllocationWorkRequest().setReceiver(account);
        request.getHospitalAllocationWorkRequest().setTestResult("Completed by Symptoms Checker and send to Covid Blood Tester");
        ArrayList<String> symptoms = new ArrayList<>();

        BloodTestWorkRequest bloodTestWorkRequest = new BloodTestWorkRequest();
        bloodTestWorkRequest.setMessage("Check Blood for Covid");
        bloodTestWorkRequest.setSender(userAccount);
        bloodTestWorkRequest.setStatus("Sent");
        bloodTestWorkRequest.setHomelessPerson(request.getHomelessPerson());
        bloodTestWorkRequest.sethospitalAllocationWorkRequest(request.getHospitalAllocationWorkRequest());
        if (flueCheckBox.isSelected()) {
            symptoms.add("Flu");
        }
        if (coldjCheckBox.isSelected()) {
            symptoms.add("Cold");
        }
        if (feverjCheckBox.isSelected()) {
            symptoms.add("Fever");
        }
        if (heartjCheckBox.isSelected()) {
            symptoms.add("Heart");
        }
        if (kidneyjCheckBox.isSelected()) {
            symptoms.add("Kidney");
        }

        request.getHospitalAllocationWorkRequest().setSymptoms(symptoms);
        Date d = new Date();
        bloodTestWorkRequest.setRequestDate(d);
        Organization org = null;

        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof TestingEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof CovidBloodTestOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(bloodTestWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(bloodTestWorkRequest);
            JOptionPane.showMessageDialog(this, "Request Sent to Covid Blood Test Organization");
        }
    }//GEN-LAST:event_btnPassCheckActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SymptomsCheckWorkAreaJPanel dwjp = (SymptomsCheckWorkAreaJPanel) component;
        dwjp.populateReceiveTable();
        dwjp.populateSentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnFailCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFailCheckActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been failed by you!");
            return;
        }
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getHospitalAllocationWorkRequest().setReceiver(account);
        request.getHospitalAllocationWorkRequest().setTestResult("The request has been denied by Symptoms Checker as person had criminal record!");
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(this, "Volunteer has been updated abt failure!");
    }//GEN-LAST:event_btnFailCheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnFailCheck;
    private javax.swing.JButton btnPassCheck;
    private javax.swing.JCheckBox coldjCheckBox;
    private javax.swing.JCheckBox feverjCheckBox;
    private javax.swing.JCheckBox flueCheckBox;
    private javax.swing.JCheckBox heartjCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox kidneyjCheckBox;
    private javax.swing.JTable tblHomelessPersonRecords1;
    private javax.swing.JTable tblHomelessPersonRecords2;
    // End of variables declaration//GEN-END:variables
}
