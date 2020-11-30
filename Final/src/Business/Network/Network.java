/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Buyer.BuyerDirectory;

import Business.ExpressCompany.ExpressCompanyDir;
import Business.Seller.SellerDirectory;
import Business.Service.ServiceDir;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private SellerDirectory sellerDirectory;
    private BuyerDirectory buyerDirectory;
    private ExpressCompanyDir expressCompanyDir;
    private ServiceDir serviceDir;
    private SupplierDirectory supplierDirectory;
    
    private UserAccountDirectory userAccountDirectory;
    
    
    public Network(){
        userAccountDirectory=new UserAccountDirectory();
        sellerDirectory=new SellerDirectory();
        buyerDirectory =new BuyerDirectory();
        expressCompanyDir=new ExpressCompanyDir();
        serviceDir =new ServiceDir();
        supplierDirectory =new SupplierDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SellerDirectory getSellerDirectory() {
        return sellerDirectory;
    }

    public BuyerDirectory getBuyerDirectory() {
        return buyerDirectory;
    }

    public ExpressCompanyDir getExpressCompanyDir() {
        return expressCompanyDir;
    }

    public ServiceDir getServiceDir() {
        return serviceDir;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
     public boolean checkIfUserIsUnique(String userName){
        
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
