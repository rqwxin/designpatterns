package com.cgx.factorymethod;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-16 20:41
 **/
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        AbstractFatory factory = FactoryContent.getFactory(AirConditionerFactory.class);
        Product prodct = factory.getProdct();
        prodct.createProd();
    }
}
