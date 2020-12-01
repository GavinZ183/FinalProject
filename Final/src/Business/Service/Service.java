/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Service;

import Business.UserAccount.UserAccount;
import Business.BuyerOrder.BuyOrder;
/**
 *
 * @author jiaohongmei
 */
public class Service {//系统客服,买家或卖家可以申请客服,对订单进行第三方仲裁,来解决纠纷  
     private String name;
     private UserAccount userAccount;
     private BuyOrder buyOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setBuyOrder(BuyOrder buyOrder) {
        this.buyOrder = buyOrder;
    }
     
}
