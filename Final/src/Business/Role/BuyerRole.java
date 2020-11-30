/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.Buyer.BuyerMainJPanel;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class BuyerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,Network network) {
        return new BuyerMainJPanel(userProcessContainer,account,network);
    }
   @Override
    public String getType() {
        return RoleType.Buyer.getValue();
    }
    
}
