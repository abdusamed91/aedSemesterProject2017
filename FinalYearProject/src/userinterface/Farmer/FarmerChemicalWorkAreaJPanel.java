/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.UserAccount.FarmerUserAccount;
import Business.WorkQueue.AgricultureProductRequest;
import Business.WorkQueue.SoilConditionReport;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author abdusamed
 */
public class FarmerChemicalWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private FarmerUserAccount account;

    /**
     * Creates new form FarmerChemicalWorkAreaJPanel
     */

    FarmerChemicalWorkAreaJPanel(JPanel userProcessContainer, FarmerUserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        populateCombo();
    }
    
    public void populateCombo(){
        cmbProductRequested.removeAllItems();
        for(AgricultureProductRequest.AgricultureProduct product : AgricultureProductRequest.AgricultureProduct.values() ){
            cmbProductRequested.addItem(product);
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

        btngrpOrganic = new javax.swing.ButtonGroup();
        btngrpQuantiy = new javax.swing.ButtonGroup();
        btngrpPreference = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbProductRequested = new javax.swing.JComboBox();
        btnSubmitRequest = new javax.swing.JButton();
        btnCancelRequest = new javax.swing.JButton();
        radioYesOrganic = new javax.swing.JRadioButton();
        radioNoOrganic = new javax.swing.JRadioButton();
        radio4Ton = new javax.swing.JRadioButton();
        radio2Ton = new javax.swing.JRadioButton();
        radio20Bag = new javax.swing.JRadioButton();
        radio40Bag = new javax.swing.JRadioButton();
        jxDateDelievery = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        jxDateSoilDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel9 = new javax.swing.JLabel();
        btnSubmitRequest1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Farmer Chemical WorkArea JPanel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Create Agriculture Product Request");

        jLabel3.setText("Organic Farmer");

        jLabel4.setText("Quantity Preference");

        jLabel5.setText("Bag Preference");

        jLabel6.setText("Agriculture Product Request");

        jLabel7.setText("Approximate Date Delivery");

        cmbProductRequested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductRequestedActionPerformed(evt);
            }
        });

        btnSubmitRequest.setText("Submit Product Request");
        btnSubmitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequestActionPerformed(evt);
            }
        });

        btnCancelRequest.setText("Back");
        btnCancelRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRequestActionPerformed(evt);
            }
        });

        btngrpOrganic.add(radioYesOrganic);
        radioYesOrganic.setText("Yes");

        btngrpOrganic.add(radioNoOrganic);
        radioNoOrganic.setText("No");

        btngrpQuantiy.add(radio4Ton);
        radio4Ton.setText("4 Ton");

        btngrpQuantiy.add(radio2Ton);
        radio2Ton.setText("2 Ton");

        btngrpPreference.add(radio20Bag);
        radio20Bag.setText("20-Lb Bags");

        btngrpPreference.add(radio40Bag);
        radio40Bag.setText("40-Lb Bags");

        jxDateDelievery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxDateDelieveryActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Request for Soil Conditioning");

        jxDateSoilDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxDateSoilDateActionPerformed(evt);
            }
        });

        jLabel9.setText("Select Date for Scheduling");

        btnSubmitRequest1.setText("Submit Soil Request");
        btnSubmitRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequest1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(btnCancelRequest))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jxDateSoilDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmitRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio4Ton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioYesOrganic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(235, 235, 235))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radio20Bag)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radio40Bag)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jxDateDelievery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioNoOrganic, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(radio2Ton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbProductRequested, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmitRequest)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio20Bag)
                            .addComponent(radio40Bag, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(radioYesOrganic)
                            .addComponent(radioNoOrganic, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(radio4Ton)
                            .addComponent(radio2Ton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jxDateDelievery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbProductRequested, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnSubmitRequest)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jxDateSoilDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitRequest1))
                .addGap(18, 18, 18)
                .addComponent(btnCancelRequest)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductRequestedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductRequestedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductRequestedActionPerformed

    private void btnCancelRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRequestActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerFarmerWorkAreaJPanel dwjp = (FarmerFarmerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCancelRequestActionPerformed

    private void jxDateDelieveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxDateDelieveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jxDateDelieveryActionPerformed

    private void jxDateSoilDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxDateSoilDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jxDateSoilDateActionPerformed

    private void btnSubmitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequestActionPerformed
        // TODO add your handling code here:
        
        if(btngrpOrganic.getSelection() == null || btngrpQuantiy.getSelection() == null || btngrpPreference.getSelection() == null || jxDateDelievery.getDate() == null || cmbProductRequested.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Invalid Submission. Please Try Again", "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
        
        AgricultureProductRequest request = new AgricultureProductRequest();
        
        if(btngrpOrganic.getSelection().equals(radioYesOrganic.getModel())){
            request.setOrganicFarmer(true);}else{request.setOrganicFarmer(false);}
        
        if(btngrpQuantiy.getSelection().equals(radio4Ton.getModel())){
            request.setQuantityPreference("4 Ton");}else{request.setQuantityPreference("2 Ton");}
        
        if(btngrpPreference.getSelection().equals(radio40Bag)){
            request.setBagPreference("40-Lb Bags");}else{request.setBagPreference("20-Lb Bag");}
        
        request.setRequestDate(jxDateDelievery.getDate());
        request.setSender(account);
        
        AgricultureProductRequest.AgricultureProduct agricultureProductRequest = (AgricultureProductRequest.AgricultureProduct) cmbProductRequested.getSelectedItem();
        request.setAgricultureProduct(agricultureProductRequest);
        
        account.getChemicalProductWorkQueue().add(request);
        JOptionPane.showMessageDialog(null, "Agriculture Request Made. Thank You.", "Warning", JOptionPane.OK_OPTION);}
        
    }//GEN-LAST:event_btnSubmitRequestActionPerformed

    private void btnSubmitRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequest1ActionPerformed
        // TODO add your handling code here:
        if (jxDateSoilDate.getDate() == null){
            JOptionPane.showMessageDialog(null, "Invalid Entry. Please Try Again", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
        SoilConditionReport request = new SoilConditionReport();
        request.setRequestDate(jxDateSoilDate.getDate());
        request.setSender(account);
        
        account.getChemicalSoilWorkQueue().add(request);
        JOptionPane.showMessageDialog(null, "Soil Request Made. Thank You.", "Good", JOptionPane.DEFAULT_OPTION);
        }
        
    }//GEN-LAST:event_btnSubmitRequest1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRequest;
    private javax.swing.JButton btnSubmitRequest;
    private javax.swing.JButton btnSubmitRequest1;
    private javax.swing.ButtonGroup btngrpOrganic;
    private javax.swing.ButtonGroup btngrpPreference;
    private javax.swing.ButtonGroup btngrpQuantiy;
    private javax.swing.JComboBox cmbProductRequested;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jxDateDelievery;
    private org.jdesktop.swingx.JXDatePicker jxDateSoilDate;
    private javax.swing.JRadioButton radio20Bag;
    private javax.swing.JRadioButton radio2Ton;
    private javax.swing.JRadioButton radio40Bag;
    private javax.swing.JRadioButton radio4Ton;
    private javax.swing.JRadioButton radioNoOrganic;
    private javax.swing.JRadioButton radioYesOrganic;
    // End of variables declaration//GEN-END:variables
}
