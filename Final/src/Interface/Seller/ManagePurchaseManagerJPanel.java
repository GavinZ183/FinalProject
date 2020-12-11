/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Role.PurchaseManagerRole;
import Business.Seller.PurchaseManage.PurchaseManage;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class ManagePurchaseManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePurchaseManagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Seller seller;
    Network network;
    String oldname = "";
    public ManagePurchaseManagerJPanel(JPanel userProcessContainer, Seller seller, EcoSystem system,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.seller = seller;
        this.system=system;
        this.network=network;
        btnSave.setEnabled(false);
        populateTable();
    }
    
    public void populateTable(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(PurchaseManage pm: seller.getPurchaseManageDir().getPurchaseManageList()){
            
                Object row[] = new Object[4];
                row[0] = pm;
                row[1] =pm.getUserAccount().getUsername();
                row[2] =pm.getUserAccount().getPassword();
                row[3] =pm.getTelephone();      
                
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

        txtTelephone = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        txtTelephone1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 391, 166, -1));
        add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 495, 163, -1));
        add(txtTelephone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 543, 166, -1));

        jLabel10.setText("Password:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 548, -1, -1));
        add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 543, 146, -1));

        jLabel9.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel9.setText("Create new Purchase Manager:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 455, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 339, 100, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, -1));

        jLabel8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel8.setText("Update Purchase Manager:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 299, -1, -1));

        btnCreate.setText("Create");
        btnCreate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 543, 100, -1));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setText("Delete Purchase Manager:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 258, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Purchase Manager");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 27, -1, -1));

        jLabel4.setText("Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 344, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 339, 146, -1));

        jLabel2.setText("Purchase Manager list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 258, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password", "Telephone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, 760, 147));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 391, 146, -1));

        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 391, 100, -1));

        jLabel13.setText("Username:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 500, -1, -1));

        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 344, -1, -1));

        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 500, -1, -1));

        jLabel7.setText("Telephone:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 396, -1, -1));

        jLabel11.setText("Telephone:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 548, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 339, 163, -1));
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 495, 146, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/023-货物查询.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PurchaseManage pm = (PurchaseManage)jTable1.getValueAt(selectedRow, 0);
        txtName.setText(pm.getName());
        txtUsername.setText(pm.getUserAccount().getUsername());
        txtPassword.setText(pm.getUserAccount().getPassword());
        txtTelephone.setText(pm.getTelephone());
        oldname = pm.getUserAccount().getUsername();

        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String username=txtUsername1.getText();
        String password=txtPassword1.getText();
        String name=txtName1.getText();
        String telePhone=txtTelephone1.getText();
        //check If Username Is Unique
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){}
        else{
            JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        PurchaseManage pm = new PurchaseManage();
        UserAccount userAccount=new UserAccount();
        PurchaseManagerRole role=new PurchaseManagerRole();

        userAccount=system.getUserAccountDirectory().createUserAccount(username,password,role);
        pm.setName(name);
        pm.setTelephone(telePhone);
        pm.setUserAccount(userAccount);
        seller.getPurchaseManageDir().getPurchaseManageList().add(pm);
        network.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        txtUsername1.setText("");
        txtPassword1.setText("");
        txtTelephone1.setText("");
        txtName1.setText("");
        populateTable();
        
        JOptionPane.showMessageDialog(null, "Create new purchase manager successfully!");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PurchaseManage pm = (PurchaseManage)jTable1.getValueAt(selectedRow, 0);
        seller.getPurchaseManageDir().getPurchaseManageList().remove(pm);
        //remove the related useraccount
        system.getUserAccountDirectory().getUserAccountList().remove(pm.getUserAccount());
        populateTable();
        JOptionPane.showMessageDialog(null, "Delete the purchase manager successfully!");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PurchaseManage pm = (PurchaseManage)jTable1.getValueAt(selectedRow, 0);
        
       //check If Username Is Unique
        if(txtName.getText().equals(oldname)){}
        else{
            if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername.getText())){}
            else{
                JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        oldname = "";

        pm.setName( txtName.getText());
        pm.setTelephone(txtTelephone.getText());
        pm.getUserAccount().setPassword(txtPassword.getText());
        pm.getUserAccount().setUsername(txtUsername.getText());
        populateTable();
        
        JOptionPane.showMessageDialog(null, "Update the purchase manager successfully!");
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        txtUsername.setText("");
        txtPassword.setText("");
        txtTelephone.setText("");
        txtName.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTelephone1;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables
}
