/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SellerOrder;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class MasterSellOrderCatalog {
    private ArrayList<SellOrder> orderCatalog;
    
    public MasterSellOrderCatalog()
    {
        orderCatalog=new ArrayList<SellOrder> ();
    }

    public ArrayList<SellOrder> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<SellOrder> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    public SellOrder addOrder(SellOrder o){
      
        orderCatalog.add(o);
        return o;
        
    }
}
