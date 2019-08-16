package com.cgx.absfactory.factory;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 16:52
 **/
public class AbstractFactoryCreater {

    public static AbstractFactory getFactory(String factoryName){
        if("shape".equals(factoryName)){
            return  new ShapeFactory();
        }
        if("color".equals(factoryName)){
            return  new ColorFactory();
        }
        return  null;
    }

}
