package com.cgx.v1;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 16:21
 **/
public class Test {

    public static void main(String[] args) throws IllegalAccessException {
        Composite superC = new Composite("super");
        Composite sub1 = new Composite("sub");
        Leaf leaf1 = new Leaf("leaf1");
        sub1.addComposite(leaf1);
        superC.addComposite(sub1);
        superC.operation();
    }
}
