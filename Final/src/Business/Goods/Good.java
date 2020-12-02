/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Goods;

import Business.Goods.Comments;
import Business.Seller.Seller;

/**
 *
 * @author TT1
 */
public class Good {
    private String prodName;
    private int price;
    private int modelNumber;
    private String discribe;
    private int quantity;
    private Seller seller;
    private String imagePath;
    private Comments comments;
    
    private static int count =0;

    public Good() {
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

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Comments getComments() {
        return comments;
    }
    
    @Override
    public String toString() {
        return prodName;
    }
}
