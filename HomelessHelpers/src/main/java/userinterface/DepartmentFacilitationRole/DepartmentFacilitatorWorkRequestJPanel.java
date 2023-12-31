/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DepartmentFacilitationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TestingEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SymptomsCheckOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DepartmentFacilitationWorkRequest;
import Business.WorkQueue.SymptomsCheckWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class DepartmentFacilitatorWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentFacilitatorWorkRequestJPanel
     */
    JPanel userProcessContainer;
    DepartmentFacilitationWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;

    DepartmentFacilitatorWorkRequestJPanel(JPanel userProcessContainer, DepartmentFacilitationWorkRequest request, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblHomelessPersonRecord.getModel();
        model1.setRowCount(0);
        if (request.getHomelessPerson() != null) {
            Object[] row = new Object[6];
            row[0] = request.getHomelessPerson().getName();
            row[1] = request.getHomelessPerson().getContactNo();
            row[2] = request.getHomelessPerson().getEmailAddress();
            row[3] = request.getHomelessPerson().getCurrentAddress();
            row[4] = request.getHospitalAllocationWorkRequest().gethospitalToBePlaced();
            row[5] = request.getHomelessPerson().getDependents();
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
        btnYes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomelessPersonRecord = new javax.swing.JTable();
        btnNo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        departmentFacilitatorWorkRequest_departmentJComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));

        btnYes.setBackground(new java.awt.Color(181, 189, 137));
        btnYes.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Was the person placed at selected Hospital?");

        backJButton.setBackground(new java.awt.Color(181, 189, 137));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 158, 161));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Department Facilitator");

        tblHomelessPersonRecord.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact No", "Email Address", "Pickup Address", "Hospital Address", "Dependents"
            }
        ));
        jScrollPane1.setViewportView(tblHomelessPersonRecord);

        btnNo.setBackground(new java.awt.Color(181, 189, 137));
        btnNo.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Person Details:");

        departmentFacilitatorWorkRequest_departmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "ENT", "Heart", "Kidney" }));
        departmentFacilitatorWorkRequest_departmentJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentFacilitatorWorkRequest_departmentJComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Select Department");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(departmentFacilitatorWorkRequest_departmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(departmentFacilitatorWorkRequest_departmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1167, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed

        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        request.setTestResult("Sent to Symptoms Check");
        request.setStatus("Completed");
        request.getHospitalAllocationWorkRequest().setTestResult("Completed by Department Facilitator and send to Symptoms Checker");
        request.getHospitalAllocationWorkRequest().setDepartment(departmentFacilitatorWorkRequest_departmentJComboBox.getSelectedItem().toString());
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getHospitalAllocationWorkRequest().setReceiver(account);
        SymptomsCheckWorkRequest symptomsCheckWorkRequest = new SymptomsCheckWorkRequest();
        symptomsCheckWorkRequest.setMessage("Check Symptoms");
        symptomsCheckWorkRequest.setSender(userAccount);
        symptomsCheckWorkRequest.setStatus("Sent");
        symptomsCheckWorkRequest.setHomelessPerson(request.getHomelessPerson());
        symptomsCheckWorkRequest.setHospitalAllocationWorkRequest(request.getHospitalAllocationWorkRequest());
        Date d = new Date();
        symptomsCheckWorkRequest.setRequestDate(d);
        Organization org = null;
        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof TestingEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof SymptomsCheckOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(symptomsCheckWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(symptomsCheckWorkRequest);
            JOptionPane.showMessageDialog(this, "Request Sent to Symptoms check");
        }
    }//GEN-LAST:event_btnYesActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DepartmentFacilitationWorkAreaJPanel wp = (DepartmentFacilitationWorkAreaJPanel) component;
        wp.populateReceiveTable();
        wp.populateSentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        request.getHospitalAllocationWorkRequest().setTestResult("The request has been denied by Department Facilitator as he was unable to locate the person!");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getHospitalAllocationWorkRequest().setReceiver(account);
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(this, "Volunteer has been updated!");
    }//GEN-LAST:event_btnNoActionPerformed

    private void departmentFacilitatorWorkRequest_departmentJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentFacilitatorWorkRequest_departmentJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentFacilitatorWorkRequest_departmentJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JComboBox<String> departmentFacilitatorWorkRequest_departmentJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHomelessPersonRecord;
    // End of variables declaration//GEN-END:variables
}
