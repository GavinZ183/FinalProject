/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExpressCompany;

import Business.BuyerOrder.BuyOrder;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jiaohongmei
 */
public class ExpressCompany {
    private String name;
    public UserAccount userAccount;
    private DriverDir driverDir;
    private DeliverymanDirectory deliverymanDirectory;
    private BuyOrder buyOrder;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

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

    public DriverDir getDriverDir() {
        return driverDir;
    }

    public void setDriverDir(DriverDir driverDir) {
        this.driverDir = driverDir;
    }

    public DeliverymanDirectory getDeliverymanDirectory() {
        return deliverymanDirectory;
    }

    public void setDeliverymanDirectory(DeliverymanDirectory deliverymanDirectory) {
        this.deliverymanDirectory = deliverymanDirectory;
    }

    public BuyOrder getBuyOrder() {
        if(buyOrder == null){
            buyOrder = new BuyOrder();
        }
        return buyOrder;
    }
    
    
}
