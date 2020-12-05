/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Product.ProductCatalog;

import Business.UserAccount.UserAccount;

/**
 *
 * @author jiaohongmei
 */
public class Supplier {
    private String name;
    private String type;

    private UserAccount userAccount;
    private ProductCatalog productCatalog;
<<<<<<< HEAD
    
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
=======
   
>>>>>>> 6619b88e35ad4bb330de8d80980ce77cf3b7d7cf

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    
}
