/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Buyer.Buyer;
import Business.EcoSystem;
import Business.Network.Network;
import Business.Role.BuyerRole;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author TT1
 */
public class RegisterBuyerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RigisterJPanel
     */
   
    JPanel rightPanel;
    EcoSystem system;
    RegisterBuyerJPanel(JPanel rightPanel, EcoSystem system) {
        initComponents();
        this.rightPanel=rightPanel;
        this.system=system;
        initialize();
         
    }
    private void initialize(){
        for(Network network:system.getNetworkList()){
            jComboBox1.addItem(network.getName());
        }
     }
    private boolean usernamePatternCorrect() {
    //Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
    Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+$");
    Matcher m = p.matcher(txtUsername1.getText());
    boolean b = m.matches();
    return b;

  }

  private boolean passwordPatternCorrect() {
    Pattern p = Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{6,}$");
    Matcher m = p.matcher(txtPassword1.getText());
    boolean b = m.matches();
    return b;

  }

  private boolean rePasswordPatternCorrect() {

    String pword = txtPassword1.getText();
    String rword = txtPassword2.getText();
    boolean b = rword.equals(pword);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtPassword1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelephone1 = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);

        jLabel1.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel1.setText("Create New Buyer");

        jLabel11.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel11.setText("Telephone:");

        jLabel12.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel12.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel13.setText("Username:");

        btnRegister.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtPassword1.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        txtPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassword1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassword1KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel10.setText("Password:");

        txtTelephone1.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        txtTelephone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelephone1KeyPressed(evt);
            }
        });

        txtUsername1.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        txtUsername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsername1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsername1KeyReleased(evt);
            }
        });

        txtAddress1.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel14.setText("re-Password:");

        txtPassword2.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        txtPassword2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassword2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassword2KeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel15.setText("Network:");

        jComboBox1.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        jLabel16.setText("Position:");

        txtPosition.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/010-订单.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/016-代理商.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(635, 635, 635)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(34, 34, 34)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTelephone1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(36, 36, 36)
                                                .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(37, 37, 37)
                                                .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12))
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelephone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
         String netName = (String)jComboBox1.getSelectedItem();
       Network network=new Network();
        for(Network n:system.getNetworkList()){
            if(n.getName().equals(netName)){
               network=n;
            }
        }
        String userName=txtUsername1.getText();
        //check If Username Is Unique
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){}
        else{
            JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       
//        if(network.checkIfUserIsUnique(userName)){
//            JOptionPane.showMessageDialog(null, "UserName is not unique");
//            return;
//        }
        if (usernamePatternCorrect() == false || passwordPatternCorrect() == false || rePasswordPatternCorrect() == false)
        {
         txtUsername1.setBorder(BorderFactory.createLineBorder(Color.red));
         txtPassword1.setBorder(BorderFactory.createLineBorder(Color.red));
         txtPassword2.setBorder(BorderFactory.createLineBorder(Color.red));
         return;
        } 
        String password=txtPassword1.getText();
        String position=txtPosition.getText();
        String address=txtAddress1.getText();
        String telePhone=txtTelephone1.getText();
        
        
        Buyer buyer=new Buyer();
        UserAccount userAccount=new UserAccount();
        BuyerRole role=new BuyerRole();
        
        userAccount=system.getUserAccountDirectory().createUserAccount(userName,password,role); 
        buyer.setPosition(position);
        buyer.setAddress(address);
        buyer.setTelephone(telePhone);
        network.getBuyerDirectory().getBuyerList().add(buyer);
        network.getUserAccountDirectory().getUserAccountList().add(userAccount);
        buyer.setUserAccount(userAccount);
       
        
       
        txtUsername1.setText("");
        txtPassword1.setText("");
        txtPassword2.setText("");
        txtTelephone1.setText("");
        txtAddress1.setText("");
        txtPosition.setText("");
        jLabel7.setText("");
        jLabel4.setText("");
        jLabel6.setText("");
        jLabel5.setText("");
        JOptionPane.showMessageDialog(null, "Create a UserAccount successfully!");
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtUsername1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsername1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername1KeyPressed

    private void txtPassword1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPassword1KeyPressed

    private void txtPassword2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword2KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPassword2KeyPressed

    private void txtTelephone1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephone1KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
         {
            jLabel7.setText("Invalid Format");
            jLabel7.setForeground(Color.red);
            
        }
        else
        {jLabel7.setText("Correct Format!");
            jLabel7.setForeground(Color.blue);}
    }//GEN-LAST:event_txtTelephone1KeyPressed

    private void txtUsername1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsername1KeyReleased
        // TODO add your handling code here:
        if(usernamePatternCorrect()==false){
            jLabel4.setText("Invalid Format");
            jLabel4.setForeground(Color.red);
             txtUsername1.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        else
        {jLabel4.setText("Correct Format!");
            jLabel4.setForeground(Color.blue);
            txtUsername1.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_txtUsername1KeyReleased

    private void txtPassword1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword1KeyReleased
        // TODO add your handling code here:
        if(passwordPatternCorrect() == false){
            jLabel6.setText("Invalid Format");
            jLabel6.setForeground(Color.red);
             txtPassword1.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        else
        {jLabel6.setText("Correct Format!");
            jLabel6.setForeground(Color.blue);
        txtPassword1.setBorder(BorderFactory.createLineBorder(Color.gray));}
    }//GEN-LAST:event_txtPassword1KeyReleased

    private void txtPassword2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword2KeyReleased
        // TODO add your handling code here:
        if(rePasswordPatternCorrect() == false){
            jLabel5.setText("Invalid Format");
            jLabel5.setForeground(Color.red);
            txtPassword2.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        else
        {   jLabel5.setText("Correct Format!");
            jLabel5.setForeground(Color.blue);
            txtPassword2.setBorder(BorderFactory.createLineBorder(Color.gray));
        }
    }//GEN-LAST:event_txtPassword2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtTelephone1;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables
}
