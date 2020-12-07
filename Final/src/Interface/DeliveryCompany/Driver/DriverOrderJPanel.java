/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DeliveryCompany.Driver;

import Interface.DeliveryCompany.DeliveryMan.*;
import Business.BuyerOrder.BuyOrderItem;
import Business.ExpressCompany.Driver;
import Business.ExpressCompany.ExpressCompany;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class DriverOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DriverOrderJPanel
     */
    JPanel userProcessContainer;
   UserAccount account;
   Network network;
   Driver driver;

    public DriverOrderJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
       initComponents();
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        
        for(ExpressCompany c:network.getExpressCompanyDir().getExpressCompanyList()){
            for(Driver d:c.getDriverDir().getDriverList()){
                if(d.getUserAccount().getUsername().equals(account.getUsername()))
                    driver=d;
            }
        }
            
        
        populateTable();
        
        jComboBox1.addItem("WORK");
        jComboBox1.addItem("REST");
        jComboBox1.addItem("BUSY");
    }
 public void populateTable(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(BuyOrderItem buyOrderItem:driver.getBuyOrder().getOrderItemList()){
            
                Object row[] = new Object[6];
                row[0] = buyOrderItem;
                row[1] =buyOrderItem.getQuantity();
               
                row[2] =buyOrderItem.getBuyer().getPosition();
               
                row[3]=buyOrderItem.getGood().getSeller().getPosition();
                row[4]=buyOrderItem.getStatus();
                row[5]=buyOrderItem.getCreateTime();
                
                        
                
                model.addRow(row);
                }
            }
 public void labelStatus(){
     jStatus.setText(driver.getStatus());
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnRefuse = new javax.swing.JButton();
        jStatus = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnView = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Driver Workarea");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Goods", "Quantity", "Buyer Position", "Seller Position", "Status", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(8);
        }

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnRefuse.setText("Refuse");
        btnRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefuseActionPerformed(evt);
            }
        });

        jStatus.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jStatus.setText("\"status\"");

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnChange.setText("Change my status");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel4.setText("My status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefuse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jStatus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)))
                .addGap(0, 276, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnView)
                    .addComponent(btnAccept))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinish)
                    .addComponent(btnRefuse))
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
            
            
            
           String status = (String)jComboBox1.getSelectedItem();
           driver.setStatus(status);
           
         JOptionPane.showMessageDialog(null, "Change Your Status to "+status+" Successfully");
         labelStatus();

    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        
        if(buyOrderItem.getStatus().equals("ASSIGND Driver")){
            buyOrderItem.setStatus("Driver Deliverying");
            JOptionPane.showMessageDialog(null, "Assigned this order Successfully");
        }
            else
            JOptionPane.showMessageDialog(null, "You can't handle this order", "Warning",JOptionPane.WARNING_MESSAGE);
          populateTable();   
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new DeliveryViewBuyOrderJPanel(userProcessContainer,buyOrderItem));
        layout.next(userProcessContainer);
         populateTable();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefuseActionPerformed
        // TODO add your handling code here:
          int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        
        if(buyOrderItem.getStatus().equals("ASSIGND Driver")){
            buyOrderItem.setStatus("Driver Refused");
            JOptionPane.showMessageDialog(null, "Refused this order Successfully");
        }
            else
            JOptionPane.showMessageDialog(null, "You can't handle this order", "Warning",JOptionPane.WARNING_MESSAGE);
         populateTable();
            
    }//GEN-LAST:event_btnRefuseActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        
        if(buyOrderItem.getStatus().equals("Driver Deliverying")){
            buyOrderItem.setStatus("Arrive at Express transfer station");
            JOptionPane.showMessageDialog(null, "Finished this order Successfully");
        }
            else
            JOptionPane.showMessageDialog(null, "You can't handle this order", "Warning",JOptionPane.WARNING_MESSAGE);
        populateTable();     
    }//GEN-LAST:event_btnFinishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnRefuse;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStatus;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
