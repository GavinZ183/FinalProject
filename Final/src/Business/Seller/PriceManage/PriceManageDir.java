/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller.PriceManage;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class PriceManageDir {
    private ArrayList<PriceManage> PriceManageList;

    public  PriceManageDir() {
        PriceManageList = new ArrayList();
    }

    public ArrayList<PriceManage> getPriceManageList() {
        return PriceManageList;
    }
}
