package com.cgx.factorymethod;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-16 20:20
 **/
public class FactoryContent {

    public  static AbstractFatory getFactory(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(clazz.getName());
        Object o = aClass.newInstance();
        return (AbstractFatory) o;
    }
}
