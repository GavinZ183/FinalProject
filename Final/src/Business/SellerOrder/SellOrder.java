/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SellerOrder;

import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class SellOrder {
    private ArrayList<SellOrderItem> orderItemList;
    private int orderNumber;
    private static int count=0;
    
    public SellOrder()
    {
        count ++;
        orderNumber = count;
        orderItemList=new ArrayList<SellOrderItem>();
        
    }

    public ArrayList<SellOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<SellOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
     public SellOrderItem addOrderItem(Product p,int q,double price){
        SellOrderItem o=new SellOrderItem ();
       o.setProduct(p);
       o.setQuantity(q);
       o.setSalesprice(price);
       orderItemList.add(o);
        return o;
    }
     
     public void  removeOrderItem(SellOrderItem o){
         orderItemList.remove(o);
        
     }
}

