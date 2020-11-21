/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller.InventorManage;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class InventoryManageDir {
    private ArrayList<InventoryManage> InventoryManageList;

    public  InventoryManageDir() {
        InventoryManageList = new ArrayList();
    }

    public ArrayList<InventoryManage> getInventoryManageList() {
        return InventoryManageList;
    }
}
