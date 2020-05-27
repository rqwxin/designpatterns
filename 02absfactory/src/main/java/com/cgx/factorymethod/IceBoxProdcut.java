package com.cgx.factorymethod;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-16 20:12
 **/
public class IceBoxProdcut extends  Product {
    @Override
    public void createProd() {
        System.out.println("生产冰箱");
    }
}
