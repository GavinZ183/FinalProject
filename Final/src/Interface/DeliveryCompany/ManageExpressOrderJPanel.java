/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DeliveryCompany;

import Business.BuyerOrder.BuyOrderItem;
import Business.ExpressCompany.Deliveryman;
import Business.ExpressCompany.Driver;
import Business.ExpressCompany.ExpressCompany;
import Business.Network.Network;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class ManageExpressOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageExpressOrderJPanel
     */
   JPanel userProcessContainer;
   ExpressCompany expressCompany;
   Network network;

    ManageExpressOrderJPanel(JPanel userProcessContainer, ExpressCompany expressCompany, Network network) {
        initComponents();
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        this.expressCompany=expressCompany;
        populateTable();
    }
    public void populateTable(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(BuyOrderItem buyOrderItem:expressCompany.getBuyOrder().getOrderItemList()){
            
                Object row[] = new Object[7];
                row[0] =buyOrderItem;
                row[1] =buyOrderItem.getQuantity();
                row[2] =buyOrderItem.getBuyer();
                row[3] =buyOrderItem.getBuyer().getPosition();
                row[4]=buyOrderItem.getGood().getSeller();
                row[5]=buyOrderItem.getGood().getSeller().getPosition();
                row[6]=buyOrderItem.getStatus();
                        
                
                model.addRow(row);
                }
            }
     private void searchOrderItemTable(ArrayList<BuyOrderItem> orderItemList) {
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(BuyOrderItem buyOrderItem: orderItemList){
           Object row[] = new Object[7];
                row[0] = buyOrderItem;
                row[1] =buyOrderItem.getQuantity();
                row[2] =buyOrderItem.getBuyer();
                row[3] =buyOrderItem.getBuyer().getPosition();
                row[4]=buyOrderItem.getGood().getSeller();
                row[5]=buyOrderItem.getGood().getSeller().getPosition();
                row[6]=buyOrderItem.getStatus();

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
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtBuyer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnChooseDeliveryDriver = new javax.swing.JButton();
        txtProduct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBuyerPosition = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnFreshTable = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtSeller = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSellerPosition = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnChooseDeliveryMan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnAssignDriver = new javax.swing.JButton();
        btnAssignDeliveryMan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage ExpressOrder Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 35, 371, -1));

        jLabel2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel2.setText("Dilivery Company:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 380, 185, -1));
        add(txtBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 339, 141, 24));

        jLabel4.setText("Goods:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 306, -1, -1));

        jLabel6.setText("Buyer:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 344, -1, -1));

        btnChooseDeliveryDriver.setText("Choose Driver");
        btnChooseDeliveryDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDeliveryDriverActionPerformed(evt);
            }
        });
        add(btnChooseDeliveryDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 437, 185, -1));
        add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 301, 141, 24));

        jLabel7.setText("Buyer Position:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));
        add(txtBuyerPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 140, 24));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 140, 24));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Goods", "Quantity", "Buyer", "Buyer Position", "Seller", "Seller Position", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 768, 147));

        jLabel8.setText("Status:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jComboBox1.setEnabled(false);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 437, 157, 24));

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });
        add(btnFreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 90, 185, -1));

        jLabel9.setText("Delivery Driver:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 441, -1, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));
        add(txtSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 380, 141, 24));

        jLabel10.setText("Seller:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 385, -1, -1));

        jLabel11.setText("Seller Position:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));
        add(txtSellerPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 140, 24));

        jComboBox2.setEnabled(false);
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 515, 157, 24));

        btnChooseDeliveryMan.setText("Choose Delivery Man");
        btnChooseDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDeliveryManActionPerformed(evt);
            }
        });
        add(btnChooseDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 516, 185, -1));

        jLabel12.setText("Delivery Man:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 519, -1, -1));

        btnAssignDriver.setText("Assign Driver");
        btnAssignDriver.setEnabled(false);
        btnAssignDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDriverActionPerformed(evt);
            }
        });
        add(btnAssignDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 475, 185, -1));

        btnAssignDeliveryMan.setText("Assign Delivery Man");
        btnAssignDeliveryMan.setEnabled(false);
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });
        add(btnAssignDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 551, 185, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/数据协同.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 900, 650));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/022-直销.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseDeliveryDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDeliveryDriverActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
         //卖家 =！买家   状态=商家发货
       
        if(!buyOrderItem.getGood().getSeller().getPosition().equals(buyOrderItem.getBuyer().getPosition()) && (buyOrderItem.getStatus().equals("SELLER SHIPPED")||buyOrderItem.getStatus().equals("Driver Refused")))
        {
            
            jComboBox1.setEnabled(true);
            btnChooseDeliveryDriver.setEnabled(false);
            btnAssignDriver.setEnabled(true);
            jComboBox1.removeAllItems();
    
            for(Driver driver:expressCompany.getDriverDir().getDriverList()){
                if(driver.getStatus().equals("WORK")&&driver.getPosition().equals(buyOrderItem.getGood().getSeller().getPosition()))
                jComboBox1.addItem(driver.getUserAccount().getUsername());
            }
        }
         else
        { JOptionPane.showMessageDialog(null, "No need to assign a driver", "Warning",JOptionPane.WARNING_MESSAGE);
        }
       
      
    }//GEN-LAST:event_btnChooseDeliveryDriverActionPerformed

    private void btnAssignDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDriverActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        String driverName = (String)jComboBox1.getSelectedItem();
        Driver driver=new Driver();
        for(Driver d:expressCompany.getDriverDir().getDriverList()){
                if(d.getUserAccount().getUsername().equals(driverName)){
                    driver=d;
                }
            }
        buyOrderItem.setStatus("ASSIGND Driver");
        driver.getBuyOrder().getOrderItemList().add(buyOrderItem);
        
        jComboBox1.setEnabled(false);
        btnChooseDeliveryDriver.setEnabled(true);
        btnAssignDriver.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Assignd a driver successfully!");
        populateTable();
                
            
    }//GEN-LAST:event_btnAssignDriverActionPerformed

    private void btnChooseDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDeliveryManActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
       
        //卖家 =！买家   状态=到达派送点
        if((buyOrderItem.getGood().getSeller().getPosition().equals(buyOrderItem.getBuyer().getPosition()) && buyOrderItem.getStatus().equals("SELLER SHIPPED"))
                ||buyOrderItem.getStatus().equals("Arrive at Express transfer station")
                ||buyOrderItem.getStatus().equals("Deliveryman Refused"))
        {
            
            jComboBox2.setEnabled(true);
            btnChooseDeliveryMan.setEnabled(false);
            btnAssignDeliveryMan.setEnabled(true);
            jComboBox2.removeAllItems();
    
            for(Deliveryman deliveryman:expressCompany.getDeliverymanDirectory().getDeliverymanList()){
                if(deliveryman.getStatus().equals("WORK")&&deliveryman.getPosition().equals(buyOrderItem.getBuyer().getPosition()))
                jComboBox2.addItem(deliveryman.getUserAccount().getUsername());
            }
        }
         //卖家地址 =买家地址    订单状态=商家发货
        else if(buyOrderItem.getGood().getSeller().getPosition()==buyOrderItem.getBuyer().getPosition()&&buyOrderItem.getStatus()=="SELLER SHIPPED")
        {
            
            jComboBox2.setEnabled(true);
            btnChooseDeliveryMan.setEnabled(false);
            btnAssignDeliveryMan.setEnabled(true);
    
            for(Deliveryman deliveryman:expressCompany.getDeliverymanDirectory().getDeliverymanList()){
                if(deliveryman.getStatus().equals("WORK")&&deliveryman.getPosition().equals(buyOrderItem.getBuyer().getPosition()))
                jComboBox2.addItem(deliveryman.getUserAccount().getUsername());
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No need to assign a driver", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        
    }//GEN-LAST:event_btnChooseDeliveryManActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        BuyOrderItem buyOrderItem = (BuyOrderItem)jTable1.getValueAt(selectedRow, 0);
        String name = (String)jComboBox2.getSelectedItem();
        Deliveryman deliveryman=new  Deliveryman();
        for(Deliveryman d:expressCompany.getDeliverymanDirectory().getDeliverymanList()){
                if(d.getUserAccount().getUsername().equals(name)){
                    deliveryman=d;
                }
            }
        buyOrderItem.setStatus("ASSIGND Deliveryman");
        deliveryman.getBuyOrder().getOrderItemList().add(buyOrderItem);
        
        jComboBox2.setEnabled(false);
        btnChooseDeliveryMan.setEnabled(true);
        btnAssignDeliveryMan.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Assignd a deliveryman successfully!");
        populateTable();
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String goods = txtProduct.getText();
       
        //star to filter no-empty requirement
        ArrayList<BuyOrderItem> orderItemList = new ArrayList<BuyOrderItem>();
        if(goods.length()>0){
            for(BuyOrderItem buyOrderItem:expressCompany.getBuyOrder().getOrderItemList()){
                if(buyOrderItem.getGood().getProdName().equals(goods)){
                    orderItemList.add(buyOrderItem);
                    }
                }
            }
        else
             orderItemList=expressCompany.getBuyOrder().getOrderItemList();
             
        
         String buyername = txtBuyer.getText();
        ArrayList<BuyOrderItem> orderItemList1 = new ArrayList<BuyOrderItem>();
        if(buyername.length()>0){
            for(BuyOrderItem item: orderItemList){
                if(item.getBuyer().getUserAccount().getUsername().equals(buyername)){
                    orderItemList1.add(item);
                }
            }
        }
        else{
            orderItemList1 = orderItemList;
        }
        
        
        
        String sellername = txtSeller.getText();
        ArrayList<BuyOrderItem> orderItemList2 = new ArrayList<BuyOrderItem>();
        if(sellername.length()>0){
            for(BuyOrderItem item: orderItemList1){
                if(item.getGood().getSeller().getName().equals(sellername)){
                    orderItemList2.add(item);
                }
            }
        }
        else{
            orderItemList2 = orderItemList1;
        }
        
        
        
        String sellerposition=txtSellerPosition.getText();  
        ArrayList<BuyOrderItem> orderItemList3 = new ArrayList<BuyOrderItem>();
        if(sellerposition.length()>0){
            for(BuyOrderItem item: orderItemList2){
                if(item.getGood().getSeller().getPosition().equals(sellerposition)){
                    orderItemList3.add(item);
                }
            }
        }
        else{
            orderItemList3 = orderItemList2;
        }
        
        
        String status=txtStatus.getText();
          ArrayList<BuyOrderItem> orderItemList4 = new ArrayList<BuyOrderItem>();
        if(status.length()>0){
            for(BuyOrderItem item: orderItemList3){
                if(item.getStatus().equals(status)){
                    orderItemList4.add(item);
                }
            }
        }
        else{
            orderItemList4 = orderItemList3;
        }
        
        String position=txtBuyerPosition.getText();  
        ArrayList<BuyOrderItem> orderItemList5 = new ArrayList<BuyOrderItem>();
        if(position.length()>0){
            for(BuyOrderItem item: orderItemList4){
                if(item.getBuyer().getPosition().equals(position)){
                    orderItemList5.add(item);
                }
            }
        }
        else{
            orderItemList5 = orderItemList4;
        }
        
        searchOrderItemTable(orderItemList5);
        
      
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTableActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnFreshTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnAssignDriver;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChooseDeliveryDriver;
    private javax.swing.JButton btnChooseDeliveryMan;
    private javax.swing.JButton btnFreshTable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuyer;
    private javax.swing.JTextField txtBuyerPosition;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtSeller;
    private javax.swing.JTextField txtSellerPosition;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
