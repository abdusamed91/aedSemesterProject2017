/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.Network.Product;
import Business.UserAccount.FarmerUserAccount;
import Business.WorkQueue.MachineryRequest;
import Business.WorkQueue.ProducePickUpRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author abdusamed
 */
public class FarmerTransportWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private FarmerUserAccount account;

    /**
     * Creates new form FarmerTransportWorkAreaJPanel
     */

    FarmerTransportWorkAreaJPanel(JPanel userProcessContainer, FarmerUserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        populateComboboxProduce();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTruckSize = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jXDatePickerMachinery = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        btnSubmitRequest = new javax.swing.JButton();
        btnCancelRequest = new javax.swing.JButton();
        radioLonghaul = new javax.swing.JRadioButton();
        radioMini = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboxMachinerySelection = new javax.swing.JComboBox<>();
        btnSubmitMachinery = new javax.swing.JButton();
        jXDatePickUp = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        cmbProduceType = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCancelRequest1 = new javax.swing.JButton();

        jLabel1.setText("Farmer Trasnport WorkArea JPanel");

        jXDatePickerMachinery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickerMachineryActionPerformed(evt);
            }
        });

        jLabel7.setText("Pick-Up Date");

        btnSubmitRequest.setText("Submit Request");
        btnSubmitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequestActionPerformed(evt);
            }
        });

        btnCancelRequest.setText("Cancel Request");
        btnCancelRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRequestActionPerformed(evt);
            }
        });

        btnGrpTruckSize.add(radioLonghaul);
        radioLonghaul.setText("Long Haul");

        btnGrpTruckSize.add(radioMini);
        radioMini.setText("Mini");

        jLabel2.setText("Create Pick-Up Request");

        jLabel3.setText("Truck Size");

        jLabel6.setText("Request Machinery For Rent");

        comboxMachinerySelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combine Harvestor", "Tractor", "Mobile Milling Unit" }));
        comboxMachinerySelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMachinerySelectionActionPerformed(evt);
            }
        });

        btnSubmitMachinery.setText("Submit Request");
        btnSubmitMachinery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitMachineryActionPerformed(evt);
            }
        });

        jXDatePickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickUpActionPerformed(evt);
            }
        });

        jLabel8.setText("Produce Type");

        jLabel9.setText("Machinery Type");

        jLabel10.setText("Select Date");

        btnCancelRequest1.setText("Back");
        btnCancelRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRequest1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCancelRequest)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmitRequest))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioMini)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioLonghaul))
                                .addComponent(cmbProduceType, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXDatePickUp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXDatePickerMachinery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboxMachinerySelection, 0, 209, Short.MAX_VALUE))))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelRequest1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmitMachinery)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioLonghaul)
                            .addComponent(radioMini)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXDatePickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbProduceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelRequest)
                            .addComponent(btnSubmitRequest))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(comboxMachinerySelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDatePickerMachinery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitMachinery)
                    .addComponent(btnCancelRequest1))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jXDatePickerMachineryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickerMachineryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePickerMachineryActionPerformed

    private void btnCancelRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRequestActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerFarmerWorkAreaJPanel dwjp = (FarmerFarmerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCancelRequestActionPerformed

    private void comboxMachinerySelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMachinerySelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxMachinerySelectionActionPerformed

    private void btnSubmitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequestActionPerformed
        // TODO add your handling code here:
        if(btnGrpTruckSize.getSelection() == null || jXDatePickUp.getDate() == null || cmbProduceType.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(null, "Invalid Entry. Please Try Again", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            ProducePickUpRequest request = new ProducePickUpRequest();
            if(btnGrpTruckSize.getSelection().equals(radioLonghaul)){
                request.setTruckSize("Long Haul");
            }else{
                request.setTruckSize("Mini Truck");
            }
            request.setRequestDate(jXDatePickUp.getDate());
            request.setSender(account);
            request.setStatus("Created By Farmer");

            Product.ProductType type = (Product.ProductType) cmbProduceType.getSelectedItem();
            Product product  = new Product(type);
            request.setProduct(product);

            account.getProducePickUpRequest().add(request);

            JOptionPane.showMessageDialog(null, "Produce Pickup Request Added", "Success", JOptionPane.YES_OPTION);

        }    
    }//GEN-LAST:event_btnSubmitRequestActionPerformed

    private void btnSubmitMachineryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitMachineryActionPerformed
        // TODO add your handling code here:
        if(jXDatePickerMachinery.getDate() == null || comboxMachinerySelection.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Invalid Entry. Please Try Again", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
        
        MachineryRequest request = new MachineryRequest();
        
        request.setRequestDate(jXDatePickerMachinery.getDate());
        request.setSender(account);
        request.setStatus("Created By Farmer");
        request.setMachineryType(comboxMachinerySelection.getSelectedItem().toString());
        
        account.getTransportMachineWorkQueue().add(request);
        
        JOptionPane.showMessageDialog(null, "Machinery Request Added", "Success!", JOptionPane.YES_OPTION);
        }
        
    }//GEN-LAST:event_btnSubmitMachineryActionPerformed

    private void jXDatePickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePickUpActionPerformed

    private void btnCancelRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRequest1ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerFarmerWorkAreaJPanel dwjp = (FarmerFarmerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCancelRequest1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRequest;
    private javax.swing.JButton btnCancelRequest1;
    private javax.swing.ButtonGroup btnGrpTruckSize;
    private javax.swing.JButton btnSubmitMachinery;
    private javax.swing.JButton btnSubmitRequest;
    private javax.swing.JComboBox cmbProduceType;
    private javax.swing.JComboBox<String> comboxMachinerySelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jXDatePickUp;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerMachinery;
    private javax.swing.JRadioButton radioLonghaul;
    private javax.swing.JRadioButton radioMini;
    // End of variables declaration//GEN-END:variables

    private void populateComboboxProduce() {
        cmbProduceType.removeAllItems();
        for(Product.ProductType type : Product.ProductType.values()){
            cmbProduceType.addItem(type);
        }
    }
}
