/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BuyerOrder;


import Business.Buyer.Buyer;
import Business.Goods.Good;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jiaohongmei
 */
public class BuyOrderItem {
    
    private int quantity;
    private Good good;
    private String status;//订单状态(商家已接单、商家已取消、商品已发货、商品已送达、确认收货)(pending,recieved)
    private Evaluate evaluate;//评价
    private Date createTime;
    private ArrayList<String> messages;//message's format: 'time username: message'
    
    private Buyer buyer;
    private String orderPosition;

    public String getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(String orderPosition) {
        this.orderPosition = orderPosition;
    }
    

   

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
   
    
    @Override
    public String toString()
    {
       return good.getProdName();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Evaluate getEvaluate() {
        if(evaluate ==null){
            evaluate = new Evaluate();
        }
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

    public ArrayList<String> getMessages() {
        if(messages == null){
            messages = new ArrayList<String>();
        }
        return messages;
    }
    
}
