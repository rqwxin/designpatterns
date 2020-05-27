package com.cgx.factorymethod;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-16 20:19
 **/
public class AirConditionerFactory extends AbstractFatory {
    Product getProdct() {
        return new AirConditionerProduct();
    }
}
