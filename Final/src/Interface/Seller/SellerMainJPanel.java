/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author TT1
 */
public class SellerMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SellerMainJPanel
     */
   
    
    JPanel userProcessContainer;
    UserAccount account;
    Network network;
    EcoSystem system;
    Seller seller;
    public SellerMainJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Network network) {
        this.userProcessContainer=userProcessContainer;
        this.account = account;
        this.network = network;
        this.system = system;
         initComponents();
          
         for(Seller s: network.getSellerDirectory().getSellerList()){
            if(s.getUserAccount().getUsername().equals(account.getUsername())){
                seller = s;
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
        btnPriceManager = new javax.swing.JButton();
        btnPurchaseManager = new javax.swing.JButton();
        btnSalesManager = new javax.swing.JButton();
        btnManageInformaton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Seller Main Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 21, 276, -1));

        btnPriceManager.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnPriceManager.setText("Manage Price Manager");
        btnPriceManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceManagerActionPerformed(evt);
            }
        });
        add(btnPriceManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 276, 41));

        btnPurchaseManager.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnPurchaseManager.setText("Manage Purchase Manager");
        btnPurchaseManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseManagerActionPerformed(evt);
            }
        });
        add(btnPurchaseManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 276, 41));

        btnSalesManager.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnSalesManager.setText("Manage Sales Manager");
        btnSalesManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesManagerActionPerformed(evt);
            }
        });
        add(btnSalesManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 276, 41));

        btnManageInformaton.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnManageInformaton.setText("Manage Seller Informaton");
        btnManageInformaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInformatonActionPerformed(evt);
            }
        });
        add(btnManageInformaton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 276, 41));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/电商插画 (4).png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 660, 350));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/014-快递员.png"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageInformatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInformatonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageSellerInformationJPanel(userProcessContainer,seller,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInformatonActionPerformed

    private void btnPurchaseManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseManagerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManagePurchaseManagerJPanel(userProcessContainer,seller,system,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurchaseManagerActionPerformed

    private void btnPriceManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceManagerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManagePriceManagerJPanel(userProcessContainer,seller,system,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPriceManagerActionPerformed

    private void btnSalesManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesManagerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageSalesManagerJPanel(userProcessContainer,seller,system,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSalesManagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageInformaton;
    private javax.swing.JButton btnPriceManager;
    private javax.swing.JButton btnPurchaseManager;
    private javax.swing.JButton btnSalesManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    // End of variables declaration//GEN-END:variables
}
