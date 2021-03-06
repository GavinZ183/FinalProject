/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller.PurchaseManager;

import Business.Network.Network;
import Business.Product.Product;
import Business.Seller.Seller;
import Business.SellerOrder.SellOrderItem;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class PurchaseProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PurchaseGoodJPanel
     */
    JPanel userProcessContainer;
    Network network;
    Seller seller;
    ArrayList<Product> productList = new ArrayList<Product>();
    ArrayList<SellOrderItem> cart = new ArrayList<SellOrderItem>();
    UserAccount account;
    public PurchaseProductJPanel(JPanel userProcessContainer, Seller seller, Network network,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.seller = seller;
        this.network = network;
        this.account = account;
        
        populateProductTable();
        cartTable(cart);
    }

    public void populateProductTable(){
        int rowCount = productTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        productList.clear();
        for(Supplier supplier: network.getSupplierDirectory().getsupplierList()){
            for(Product product: supplier.getProductCatalog().getProductcatalog()){
                Object row[] = new Object[4];
                row[0] = product;
                row[1] = product.getPrice();
                row[2] = supplier;
                row[3] = product.getDiscribe();
                
                model.addRow(row);
                productList.add(product);
            }
        }   
    }
    
    public void searchProductTable(ArrayList<Product> productList){
        int rowCount = productTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Product product: productList){
            Object row[] = new Object[4];
            row[0] = product;
            row[1] = product.getPrice();
            row[2] = product.getSupplier();
            row[3] = product.getDiscribe();

            model.addRow(row);
        } 
    }
    
    public void cartTable(ArrayList<SellOrderItem> cart){
        int rowCount = cartTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)cartTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(SellOrderItem item: cart){
            Object row[] = new Object[4];
            row[0] = item;
            row[1] = item.getProduct().getPrice();
            row[2] = item.getProduct().getSupplier();
            row[3] = item.getQuantity();

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
        productTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnFreshTable = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSupplier = new javax.swing.JTextField();
        btnDetails = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        btnCommit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Purchase Product Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 335, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Supplier", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 808, 147));

        btnDelete.setText("Delete product");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 130, -1));

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });
        add(btnFreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 130, 27));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 130, -1));

        btnSearch.setText("Search");
        btnSearch.setPreferredSize(new java.awt.Dimension(130, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 130, 27));

        jLabel4.setText("Product:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel2.setText("Product list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 140, 27));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Supplier", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 808, 147));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 270, 140, 27));

        jLabel5.setText("Price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 280, -1, -1));

        jLabel3.setText("Shopping cart:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        add(txtSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 140, 27));

        btnDetails.setText("More details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, -1));

        jLabel6.setText("Supplier:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        btnAddToCart.setText("Add into cart");
        btnAddToCart.setPreferredSize(new java.awt.Dimension(130, 30));
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 130, 27));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, -1, -1));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 56, -1));
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 56, -1));

        btnCommit.setText("Commit");
        btnCommit.setPreferredSize(new java.awt.Dimension(130, 30));
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });
        add(btnCommit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 130, 27));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024-货物查询.png"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/购物 (1).png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTableActionPerformed
        // TODO add your handling code here:
        populateProductTable();
    }//GEN-LAST:event_btnFreshTableActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new CheckInventoryJPanel(userProcessContainer,account,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String prudname = txtProduct.getText();
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
        
        String suppliername = txtSupplier.getText();
        
        //star to filter no-empty requirement
        ArrayList<Product> productList1 = new ArrayList<Product>();
        if(prudname.length()>0){
            for(Product p: productList){
                if(p.getProdName().equals(prudname)){
                    productList1.add(p);
                }
            }
        }
        else{
            productList1 = productList;
        }
        ArrayList<Product> productList2 = new ArrayList<Product>();
        if(price!=0){
            for(Product p: productList1){
                if(p.getPrice()==(price)){
                    productList2.add(p);
                }
            }
        }
        else{
            productList2 = productList1;
        }
        ArrayList<Product> productList3 = new ArrayList<Product>();
        if(suppliername.length()>0){
            for(Product p: productList2){
                if(p.getSupplier().getName().equals(suppliername)){
                    productList3.add(p);
                }
            }
        }
        else{
            productList3 = productList2;
        }

        
        searchProductTable(productList3);
        txtPrice.setBorder(BorderFactory.createLineBorder(Color.gray));
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product product = (Product)productTable.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ProductDetailsJPanel(userProcessContainer,product));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product product = (Product)productTable.getValueAt(selectedRow, 0);
        
        int quantity = (Integer)jSpinner1.getValue();
        if(quantity <=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than equal to 0!");
            return;
        }

        SellOrderItem item = new SellOrderItem();
        item.setProduct(product);
        item.setQuantity(quantity);
        for(SellOrderItem i: cart){
            if(i.getProduct().getProdName().equals(product.getProdName())&&i.getProduct().getSupplier().equals(product.getSupplier())){
                JOptionPane.showMessageDialog(null, "You have added the product into cart!");
                return;
            }
        }
        cart.add(item);
        cartTable(cart);
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow =cartTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        SellOrderItem item = (SellOrderItem)cartTable.getValueAt(selectedRow, 0);
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
        SellOrderItem item = (SellOrderItem)cartTable.getValueAt(selectedRow, 0);
        
        int quantity = (Integer)jSpinner2.getValue();
        if(quantity <=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than equal to 0!");
            return;
        }
        item.setQuantity(quantity);
        cartTable(cart);
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed
        // TODO add your handling code here:
        //Date date = new Date();
        for(SellOrderItem item: cart){
            //item.setCreateTime(date);
            item.setStatus("pending");
            item.setSeller(seller);
            seller.getSellOrder().getOrderItemList().add(item);
        }
        cart.clear();
        cartTable(cart);
    }//GEN-LAST:event_btnCommitActionPerformed


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtSupplier;
    // End of variables declaration//GEN-END:variables
}
