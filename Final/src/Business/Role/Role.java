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
public abstract class Role {
    
    public enum RoleType{
        Buyer("Buyer"),
        Seller("Seller"),
        Supplier("Supplier"),
        Deliveryman("Deliveryman"),
        ExpressCompany("ExpressCompany"), 
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
//    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
//            UserAccount account,  
//            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    public String getType() {
        return RoleType.Buyer.getValue();
    }
}