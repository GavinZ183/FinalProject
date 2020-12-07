/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Service;

import Business.Buyer.Buyer;
import Interface.DeliveryCompany.DeliveryMan.*;
import Business.BuyerOrder.BuyOrderItem;
import Business.ExpressCompany.Deliveryman;
import Business.ExpressCompany.ExpressCompany;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.DeliveryCompany.DeliveryMan.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class ServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConfirmDeliveryOrderJPanel
     */
    JPanel userProcessContainer;
   UserAccount account;
   Network network;
  

    public ServiceJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
       initComponents();
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        
        
        
        populateTable();
        
        
    }
 public void populateTable(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Buyer b:network.getBuyerDirectory().getBuyerList()){
          for(BuyOrderItem buyOrderItem:b.getBuyOrder().getOrderItemList()) {
              if(!buyOrderItem.getMessages().isEmpty()){
                  
                Object row[] = new Object[6];
                row[0] = buyOrderItem;
                row[1] =buyOrderItem.getBuyer().getUserAccount().getUsername();
                row[2]=buyOrderItem.getGood().getSeller();
                row[3]=buyOrderItem.getStatus();
                row[4]=buyOrderItem.getCreateTime();
                row[5]=buyOrderItem.getMessages();
                        
                
                model.addRow(row);
              }
          } 
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnContact = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Customer Service Staff Workarea");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Goods", "Buyer", "Seller", "Status", "Time", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
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

        btnContact.setText("Contact Buyer");
        btnContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel Order");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnView.setText("View Order Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContact, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(27, 27, 27)
                .addComponent(btnContact, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new MessageJPanel(userProcessContainer,account,buyOrderItem));
        layout.next(userProcessContainer);
            
    }//GEN-LAST:event_btnContactActionPerformed

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
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
          int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        
        
            buyOrderItem.setStatus("Canceled");
            JOptionPane.showMessageDialog(null, "Canceled this order Successfully");
            
            populateTable();
       
            
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnContact;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
