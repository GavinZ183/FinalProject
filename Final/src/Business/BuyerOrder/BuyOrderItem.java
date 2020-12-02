/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuyerOrder;


import Business.Product.Product;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jiaohongmei
 */
public class BuyOrderItem {
    
    private int quantity;
    private double salesprice;
    private Product product;
    private String status;//订单状态(商家已接单、商家已取消、商品已发货、商品已送达、确认收货)(pending,recieved)
    private Evaluate evaluate;//评价
    private Date createTime;
    
   
    
    @Override
    public String toString()
    {
       return product.getProdName();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Evaluate getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Evaluate evaluate) {
        this.evaluate = evaluate;
    }
    
    public String getCreateTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return format.format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
//set time by string
    /* 
    public void setCreateTime(String createTime) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = format.parse(createTime);
        this.createTime = date;
    }
*/
}
