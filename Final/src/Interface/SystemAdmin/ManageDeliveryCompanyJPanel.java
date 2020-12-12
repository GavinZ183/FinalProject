/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;


import Business.EcoSystem;
import Business.ExpressCompany.ExpressCompany;
import Business.Network.Network;
import Business.Role.ExpressCompanyRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class ManageDeliveryCompanyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryCompanyJPanel
     */
     JPanel userProcessContainer;
    Network network;
    EcoSystem system;
    String oldname = "";

    

    ManageDeliveryCompanyJPanel(JPanel userProcessContainer, EcoSystem system, Network network) {
         initComponents();
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        btnSave.setEnabled(false);
        populateTable();
    }
    public void populateTable(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(ExpressCompany expressCompany:network.getExpressCompanyDir().getExpressCompanyList()){
            
                Object row[] = new Object[3];
                row[0] = expressCompany;
                row[1] =expressCompany.getUserAccount().getUsername();
                row[2] =expressCompany.getUserAccount().getPassword();
               
                model.addRow(row);
                }
            }

    private boolean usernamePatternCorrect(String username) {
    //Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+$");
        Matcher m = p.matcher(username);
        boolean b = m.matches();
        return b;

    }

    private boolean passwordPatternCorrect(String password) {
        Pattern p = Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{6,}$");
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        return b;

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnFreshTable = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUsername1 = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        btnFreshTable.setText("Fresh table");
        btnFreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshTableActionPerformed(evt);
            }
        });
        add(btnFreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 57, -1, 30));

        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 309, 90, 30));

        jLabel2.setText("Express Company list:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 88, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 402, 110, 27));

        jLabel4.setText("Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 405, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Express Company");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 11, 345, -1));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setText("Delete Express Company:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel8.setText("Update Express Company:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 367, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(90, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 401, 90, 30));

        jLabel9.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel9.setText("Create new Express Company:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 513, -1, -1));

        txtPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassword1KeyReleased(evt);
            }
        });
        add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 599, 110, 27));

        jLabel10.setText("Password:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 602, -1, -1));

        txtUsername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsername1KeyReleased(evt);
            }
        });
        add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 552, 169, 27));

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 402, 169, 27));
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 552, 110, 27));

        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 405, -1, -1));

        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 555, -1, -1));

        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 451, 90, 30));

        jLabel13.setText("Username:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 555, -1, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 452, 110, 27));

        btnCreate.setText("Create");
        btnCreate.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 598, 90, 30));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 455, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 133, 763, 147));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/023-货物查询.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 11, 70, 70));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 120, 20));
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 120, 20));
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 120, 20));
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      ExpressCompany expressCompany = ( ExpressCompany)jTable1.getValueAt(selectedRow, 0);
      network.getExpressCompanyDir().getExpressCompanyList().remove(expressCompany);
       
       UserAccount us=new UserAccount();
       us=expressCompany.getUserAccount();
       system.getUserAccountDirectory().getUserAccountList().remove(us);
          populateTable();
         JOptionPane.showMessageDialog(null, "Delete the buyer successfully!");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       ExpressCompany expressCompany = ( ExpressCompany)jTable1.getValueAt(selectedRow, 0);
      txtName.setText(expressCompany.getName());
      txtUsername.setText(expressCompany.getUserAccount().getUsername());
      txtPassword.setText(expressCompany.getUserAccount().getPassword());
      oldname = expressCompany.getUserAccount().getUsername();
      
       btnSave.setEnabled(true);
       btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
     ExpressCompany expressCompany = ( ExpressCompany)jTable1.getValueAt(selectedRow, 0);
      
     //check If Username Is Unique
        if(txtUsername.getText().equals(oldname)){}
        else{
            if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername.getText())){}
            else{
                JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        oldname = "";
     
        //check format of username and password
        if (usernamePatternCorrect(txtUsername.getText()) == false || passwordPatternCorrect(txtPassword.getText()) == false)
        {
         txtUsername.setBorder(BorderFactory.createLineBorder(Color.red));
         txtPassword.setBorder(BorderFactory.createLineBorder(Color.red));
         return;
        } 
        txtUsername.setBorder(BorderFactory.createLineBorder(Color.gray));
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.gray));
        
      expressCompany.setName(txtName.getText());
      expressCompany.getUserAccount().setPassword(txtPassword.getText());
      expressCompany.getUserAccount().setUsername(txtUsername.getText());
       populateTable();
       btnSave.setEnabled(false);
       btnUpdate.setEnabled(true);
       txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        jLabel15.setText("");
        jLabel16.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         String username=txtUsername1.getText();
        String password=txtPassword1.getText();
        String name=txtName1.getText();
        //check If Username Is Unique
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){}
        else{
            JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //check format of username and password
        if (usernamePatternCorrect(txtUsername1.getText()) == false || passwordPatternCorrect(txtPassword1.getText()) == false)
        {
         txtUsername1.setBorder(BorderFactory.createLineBorder(Color.red));
         txtPassword1.setBorder(BorderFactory.createLineBorder(Color.red));
         return;
        } 
        txtUsername1.setBorder(BorderFactory.createLineBorder(Color.gray));
         txtPassword1.setBorder(BorderFactory.createLineBorder(Color.gray));
         
        ExpressCompany expressCompany=new ExpressCompany();
        UserAccount userAccount=new UserAccount();
        ExpressCompanyRole role=new ExpressCompanyRole();
        
        userAccount=system.getUserAccountDirectory().createUserAccount(username,password,role); 
        
        expressCompany.setName(name);
        expressCompany.setUserAccount(userAccount);
        network.getExpressCompanyDir().getExpressCompanyList().add(expressCompany);
        network.getUserAccountDirectory().getUserAccountList().add(userAccount);
       
       
        
       
        txtUsername1.setText("");
        txtPassword1.setText("");
        txtName1.setText("");
        jLabel17.setText("");
        jLabel18.setText("");
         populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnFreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFreshTableActionPerformed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here:
        if(usernamePatternCorrect(txtUsername.getText())==false){
            jLabel15.setText("Invalid Format");
            jLabel15.setForeground(Color.red);
             
        }
        else
        {jLabel15.setText("Correct Format!");
            jLabel15.setForeground(Color.blue);
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        if(passwordPatternCorrect(txtPassword.getText())==false){
            jLabel16.setText("Invalid Format");
            jLabel16.setForeground(Color.red);

        }
        else
        {jLabel16.setText("Correct Format!");
            jLabel16.setForeground(Color.blue);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUsername1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsername1KeyReleased
        // TODO add your handling code here:
        if(usernamePatternCorrect(txtUsername1.getText())==false){
            jLabel17.setText("Invalid Format");
            jLabel17.setForeground(Color.red);
             
        }
        else
        {jLabel17.setText("Correct Format!");
            jLabel17.setForeground(Color.blue);
        }
    }//GEN-LAST:event_txtUsername1KeyReleased

    private void txtPassword1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword1KeyReleased
        // TODO add your handling code here:
        if(passwordPatternCorrect(txtPassword1.getText())==false){
            jLabel18.setText("Invalid Format");
            jLabel18.setForeground(Color.red);

        }
        else
        {jLabel18.setText("Correct Format!");
            jLabel18.setForeground(Color.blue);
        }
    }//GEN-LAST:event_txtPassword1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFreshTable;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables
}
