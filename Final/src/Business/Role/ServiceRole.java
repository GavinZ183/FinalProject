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
        return new ManageServiceJPanel(userProcessContainer,system,network);
        //还未创建service的interface
        //return new ServiceJPanel(userProcessContainer,account,network);
    }
   @Override
    public String getType() {
        return RoleType.Buyer.getValue();
    }
    
}
