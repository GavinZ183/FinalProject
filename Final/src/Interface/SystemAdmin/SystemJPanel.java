/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

/**
 *
 * @author TT1
 */
public class SystemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemJPanel
     */
    public SystemJPanel() {
        initComponents();
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
        btnManageBuyer = new javax.swing.JButton();
        btnManageSeller = new javax.swing.JButton();
        btnManageDeliveryCompany = new javax.swing.JButton();
        btnManageDeliveryMan = new javax.swing.JButton();
        btnManageSupplier = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Systemadmin Main Screen");

        btnManageBuyer.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnManageBuyer.setText("Manage buyer");

        btnManageSeller.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnManageSeller.setText("Manage seller");

        btnManageDeliveryCompany.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnManageDeliveryCompany.setText("Manage delivery company");

        btnManageDeliveryMan.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnManageDeliveryMan.setText("Manage delivery man");

        btnManageSupplier.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnManageSupplier.setText("Manage supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnManageDeliveryMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageBuyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageSeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageDeliveryCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(122, 122, 122)
                .addComponent(btnManageBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnManageSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnManageDeliveryCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnManageDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnManageSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageBuyer;
    private javax.swing.JButton btnManageDeliveryCompany;
    private javax.swing.JButton btnManageDeliveryMan;
    private javax.swing.JButton btnManageSeller;
    private javax.swing.JButton btnManageSupplier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
