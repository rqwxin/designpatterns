package com.cgx.factorymethod;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-16 20:15
 **/
public class AirConditionerProduct extends Product {
    @Override
    public void createProd() {
        System.out.println("生产空调");
    }
}
