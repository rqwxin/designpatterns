package com.cgx.faced;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-12 12:37
 **/
public class PayService {

    public  boolean pay(Order order){
        //积分
        System.out.println(order.getProdName()+"，购买数量"+order.getNum()+"，支付成功");
        return true;
    }

    public void confirm(Order order){
        System.out.println(order.getProdName()+"，购买数量"+order.getNum()+"，用户确认");
    }
}
