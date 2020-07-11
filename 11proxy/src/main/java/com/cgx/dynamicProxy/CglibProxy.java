package com.cgx.dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**********
 * @program: designpatterns
 * @description: Cglib动态代理，实现MethodInterceptor接口
 * @author: cgx
 * @create: 2020-07-11 19:28
 **/
public class CglibProxy  implements MethodInterceptor{
    private Object target;


    //重写拦截方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before CglibProxy");
        Object invoke = method.invoke(target, objects);
        System.out.println("after CglibProxy");
        return null;
    }

    //定义获取代理对象方法
    public <T> T getCglibProxy(Object objectTarget){
        //为目标对象target赋值
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        // 设置回调
        enhancer.setCallback(this);
        //创建并返回代理对象
        Object result = enhancer.create();
        return (T) result;
    }
}
