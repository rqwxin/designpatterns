package com.cgx.faced;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-12 12:37
 **/
public class IntegralService {

    public  boolean change(Order order){
        //积分变更
        System.out.println(order.getProdName()+"，购买数量"+order.getNum()+"，积分增加");
        return true;
    }
}
