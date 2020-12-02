/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import Business.Product.ProductCatalog;
import Business.Seller.InventorManage.InventoryManageDir;
import Business.Seller.PurchaseManage.PurchaseManageDir;
import Business.Seller.SalesManage.SalesManageDir;
import Business.SellerOrder.SellOrder;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jiaohongmei
 */
public class Seller {
    private String name;
    private String telephone; 
    private String address;
    private String position;
    private UserAccount userAccount;
    private ProductCatalog sellerProductCatalog;
    private InventoryManageDir inventoryManageDir;
    private PurchaseManageDir purchaseManageDir;
    private SalesManageDir salesManageDir;
    private SellOrder sellOrder;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public ProductCatalog getSellerProductCatalog() {
        return sellerProductCatalog;
    }

    public void setSellerProductCatalog(ProductCatalog sellerProductCatalog) {
        this.sellerProductCatalog = sellerProductCatalog;
    }

    public InventoryManageDir getInventoryManageDir() {
        return inventoryManageDir;
    }

    public void setInventoryManageDir(InventoryManageDir inventoryManageDir) {
        this.inventoryManageDir = inventoryManageDir;
    }

    public PurchaseManageDir getPurchaseManageDir() {
        return purchaseManageDir;
    }

    public void setPurchaseManageDir(PurchaseManageDir purchaseManageDir) {
        this.purchaseManageDir = purchaseManageDir;
    }

    public SalesManageDir getSalesManageDir() {
        return salesManageDir;
    }

    public void setSalesManageDir(SalesManageDir salesManageDir) {
        this.salesManageDir = salesManageDir;
    }

    public SellOrder getSellOrder() {
        return sellOrder;
    }

    public void setSellOrder(SellOrder sellOrder) {
        this.sellOrder = sellOrder;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
