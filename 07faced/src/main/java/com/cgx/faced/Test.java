package com.cgx.faced;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-12 12:45
 **/
public class Test {
    public static void main(String[] args) {
        OrderFace orderFace = new OrderFace();
        Order order = new Order();
        order.setNum(1);
        order.setProdId("9999");
        order.setProdName("水平座的眼泪");
        //orderFace.confirmOrder(order);
        System.out.println("========================");
        orderFace.submitOrder(order);
    }
}
