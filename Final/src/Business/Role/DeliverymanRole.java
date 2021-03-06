/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.DeliveryCompany.DeliveryMan.ConfirmDeliveryOrderJPanel;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DeliverymanRole extends Role{

@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system,Network network) {
        return new ConfirmDeliveryOrderJPanel(userProcessContainer,account,network);
    }
   @Override
    public String getType() {
        return RoleType.Deliveryman.getValue();
    }
    
}
