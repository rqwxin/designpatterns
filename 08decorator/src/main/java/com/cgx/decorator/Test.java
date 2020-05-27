package com.cgx.decorator;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-18 19:45
 **/
public class Test {
    public static void main(String[] args) {
        Cake cake = new Cake();
        FruitCakeDecorator fruitCakeDecorator = new FruitCakeDecorator(cake);
        System.out.println(fruitCakeDecorator.toString());

        CreamCakeDecorator creamCakeDecorator = new CreamCakeDecorator(fruitCakeDecorator);
        System.out.println(creamCakeDecorator.toString());

        creamCakeDecorator.setSweetCompoent(cake);
        System.out.println(creamCakeDecorator.toString());
    }
}
