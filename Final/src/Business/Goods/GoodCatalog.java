/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TT1
 */
public class GoodCatalog {
    private List<Good> goodCatalog;

    public GoodCatalog() {
        goodCatalog = new ArrayList<Good>();
    }
    
    public List<Good> getGoodCatalog(){
        return goodCatalog;
    }
    
    
    public Good addGood(){
        Good g = new Good();
        goodCatalog.add(g);
        return g;
    }
    
    public void removeGood(Good g){
        goodCatalog.remove(g);
    }
    
    public Good searchGood(int id){
        for (Good good : goodCatalog) {
//            if(product.getModelNumber()==id){
                return good;
            }
       return null;
        }
}
