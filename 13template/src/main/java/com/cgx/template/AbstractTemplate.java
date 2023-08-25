package com.cgx.template;

/**
 * 模版算法定义抽象类
 */
public abstract class AbstractTemplate {

    public final void templateMethod(){
        method1();
        method2();
    }

    public void method1(){
        System.out.println("共用方法");
    }

    public abstract  void  method2();
}
