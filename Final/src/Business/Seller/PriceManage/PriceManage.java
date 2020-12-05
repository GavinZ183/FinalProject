/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller.PriceManage;

import Business.UserAccount.UserAccount;

/**
 *
 * @author jiaohongmei
 */
public class PriceManage {//价格管理员
   private UserAccount userAccount;
   private String name;
   private String telephone;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
