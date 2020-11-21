/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Seller.SellerDirectory;
import Business.Buyer.BuyerDirectory;
import Business.ExpressCompany.ExpressCompanyDir;
import Business.Supplier.SupplierDirectory;
import Business.Service.ServiceDir;


/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private SellerDirectory sellerDirectory;
    private BuyerDirectory buyerDirectory;
    private ExpressCompanyDir expressCompanyDir;

   
    private SupplierDirectory supplierDirectory;
    private ServiceDir serviceDir;
    
    public Network(){
        sellerDirectory=new SellerDirectory();
        buyerDirectory=new BuyerDirectory();
        expressCompanyDir=new ExpressCompanyDir();
        supplierDirectory=new SupplierDirectory();
        serviceDir=new ServiceDir();
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

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public ServiceDir getServiceDir() {
        return serviceDir;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
