/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;



import Business.UserAccount.UserAccount;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

//   @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
//        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
//    }
    @Override
    public String getType() {
        return RoleType.SysAdmin.getValue();
    }

}
