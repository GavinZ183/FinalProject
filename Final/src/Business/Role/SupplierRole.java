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
public class SupplierRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
//        return new AdminWorkAreaJPanel(userProcessContainer,account,business);
//    }
   @Override
    public String getType() {
        return RoleType.Buyer.getValue();
    }
    
}
