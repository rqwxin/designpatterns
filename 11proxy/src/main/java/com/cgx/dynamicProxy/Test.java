package com.cgx.dynamicProxy;

import com.cgx.staticproxy.HelloApi;
import com.cgx.staticproxy.HelloImpl;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-07-11 18:48
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("######################");
        System.out.println("JDKDynamicProxy ");
        JDKDynamicProxy proxy = new JDKDynamicProxy(new HelloImpl());
        HelloApi api = proxy.getProxy();
        api.say("JDKDynamicProxy");

        System.out.println("######################");
        System.out.println("CglibProxy");
        CglibProxy cglibProxy = new CglibProxy();
        HelloApi api2 = cglibProxy.getCglibProxy(new HelloImpl());
        api2.say("CglibProxy");
        System.out.println("######################");
    }
}
