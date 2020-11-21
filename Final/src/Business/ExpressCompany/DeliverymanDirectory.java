/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExpressCompany;


import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class DeliverymanDirectory {
    private ArrayList<Deliveryman> DeliverymanList;

    public  DeliverymanDirectory() {
        DeliverymanList = new ArrayList();
    }

    public ArrayList<Deliveryman> getDeliverymanList() {
        return DeliverymanList;
    }
}
