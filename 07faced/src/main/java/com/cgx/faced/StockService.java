package com.cgx.faced;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-12 12:37
 **/
public class StockService {

    public  boolean isAvailable(Order order){
        //库存校验
        System.out.println(order.getProdName()+"，购买数量"+order.getNum()+"，库存满足");
        return true;
    }
}
