/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Seller.Seller;
import Business.Supplier.Supplier;

/**
 *
 * @author jiaohongmei
 */
public class Product {
    private String prodName;
    private int price;
    private int modelNumber;
 
    private String discribe;
    private int quantity;
    private Supplier supplier;
    private String imagePath;
    
    private static int count =0;

    public Product() {
        this.modelNumber = count;
        count++;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   

    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplierr(Supplier supplierr) {
        this.supplier = supplierr;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Override
    public String toString() {
        return prodName;
    }
}
