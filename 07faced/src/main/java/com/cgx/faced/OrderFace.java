package com.cgx.faced;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-12 12:43
 **/
public class OrderFace {

    private StockService stockService = new StockService();

    private PayService payService = new PayService();

    private IntegralService integralService = new IntegralService();



    public void submitOrder(Order order){
        boolean available = stockService.isAvailable(order);
        if (available){
            integralService.change(order);
            payService.pay(order);
        }
    }

    public void confirmOrder(Order order){
        payService.confirm(order);
    }
}
