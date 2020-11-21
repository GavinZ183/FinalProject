/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuyerOrder;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class MasterBuyOrderCatalog {
    private ArrayList<BuyOrder> orderCatalog;
    
    public MasterBuyOrderCatalog()
    {
        orderCatalog=new ArrayList<BuyOrder> ();
    }

    public ArrayList<BuyOrder> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<BuyOrder> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    public BuyOrder addOrder(BuyOrder o){
      
        orderCatalog.add(o);
        return o;
        
    }
}
