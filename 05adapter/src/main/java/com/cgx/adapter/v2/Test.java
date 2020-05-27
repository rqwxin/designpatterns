package com.cgx.adapter.v2;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-19 17:24
 **/
public class Test {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.targetAction();
    }
}
