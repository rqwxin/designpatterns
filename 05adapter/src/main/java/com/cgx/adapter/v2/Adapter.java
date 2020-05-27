package com.cgx.adapter.v2;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-19 17:21
 **/
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void targetAction() {
        System.out.println("适配器 实现目标方法");
        adaptee.adapteeAction();
    }
}
