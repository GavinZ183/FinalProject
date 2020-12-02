/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SellerOrder;

import Business.Product.Product;
import Business.Seller.Seller;
import Business.Supplier.Supplier;

/**
 *
 * @author jiaohongmei
 */
public class SellOrderItem {
    private int quantity;
    private double salesprice;
    private Product product;
    private Seller seller;
    private Supplier supplier;
    private String status;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
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
