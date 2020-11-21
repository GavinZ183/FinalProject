/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller.PurchaseManage;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class PurchaseManageDir {
    private ArrayList<PurchaseManage> PurchaseManageList;

    public  PurchaseManageDir() {
        PurchaseManageList = new ArrayList();
    }

    public ArrayList<PurchaseManage> getPurchaseManageList() {
        return PurchaseManageList;
    }
}
