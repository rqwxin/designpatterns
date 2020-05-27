package com.cgx.factorymethod;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-16 20:10
 **/
public class IceBoxFactory extends AbstractFatory {

    Product getProdct() {
        return new IceBoxProdcut();
    }
}
