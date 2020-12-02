/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;



import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.SystemAdmin.SystemMainJPanel;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,EcoSystem system,Network network) {
        return new SystemMainJPanel(userProcessContainer,system);
    }
    @Override
    public String getType() {
        return RoleType.SysAdmin.getValue();
    }

}
