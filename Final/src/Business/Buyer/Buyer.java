/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Buyer;

import Business.BuyerOrder.BuyOrder;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jiaohongmei
 */
public class Buyer {
    private String telephone;
    private String address;
    private String position;
    public UserAccount userAccount;
    private BuyOrder buyOrder;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public BuyOrder getBuyOrder() {
        return buyOrder;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return userAccount.getUsername();
    }
}
