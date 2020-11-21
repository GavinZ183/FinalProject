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
public class DriverDir {
     private ArrayList<Driver>DriverList;

    public  DriverDir() {
        DriverList = new ArrayList();
    }

    public ArrayList<Driver> getDriverList() {
        return DriverList;
    }
}
