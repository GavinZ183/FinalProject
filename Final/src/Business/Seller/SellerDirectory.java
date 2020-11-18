/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class SellerDirectory {
     private ArrayList<Seller> SellerList;

    public  SellerDirectory() {
        SellerList = new ArrayList();
    }

    public ArrayList<Seller> getSellerList() {
        return SellerList;
    }
    
}
