/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Buyer;

import Business.Buyer.Buyer;
import Business.BuyerOrder.BuyOrderItem;
import Business.Goods.Good;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class ShoppingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuyJPanel
     */
    JPanel userProcessContainer; 
    UserAccount account;
    Network network;
    ArrayList<Good> goodList = new ArrayList<Good>();
    ArrayList<BuyOrderItem> cart = new ArrayList<BuyOrderItem>();
    
    public ShoppingJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.network=network;
        populateGoodTable();
        cartTable(cart);
    }
    
    public void populateGoodTable(){
        int rowCount = goodTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)goodTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        goodList.clear();
        for(Seller seller: network.getSellerDirectory().getSellerList()){
            for(Good good: seller.getSellerGoodCatalog().getGoodCatalog()){
                Object row[] = new Object[6];
                row[0] = good;
                row[1] = good.getPrice();
                row[2] = seller;
                row[3] = seller.getPosition();
                row[4] = good.getQuantity();
                row[5] = good.getDiscribe();
                
                model.addRow(row);
                goodList.add(good);
            }
        }   
    }
    
    public void searchGoodTable(ArrayList<Good> goodList){
        int rowCount = goodTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)goodTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Good good: goodList){
            Object row[] = new Object[6];
            row[0] = good;
            row[1] = good.getPrice();
            row[2] = good.getSeller();
            row[3] = good.getSeller().getPosition();
            row[4] = good.getQuantity();
            row[5] = good.getDiscribe();

            model.addRow(row);
        } 
    }
    
    public void cartTable(ArrayList<BuyOrderItem> cart){
        int rowCount = cartTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)cartTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(BuyOrderItem item: cart){
            Object row[] = new Object[5];
            row[0] = item;
            row[1] = item.getGood().getPrice();
            row[2] = item.getGood().getSeller();
            row[3] = item.getGood().getSeller().getPosition();
            row[4] = item.getQuantity();

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        goodTable = new javax.swing.JTable();
        btnFreshTable = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnDetails = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        btnCommit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtGood = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSeller = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnModifyQuantity = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Shopping Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 15, 471, -1));

        goodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Good", "Price", "Seller", "Seller Position", "Inventory", "Description"
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
        jScrollPane1.setViewportView(goodTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 85, 750, 147));

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });
        add(btnFreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 51, 137, 30));

        btnSearch.setText("Search");
        btnSearch.setPreferredSize(new java.awt.Dimension(137, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 292, 137, 30));

        jLabel2.setText("Good list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 55, -1, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Good", "Price", "Seller", "Seller Position", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(cartTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 402, 750, 147));

        jLabel3.setText("Shopping cart:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 377, -1, -1));

        btnDetails.setText("More details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 332, -1, -1));

        btnAddToCart.setText("Add into cart");
        btnAddToCart.setPreferredSize(new java.awt.Dimension(137, 30));
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 332, 137, 30));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 333, 56, -1));

        btnCommit.setText("Commit");
        btnCommit.setPreferredSize(new java.awt.Dimension(137, 30));
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });
        add(btnCommit, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 567, 137, 30));

        btnDelete.setText("Delete good");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 567, -1, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 612, -1, -1));

        jLabel4.setText("Good：");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 253, -1, -1));
        add(txtGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 250, 139, 27));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 250, 99, 27));

        jLabel5.setText("Price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 253, -1, -1));
        add(txtSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 250, 141, 27));

        jLabel6.setText("Seller:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 253, -1, -1));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 567, -1, -1));
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 568, 56, -1));

        jLabel7.setText("Position:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 295, -1, -1));
        add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 292, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/电商店铺.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTableActionPerformed
        // TODO add your handling code here:
        populateGoodTable();
    }//GEN-LAST:event_btnFreshTableActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String prudname = txtGood.getText();
        int price = 0;
        if(txtPrice.getText().length()>0){
            try{
                price = Integer.parseInt(txtPrice.getText());
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Please input price correctly!", "Warning", JOptionPane.WARNING_MESSAGE);
                txtPrice.setBorder(BorderFactory.createLineBorder(Color.red));
                jLabel5.setForeground(Color.red);
                return;
            }
        }
        String sellername = txtSeller.getText();
        String position = txtPosition.getText();
        
        //star to filter no-empty requirement
        ArrayList<Good> goodList1 = new ArrayList<Good>();
        if(prudname.length()>0){
            for(Good p: goodList){
                if(p.getProdName().equals(prudname)){
                    goodList1.add(p);
                }
            }
        }
        else{
            goodList1 = goodList;
        }
        ArrayList<Good> goodList2 = new ArrayList<Good>();
        if(price!=0){
            for(Good p: goodList1){
                if(p.getPrice()==(price)){
                    goodList2.add(p);
                }
            }
        }
        else{
            goodList2 = goodList1;
        }
        ArrayList<Good> goodList3 = new ArrayList<Good>();
        if(sellername.length()>0){
            for(Good p: goodList2){
                if(p.getSeller().getName().equals(sellername)){
                    goodList3.add(p);
                }
            }
        }
        else{
            goodList3 = goodList2;
        }
        ArrayList<Good> goodList4 = new ArrayList<Good>();
        if(position.length()>0){
            for(Good p: goodList3){
                if(p.getSeller().getPosition().equals(position)){
                    goodList4.add(p);
                }
            }
        }
        else{
            goodList4 = goodList3;
        }
        
        searchGoodTable(goodList4);
        txtPrice.setBorder(BorderFactory.createLineBorder(Color.gray));
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = goodTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Good good = (Good)goodTable.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ViewDetailsJPanel(userProcessContainer,good));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = goodTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Good good = (Good)goodTable.getValueAt(selectedRow, 0);
        
        int quantity = (Integer)jSpinner1.getValue();
        if(quantity <=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than equal to 0!");
            return;
        }
        if(quantity > good.getQuantity()){
            JOptionPane.showMessageDialog(null, "Quantity cannot be more than Inventory!");
            return;
        }

        BuyOrderItem item = new BuyOrderItem();
        item.setGood(good);
        item.setQuantity(quantity);
        for(BuyOrderItem i: cart){
            if(i.getGood().getProdName().equals(good.getProdName())&&i.getGood().getSeller().equals(good.getSeller())){
                JOptionPane.showMessageDialog(null, "You have added the good into cart!");
                return;
            }
        }
        cart.add(item);
        cartTable(cart);
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)cartTable.getValueAt(selectedRow, 0);
        cart.remove(item);
        cartTable(cart);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)cartTable.getValueAt(selectedRow, 0);
        
        int quantity = (Integer)jSpinner2.getValue();
        if(quantity <=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than equal to 0!");
            return;
        }
        if(quantity > item.getGood().getQuantity()){
            JOptionPane.showMessageDialog(null, "Quantity cannot be more than Inventory!");
            return;
        }
        item.setQuantity(quantity);
        cartTable(cart);
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        for(Buyer buyer: network.getBuyerDirectory().getBuyerList()){
            if(buyer.getUserAccount().equals(account)){
                for(BuyOrderItem item: cart){
                    item.setCreateTime(date);
                    item.setStatus("Buyer submitted the order");
                    item.setBuyer(buyer);
                    buyer.getBuyOrder().getOrderItemList().add(item);
                    int newInventory = item.getGood().getQuantity() - item.getQuantity();
                    item.getGood().setQuantity(newInventory);
                }
            }
        }
        cart.clear();
        cartTable(cart);
    }//GEN-LAST:event_btnCommitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new BuyerMainJPanel(userProcessContainer,account,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnFreshTable;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable cartTable;
    private javax.swing.JTable goodTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField txtGood;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeller;
    // End of variables declaration//GEN-END:variables
}
