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
public class ExpressCompanyDir {
    private ArrayList<ExpressCompany>ExpressCompanyList;

    public  ExpressCompanyDir() {
        ExpressCompanyList = new ArrayList();
    }

    public ArrayList<ExpressCompany> getExpressCompanyList() {
        return ExpressCompanyList;
    }
}
