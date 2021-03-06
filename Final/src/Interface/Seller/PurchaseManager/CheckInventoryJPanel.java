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
           Object row[] = new Object[5];
           row[0] =sellOrderItem;
           row[1] =sellOrderItem.getProduct().getPrice();
           row[2] =sellOrderItem.getProduct().getSupplier();
           row[3] =sellOrderItem.getQuantity();
           row[4] =sellOrderItem.getStatus();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });
        add(btnFreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 101, 122, 27));

        jLabel2.setText("Good list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Check Inventory Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 24, 564, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 101, 576, 147));

        btnPurChase.setText("Purchase Goods");
        btnPurChase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurChaseActionPerformed(evt);
            }
        });
        add(btnPurChase, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 284, 245, 54));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel3.setText("Product Order Screen");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 314, -1));

        jLabel4.setText("Product order list:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 397, -1, -1));

        btnFreshTable1.setText("Fresh table");
        btnFreshTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTable1ActionPerformed(evt);
            }
        });
        add(btnFreshTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 392, 122, -1));

        productOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Supplier", "Quantity", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productOrderTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 433, 795, 147));

        btnRecieve.setText("Recieve");
        btnRecieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecieveActionPerformed(evt);
            }
        });
        add(btnRecieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 592, 122, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/库存.png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024-货物查询.png"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 100, 70));

        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(121, 27));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 220, 122, 27));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurChaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurChaseActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new PurchaseProductJPanel(userProcessContainer,seller,network,account));
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = goodInventoryTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Good good = (Good)goodInventoryTable.getValueAt(selectedRow, 0);
        
        seller.getSellerGoodCatalog().getGoodCatalog().remove(good);
        populateGoodInventoryTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFreshTable;
    private javax.swing.JButton btnFreshTable1;
    private javax.swing.JButton btnPurChase;
    private javax.swing.JButton btnRecieve;
    private javax.swing.JTable goodInventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable productOrderTable;
    // End of variables declaration//GEN-END:variables
}
