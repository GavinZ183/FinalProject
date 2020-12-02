/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Service;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class ServiceDir {
    private ArrayList<Service> supplierList;

    public  ServiceDir() {
        supplierList = new ArrayList();
    }

    public ArrayList<Service> getserviceList() {
        return supplierList;
    }
}
