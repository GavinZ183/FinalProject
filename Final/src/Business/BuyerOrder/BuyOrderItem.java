/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuyerOrder;


import Business.Product.Product;

/**
 *
 * @author jiaohongmei
 */
public class BuyOrderItem {
    
    private int quantity;
    private double salesprice;
    private Product product;
    private String status;//订单状态(商家已接单、商家已取消、商品已发货、商品已送达、确认收货)
    private Evaluate evaluate;//评价
    
    
   
    
//    @Override
//    public String toString()
//    {
//        return product.getProdName();
//    }
}
