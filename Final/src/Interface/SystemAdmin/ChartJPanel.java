/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

import Business.Buyer.Buyer;
import Business.BuyerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Goods.Comment;
import Business.Goods.Good;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.SellerOrder.SellOrderItem;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author TT1
 */
public class ChartJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public ChartJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        jPanel1.add(NetworkBarChart());
        jPanel2.add(PieChart());
        jPanel3.add(SellBarChart());
    }
    
    public ChartPanel NetworkBarChart(){
        //set data of chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Network net: system.getNetworkList()){
            int buyerNum = 0;
            int buyOrderItemNum = 0;
            int sellerNum = 0;
            int sellOrderItemNum = 0;
            int supplierNum = 0;
            for(Buyer buyer: net.getBuyerDirectory().getBuyerList()){
                buyerNum++;
                for(BuyOrderItem item: buyer.getBuyOrder().getOrderItemList()){
                    buyOrderItemNum = buyOrderItemNum + item.getQuantity();
                }
            }
            for(Seller seller: net.getSellerDirectory().getSellerList()){
                sellerNum++;
                for(SellOrderItem item: seller.getSellOrder().getOrderItemList()){
                    sellOrderItemNum = sellOrderItemNum + item.getQuantity();
                }
            }
            for(Supplier supplier: net.getSupplierDirectory().getsupplierList()){
                supplierNum++;
            }
            
            dataset.addValue(buyerNum, net.getName(), "buyer");
            //dataset.addValue(buyOrderItemNum, net.getName(), "buy order item");
            dataset.addValue(sellerNum, net.getName(), "sellr");
            //dataset.addValue(sellOrderItemNum, net.getName(), "sell order item");
            dataset.addValue(supplierNum, net.getName(), "supplier");
        }
        JFreeChart chart = ChartFactory.createBarChart3D(
       		                 "Number of diferent roles in Networks", // 图表标题
                            "Role", // 目录轴的显示标签
                            "Quantity", // 数值轴的显示标签
                            dataset, // 数据集
                            PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                            true,           // 是否显示图例(对于简单的柱状图必须是false)
                            false,          // 是否生成工具
                            false           // 是否生成URL链接
                            );
        
        //从这里开始
        CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象
        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
         domainAxis.setLabelFont(new Font("黑体",Font.BOLD,16));         //水平底部标题
         domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,14));  //垂直标题
         ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
         rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,17));
          chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 17));
          chart.getTitle().setFont(new Font("宋体",Font.BOLD,22));//设置标题字体
          
          //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
          
        ChartPanel frame1=new ChartPanel(chart,true);
        frame1.setBounds(1, 1, 400, 300);
        return frame1;
    }
    
    public ChartPanel PieChart(){
        DefaultPieDataset dataset = new DefaultPieDataset();
         for(Network net: system.getNetworkList()){
            int buyOrderItemNum = 0;
            int sellOrderItemNum = 0;
            for(Buyer buyer: net.getBuyerDirectory().getBuyerList()){
                for(BuyOrderItem item: buyer.getBuyOrder().getOrderItemList()){
                    buyOrderItemNum = buyOrderItemNum + item.getQuantity();
                }
            }
            for(Seller seller: net.getSellerDirectory().getSellerList()){
                for(SellOrderItem item: seller.getSellOrder().getOrderItemList()){
                    sellOrderItemNum = sellOrderItemNum + item.getQuantity();
                }
            }
            dataset.setValue(net.getName()+" buy order: "+ String.valueOf(buyOrderItemNum),buyOrderItemNum);
            dataset.setValue(net.getName()+" sell order: "+ String.valueOf(sellOrderItemNum),sellOrderItemNum);
         }
        JFreeChart chart = ChartFactory.createPieChart3D("Order Distribution",dataset,true,false,false);
	    //设置百分比
	      PiePlot pieplot = (PiePlot) chart.getPlot();
	      DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题
	      NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象
	      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//获得StandardPieSectionLabelGenerator对象
	      pieplot.setLabelGenerator(sp1);//设置饼图显示百分比
	  
	  //没有数据的时候显示的内容
	      pieplot.setNoDataMessage("无数据显示");
	      pieplot.setCircular(false);
	      pieplot.setLabelGap(0.02D);
	  
	      pieplot.setIgnoreNullValues(true);//设置不显示空值
	      pieplot.setIgnoreZeroValues(true);//设置不显示负值
	      ChartPanel frame1=new ChartPanel (chart,true);
	      chart.getTitle().setFont(new Font("宋体",Font.BOLD,22));//设置标题字体
	      PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
	      piePlot.setLabelFont(new Font("宋体",Font.BOLD,12));//解决乱码
	      chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,12));
              frame1.setBounds(1, 1, 400, 300);
              return frame1;
    }

    public ChartPanel SellBarChart(){
        //set data of chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Network net: system.getNetworkList()){
            int sellerNum = 0;
            for(Seller seller: net.getSellerDirectory().getSellerList()){
                for(Good good: seller.getSellerGoodCatalog().getGoodCatalog()){
                    int scoreSum = 0;
                    int commentNum = 0;
                    int average = 0;
                    for(Comment comment: good.getComments().getCommentList()){
                        commentNum++;
                        scoreSum =scoreSum + comment.getScore();
                    }
                    if(commentNum !=0){
                        average = scoreSum /commentNum;
                    }
                    dataset.addValue(average, seller.getName(), good.getProdName());
                }
            }
            
            //dataset.addValue(sellerNum, net.getName(), "sellr");
        }
        JFreeChart chart = ChartFactory.createBarChart3D(
       		                 "Seller Good Score", // 图表标题
                            "Seller", // 目录轴的显示标签
                            "Average Score", // 数值轴的显示标签
                            dataset, // 数据集
                            PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                            true,           // 是否显示图例(对于简单的柱状图必须是false)
                            false,          // 是否生成工具
                            false           // 是否生成URL链接
                            );
        
        //从这里开始
        CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象
        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
         domainAxis.setLabelFont(new Font("黑体",Font.BOLD,16));         //水平底部标题
         domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,14));  //垂直标题
         ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
         rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,17));
          chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 17));
          chart.getTitle().setFont(new Font("宋体",Font.BOLD,22));//设置标题字体
          
          //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
          
        ChartPanel frame1=new ChartPanel(chart,true);
        frame1.setBounds(1, 1, 400, 300);
        return frame1;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.Color.pink);

        btnBack.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/023-货物查询.png"))); // NOI18N

        jLabel1.setBackground(java.awt.Color.pink);
        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Chart Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
               userProcessContainer.add(new SystemMainJPanel(userProcessContainer,system));
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
