/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuyerOrder;


import Business.Product.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class BuyOrder {
    private ArrayList<BuyOrderItem> orderItemList;
    private int orderNumber;
    private static int count=0;
    
    
    public BuyOrder()
    {
        count ++;
        orderNumber = count;
        orderItemList=new ArrayList<BuyOrderItem>();
        
    }

    public ArrayList<BuyOrderItem> getOrderItemList() {
        if(orderItemList == null){
            orderItemList = new ArrayList<BuyOrderItem>();
        }
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<BuyOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

     public BuyOrderItem addOrderItem(Product p,int q,double price){
        BuyOrderItem o=new BuyOrderItem ();
//       o.setProduct(p);
//       o.setQuantity(q);
//       o.setSalesprice(price);
       orderItemList.add(o);
        return o;
    }
     
     public void  removeOrderItem(BuyOrderItem o){
         orderItemList.remove(o);
        
     }
}

