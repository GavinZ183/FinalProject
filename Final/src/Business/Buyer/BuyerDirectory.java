/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Buyer;


import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class BuyerDirectory {
    private ArrayList<Buyer> BuyerList;

    public  BuyerDirectory() {
        BuyerList = new ArrayList();
    }

    public ArrayList<Buyer> getBuyerList() {
        return BuyerList;
    }
    
}
