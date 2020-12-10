/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Buyer;

import Business.Buyer.Buyer;
import Business.BuyerOrder.BuyOrderItem;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
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
public class BuyerHistoryOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuyerHistoryOrderJPanel
     */
    JPanel userProcessContainer; 
    UserAccount account;
    Network network;
    Buyer b;
    
    public BuyerHistoryOrderJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.network=network;
        populateOrderListTable();
    }

    public void populateOrderListTable(){
        int rowCount = orderListTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)orderListTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        //find buyer who possess this account
        for(Buyer buyer: network.getBuyerDirectory().getBuyerList()){
            if(buyer.getUserAccount().getUsername().equals(account.getUsername())){
                b = buyer;
            }
        }
        
        for(BuyOrderItem item: b.getBuyOrder().getOrderItemList()){
            Object row[] = new Object[7];
            row[0] = item;
            row[1] = item.getGood().getPrice();
            row[2] = item.getGood().getSeller();
            row[3] = item.getQuantity();
//            row[4] = item.getEvaluate().getWord();
            row[5] = item.getCreateTime();
            row[6] = item.getStatus();

            model.addRow(row);
        }   
    }
    
    private void searchOrderItemTable(ArrayList<BuyOrderItem> orderItemList) {
        int rowCount = orderListTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)orderListTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(BuyOrderItem item: orderItemList){
            Object row[] = new Object[7];
            row[0] = item;
            row[1] = item.getGood().getPrice();
            row[2] = item.getGood().getSeller();
            row[3] = item.getQuantity();
            row[4] = item.getEvaluate().getWord();
            row[5] = item.getCreateTime();
            row[6] = item.getStatus();

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

        txtTime = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnWriteComment = new javax.swing.JButton();
        txtSeller = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderListTable = new javax.swing.JTable();
        btnFreshTable = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGood = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnConnect = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);

        jLabel7.setText("Time:");

        jLabel5.setText("Price:");

        btnWriteComment.setText("Write Comment");
        btnWriteComment.setPreferredSize(new java.awt.Dimension(150, 30));
        btnWriteComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteCommentActionPerformed(evt);
            }
        });

        jLabel6.setText("Seller:");

        orderListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Good", "Price", "Seller", "Quantity", "Comment", "Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderListTable);

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Order list:");

        jLabel4.setText("Good:");

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Buyer Order Screen");

        btnBack.setText("< back");
        btnBack.setPreferredSize(new java.awt.Dimension(150, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel pending order item");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConnect.setText("Connect Service");
        btnConnect.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm Receipt");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/010-订单.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/电商插画 (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConnect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnWriteComment, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(429, 429, 429)
                                .addComponent(btnFreshTable))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGood, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnFreshTable)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnWriteComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderListTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)orderListTable.getValueAt(selectedRow, 0);
        if(item.getStatus().equals("pending")){
            b.getBuyOrder().removeOrderItem(item);
            populateOrderListTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "The order item's status is not pending, you could not cancal!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnCancelActionPerformed

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
        String time = "";
        if(txtTime.getText().length()>0){
            try{
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date date = format.parse(txtTime.getText());
                time = format.format(date);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please input time on format:'yyyy-MM-dd HH:mm'!", "Warning", JOptionPane.WARNING_MESSAGE);
                txtTime.setBorder(BorderFactory.createLineBorder(Color.red));
                jLabel7.setForeground(Color.red);
                return;
            }
        }
        
        
        //star to filter no-empty requirement
        ArrayList<BuyOrderItem> orderItemList = new ArrayList<BuyOrderItem>();
        if(prudname.length()>0){
            for(BuyOrderItem item: b.getBuyOrder().getOrderItemList()){
                if(item.getGood().getProdName().equals(prudname)){
                    orderItemList.add(item);
                }
            }
        }
        else{
            orderItemList = b.getBuyOrder().getOrderItemList();
        }
        ArrayList<BuyOrderItem> orderItemList1 = new ArrayList<BuyOrderItem>();
        if(price!=0){
            for(BuyOrderItem item: orderItemList){
                if(item.getGood().getPrice()==(price)){
                    orderItemList1.add(item);
                }
            }
        }
        else{
            orderItemList1 = orderItemList;
        }
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
        ArrayList<BuyOrderItem> orderItemList3 = new ArrayList<BuyOrderItem>();
        if(time.length()>0){
            for(BuyOrderItem item: orderItemList2){
                if(item.getCreateTime().equals(time)){
                    orderItemList3.add(item);
                }
            }
        }
        else{
            orderItemList3 = orderItemList2;
        }
        
        searchOrderItemTable(orderItemList3);
        
        txtPrice.setBorder(BorderFactory.createLineBorder(Color.gray));
        jLabel5.setForeground(Color.black);
        txtTime.setBorder(BorderFactory.createLineBorder(Color.gray));
        jLabel7.setForeground(Color.black);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTableActionPerformed
        // TODO add your handling code here:
        populateOrderListTable();
    }//GEN-LAST:event_btnFreshTableActionPerformed

    private void btnWriteCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteCommentActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderListTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)orderListTable.getValueAt(selectedRow, 0);
        if(item.getStatus().equals("RECEIVED")){
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add(new WriteCommentJPanel(userProcessContainer,item,account));
            layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "You have not recieved this order item, you could not write comment!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        populateOrderListTable();
    }//GEN-LAST:event_btnWriteCommentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        //userProcessContainer.removeAll();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderListTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)orderListTable.getValueAt(selectedRow, 0);
 
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ConnectServiceJPanel(userProcessContainer,account,item));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnConnectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = orderListTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)orderListTable.getValueAt(selectedRow, 0);
        if(item.getStatus().equals("DELIVERED")){
            item.setStatus("RECEIVED");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Operation", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
    populateOrderListTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnFreshTable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnWriteComment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderListTable;
    private javax.swing.JTextField txtGood;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeller;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    
}
