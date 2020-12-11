/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Seller;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Role.SalesManagerRole;
import Business.Seller.SalesManage.SalesManage;
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
public class ManageSalesManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSalesManagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Seller seller;
    Network network;
    String oldname = "";
    public ManageSalesManagerJPanel(JPanel userProcessContainer, Seller seller, EcoSystem system, Network network) {
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
        for(SalesManage sm: seller.getSalesManageDir().getSalesManageList()){
            
                Object row[] = new Object[4];
                row[0] = sm;
                row[1] =sm.getUserAccount().getUsername();
                row[2] =sm.getUserAccount().getPassword();
                row[3] =sm.getTelephone();      
                
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

        txtUsername1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelephone1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 517, 169, -1));

        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 368, -1, -1));
        add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 415, 166, -1));

        jLabel13.setText("Username:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 522, -1, -1));

        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 100, 26));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 415, 146, -1));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 420, -1, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 641, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 100, -1));

        jLabel9.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel9.setText("Create new Sales Manager:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 477, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 363, 169, -1));
        add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 565, 146, -1));

        jLabel11.setText("Telephone:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 570, -1, -1));

        jLabel10.setText("Password:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 570, -1, -1));

        jLabel7.setText("Telephone:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 420, -1, -1));
        add(txtTelephone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 565, 166, -1));

        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 522, -1, -1));

        jLabel4.setText("Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 368, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Sales Manager");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setText("DeleteSales Manager:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 273, -1, -1));

        btnCreate.setText("Create");
        btnCreate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 100, -1));

        jLabel8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel8.setText("Update Sales Manager:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 323, -1, -1));
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 517, 146, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 811, 147));

        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 100, -1));

        jLabel2.setText("Sales Manager list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 363, 146, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/023-货物查询.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        SalesManage sm = (SalesManage)jTable1.getValueAt(selectedRow, 0);
        
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

        sm.setName( txtName.getText());
        sm.setTelephone(txtTelephone.getText());
        sm.getUserAccount().setPassword(txtPassword.getText());
        sm.getUserAccount().setUsername(txtUsername.getText());
        populateTable();

        JOptionPane.showMessageDialog(null, "Update the sales manager successfully!");

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        txtUsername.setText("");
        txtPassword.setText("");
        txtTelephone.setText("");
        txtName.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        SalesManage sm = (SalesManage)jTable1.getValueAt(selectedRow, 0);
        txtName.setText(sm.getName());
        txtUsername.setText(sm.getUserAccount().getUsername());
        txtPassword.setText(sm.getUserAccount().getPassword());
        txtTelephone.setText(sm.getTelephone());
        oldname = sm.getUserAccount().getUsername();

        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

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

        SalesManage sm = new SalesManage();
        UserAccount userAccount=new UserAccount();
        SalesManagerRole role=new SalesManagerRole();

        userAccount=system.getUserAccountDirectory().createUserAccount(username,password,role);
        sm.setName(name);
        sm.setTelephone(telePhone);
        sm.setUserAccount(userAccount);
        seller.getSalesManageDir().getSalesManageList().add(sm);
        network.getUserAccountDirectory().getUserAccountList().add(userAccount);

        txtUsername1.setText("");
        txtPassword1.setText("");
        txtTelephone1.setText("");
        txtName1.setText("");
        populateTable();

        JOptionPane.showMessageDialog(null, "Create new sales manager successfully!");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        SalesManage sm = (SalesManage)jTable1.getValueAt(selectedRow, 0);
        seller.getSalesManageDir().getSalesManageList().remove(sm);
        //remove the related useraccount
        system.getUserAccountDirectory().getUserAccountList().remove(sm.getUserAccount());
        populateTable();
        JOptionPane.showMessageDialog(null, "Delete the sales manager successfully!");
    }//GEN-LAST:event_btnDeleteActionPerformed


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
