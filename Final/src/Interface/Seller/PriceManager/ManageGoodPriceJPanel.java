/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller.PriceManager;

import Business.Goods.Good;
import Interface.Seller.PurchaseManager.*;
import Business.Network.Network;
import Business.Seller.PriceManage.PriceManage;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class ManageGoodPriceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Network network;
    Seller seller;
    Good good;
    public ManageGoodPriceJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        
        for(Seller sel: network.getSellerDirectory().getSellerList()){
            for(PriceManage priceManager: sel.getPriceManageDir().getPriceManageList()){
                if(priceManager.getUserAccount().getUsername().equals(account.getUsername())){
                    seller = sel;
                }
            }
        }
        
        populateGoodPriceTable();//goodPriceTable
        
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        txtPrice.setEnabled(false);
    }
    
    public void populateGoodPriceTable(){
        int rowCount = goodPriceTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)goodPriceTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Good g: seller.getSellerGoodCatalog().getGoodCatalog()){
                    Object row[] = new Object[3];
                    row[0] = g;
                    row[1] = g.getPrice();
                    row[2] = g.getQuantity();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        goodPriceTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goodPriceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Good", "Sales Price", "Inventory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(goodPriceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 722, 147));

        jLabel2.setText("Good list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Goods Price Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 360, -1));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 140, 27));

        jLabel5.setText("Sales price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 109, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 96, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2-1.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 590, 430));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/价格.png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = goodPriceTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        good = (Good)goodPriceTable.getValueAt(selectedRow, 0);
        
        txtPrice.setText(String.valueOf(good.getPrice()));
        txtPrice.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int price = 0;
        try{
            price = Integer.parseInt(txtPrice.getText());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please input price correctly!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtPrice.setBorder(BorderFactory.createLineBorder(Color.red));
            jLabel5.setForeground(Color.red);
            return;
        }
        if(price > 0){
            good.setPrice(price);
        }
        else{
            JOptionPane.showMessageDialog(null, "Price should more than 0!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Update good price successfully!");
        populateGoodPriceTable();
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        txtPrice.setEnabled(false);
        txtPrice.setText("");
        txtPrice.setBorder(BorderFactory.createLineBorder(Color.gray));
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable goodPriceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
