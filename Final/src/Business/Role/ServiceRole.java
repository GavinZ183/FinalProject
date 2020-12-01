/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.SystemAdmin.ManageServiceJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ServiceRole extends Role{

  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system,Network network) {
<<<<<<< HEAD
        return new ManageServiceJPanel(userProcessContainer,network);
        //还未创建service的interface
=======
        return new ServiceJPanel(userProcessContainer,account,network);
>>>>>>> 99c20ec45c82b739fe3d1251f9c331d65308b6da
    }
   @Override
    public String getType() {
        return RoleType.Buyer.getValue();
    }
    
}
