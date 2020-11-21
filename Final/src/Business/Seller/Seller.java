/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import Business.Seller.InventorManage.InventoryManageDir;
import Business.Seller.PurchaseManage.PurchaseManageDir;
import Business.Seller.SalesManage.SalesManageDir;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jiaohongmei
 */
public class Seller {
    private String name;
    private String telephone; 
    private UserAccount userAccount;
    private InventoryManageDir inventoryManageDir;
    private PurchaseManageDir purchaseManageDir;
    private SalesManageDir salesManageDir;
}
