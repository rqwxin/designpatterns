package com.cgx.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**********
 * @description: jdk 动态代理
 * @author: cgx
 * @create: 2018-11-30 15:51
 **/
public class JDKDynamicProxy implements InvocationHandler {
    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return  result;
    }

    private void after() {
        System.out.println("after dynamicProxy invoke");
    }

    private void before() {
        System.out.println("before dynamicProxy invoke");
    }

    public  <T> T getProxy(){
        Object instance = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);

        return (T) instance;

    }
}
