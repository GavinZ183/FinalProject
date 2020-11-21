/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SellerOrder;

import Business.Product.Product;

/**
 *
 * @author jiaohongmei
 */
public class SellOrderItem {
    private int quantity;
    private double salesprice;
    private Product product;
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(double salesprice) {
        this.salesprice = salesprice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
   
    
//    @Override
//    public String toString()
//    {
//        return product.getProdName();
//    }
}
