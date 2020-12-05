/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller.PurchaseManager;

import Business.Goods.Good;
import Business.Network.Network;
import Business.Seller.PurchaseManage.PurchaseManage;
import Business.Seller.Seller;
import Business.SellerOrder.SellOrderItem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class CheckInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Network network;
    Seller seller;
    public CheckInventoryJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        
        for(Seller sel: network.getSellerDirectory().getSellerList()){
            for(PurchaseManage purchaseManager: sel.getPurchaseManageDir().getPurchaseManageList()){
                if(purchaseManager.getUserAccount().getUsername().equals(account.getUsername())){
                    seller = sel;
                }
            }
        }
        
        populateGoodInventoryTable();//goodInventoryTable
        populateProductOrderTable();//goodOrderTable
    }

    public void populateGoodInventoryTable(){
        int rowCount = goodInventoryTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)goodInventoryTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Good g: seller.getSellerGoodCatalog().getGoodCatalog()){
                    Object row[] = new Object[2];
                    row[0] = g;
                    row[1] = g.getQuantity();

                    model.addRow(row);
        }   
    }
    
    public void populateProductOrderTable(){
        int rowCount = productOrderTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productOrderTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(SellOrderItem sellOrderItem:seller.getSellOrder().getOrderItemList()){
           Object row[] = new Object[6];
           row[0] =sellOrderItem;
           row[1] =sellOrderItem.getProduct().getPrice();
           row[2] =sellOrderItem.getSeller().getName();
           row[3] =sellOrderItem.getSeller().getPosition();
           row[4] =sellOrderItem.getQuantity();
           row[5] =sellOrderItem.getStatus();
           model.addRow(row);
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

        btnFreshTable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        goodInventoryTable = new javax.swing.JTable();
        btnPurChase = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFreshTable1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productOrderTable = new javax.swing.JTable();
        btnRecieve = new javax.swing.JButton();

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });

        jLabel2.setText("Good list:");

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Good Screen");

        goodInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Good", "Inventory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(goodInventoryTable);

        btnPurChase.setText("Purchase Goods");
        btnPurChase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurChaseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel3.setText("Peoduct Order Screen");

        jLabel4.setText("Product order list:");

        btnFreshTable1.setText("Fresh table");
        btnFreshTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTable1ActionPerformed(evt);
            }
        });

        productOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Supplier", "Supplier Position", "Quantity", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productOrderTable);

        btnRecieve.setText("Recieve");
        btnRecieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecieveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(btnFreshTable)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFreshTable1))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurChase, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRecieve)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnFreshTable))
                .addGap(52, 52, 52)
                .addComponent(btnPurChase, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnFreshTable1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecieve)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurChaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurChaseActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new PurchaseProductJPanel(userProcessContainer,seller,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurChaseActionPerformed

    private void btnFreshTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTable1ActionPerformed
        // TODO add your handling code here:
        populateProductOrderTable();
    }//GEN-LAST:event_btnFreshTable1ActionPerformed

    private void btnFreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTableActionPerformed
        // TODO add your handling code here:
        populateGoodInventoryTable();
    }//GEN-LAST:event_btnFreshTableActionPerformed

    private void btnRecieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecieveActionPerformed
        // TODO add your handling code here:
        int selectedRow = productOrderTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        SellOrderItem sellOrderItem = (SellOrderItem)productOrderTable.getValueAt(selectedRow, 0);
        
        if(sellOrderItem.getStatus().equals("DELIVERED")){}
        else{
            JOptionPane.showMessageDialog(null, "The order item status is not 'DELIVERED'!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Good good:seller.getSellerGoodCatalog().getGoodCatalog()){
            if(good.getProdName().equals(sellOrderItem.getProduct().getProdName())){
                good.setQuantity(good.getQuantity() + sellOrderItem.getQuantity());
                sellOrderItem.setStatus("recieved");
                populateGoodInventoryTable();
                populateProductOrderTable();
                return;
            }
        }
        Good good = new Good();
        good.setDiscribe(sellOrderItem.getProduct().getDiscribe());
        good.setImagePath(sellOrderItem.getProduct().getImagePath());
        good.setPrice(sellOrderItem.getProduct().getPrice());
        good.setProdName(sellOrderItem.getProduct().getProdName());
        good.setQuantity(sellOrderItem.getQuantity());
        good.setSeller(seller);
        seller.getSellerGoodCatalog().getGoodCatalog().add(good);
        
        sellOrderItem.setStatus("recieved");
        populateGoodInventoryTable();
        populateProductOrderTable();
    }//GEN-LAST:event_btnRecieveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFreshTable;
    private javax.swing.JButton btnFreshTable1;
    private javax.swing.JButton btnPurChase;
    private javax.swing.JButton btnRecieve;
    private javax.swing.JTable goodInventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable productOrderTable;
    // End of variables declaration//GEN-END:variables
}
