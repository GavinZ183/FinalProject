/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;


import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class ProductCatalog {
   private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }
    
    public ArrayList<Product> getProductcatalog(){
        if(productCatalog ==null){
            productCatalog = new ArrayList<Product>();
        }
        return productCatalog;
    }
    
    
    public Product addProduct(){
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int id){
        for (Product product : productCatalog) {
//            if(product.getModelNumber()==id){
                return product;
            }
       return null;
        }
    
    }

