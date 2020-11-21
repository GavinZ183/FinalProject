/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller.SalesManage;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class SalesManageDir {
    private ArrayList<SalesManage> SalesManageList;

    public  SalesManageDir() {
        SalesManageList = new ArrayList();
    }

    public ArrayList<SalesManage> getSalesManageList() {
        return SalesManageList;
    }
}
