/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author TT1
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
  // 得到显示器屏幕的宽高
    public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    // 定义窗体的宽高
    public int windowsWedth = 1020;
    public int windowsHeight = 720;

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        
        //this.setSize(1000, 700);
       
  
        // 设置窗体位置和大小
        this.setBounds((width - windowsWedth) / 2,
                (height - windowsHeight) / 2, windowsWedth, windowsHeight);
    
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnNewUser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        leftPanel.setBackground(java.awt.Color.pink);
        leftPanel.setPreferredSize(new java.awt.Dimension(160, 698));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jLabel1.setText("Welcome: ");
        leftPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jLabel2.setText("Username:");
        leftPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, -1));
        leftPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 148, -1));

        jLabel3.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jLabel3.setText("Password:");
        leftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 218, -1, -1));

        btnLogin.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        leftPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 370, 148, 40));

        btnLogout.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        leftPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 447, 148, 40));
        leftPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 250, 148, -1));

        btnNewUser.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        btnNewUser.setText("New Buyer");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        leftPanel.add(btnNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 531, 148, 40));

        jLabel4.setFont(new java.awt.Font("PingFang HK", 0, 18)); // NOI18N
        leftPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 72, 124, 28));

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setBackground(java.awt.Color.pink);
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel5.setBackground(java.awt.Color.pink);
        jLabel5.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/购物.png"))); // NOI18N
        jLabel5.setText("     Welcome to Shopping System");
        rightPanel.add(jLabel5, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(new RegisterBuyerJPanel(rightPanel,system));
        layout.next(rightPanel);
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        btnLogout.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogin.setEnabled(true);
        btnNewUser.setEnabled(true);

        txtUsername.setText("");
        txtPassword.setText("");
        jLabel4.setText("");

        rightPanel.removeAll();
        JPanel blankJP = new LogoutJPanel();
        rightPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) rightPanel.getLayout();
        crdLyt.next(rightPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username=txtUsername.getText();
        String password=String.valueOf(txtPassword.getPassword());
        UserAccount user=null;

        user=system.getUserAccountDirectory().authenticateUser(username, password);

        if(user==null){
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        Network network=new Network();
        for(Network ne:system.getNetworkList()){
            for(UserAccount ua: ne.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(username)){
                    network=ne;
                }
            }
        }

        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(user.getRole().createWorkArea(rightPanel, user, system,network));
        layout.next(rightPanel);

        jLabel4.setText(username);

        btnLogout.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        btnLogin.setEnabled(false);
        btnNewUser.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
