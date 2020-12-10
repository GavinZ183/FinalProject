/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller.PurchaseManager;

import Business.Product.Product;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author TT1
 */
public class ProductDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductDetailsJPanel
     */
    JPanel userProcessContainer;
    Product product;
    public ProductDetailsJPanel(JPanel userProcessContainer,Product product) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product = product;
        txtProduct.setText(product.getProdName());
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtSeller.setText(product.getSupplier().getName());
        txtPosition.setText(product.getSupplier().getPosition());
        txtInventory.setText(String.valueOf(product.getQuantity()));
        
//        ImageIcon photo = new ImageIcon(product.getImagePath());
//        Image image = photo.getImage();
//        image = image.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
//        lblImage.setIcon(new ImageIcon(image));
Image im=Toolkit.getDefaultToolkit().createImage(product.getImagePath());// Returns an image which gets pixel data from the specified file.
//        im=im.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);//Creates a scaled version of this image.
im=im.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon ii=new ImageIcon(im);//Creates an uninitialized image icon.
        lblImage.setIcon(ii);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSeller = new javax.swing.JTextField();
        txtInventory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Image:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        txtProduct.setEnabled(false);
        add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 142, -1));
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 160, 190));

        txtPrice.setEnabled(false);
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 142, -1));

        jLabel5.setText("Price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Details Information Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel7.setText("Position:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        txtPosition.setEnabled(false);
        add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 142, -1));

        jLabel8.setText("Inventory:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        txtSeller.setEnabled(false);
        add(txtSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 142, -1));

        txtInventory.setEnabled(false);
        add(txtInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 142, -1));

        jLabel6.setText("Seller:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        jLabel4.setText("Product:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/数据盘.png"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 160, 360, 350));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/004-条形码查询 (1).png"))); // NOI18N
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtInventory;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtSeller;
    // End of variables declaration//GEN-END:variables
}
