/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;

    public  SupplierDirectory() {
        supplierList = new ArrayList();
    }

    public ArrayList<Supplier> getsupplierList() {
        return supplierList;
    }
}
