/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.Supplier.SupplierMainJPanel;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SupplierRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,EcoSystem system, Network network) {
        return new SupplierMainJPanel(userProcessContainer,account,network);
    }
   @Override
    public String getType() {
        return RoleType.Supplier.getValue();
    }
    
}
