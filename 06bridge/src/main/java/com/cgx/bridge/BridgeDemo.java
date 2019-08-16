package com.cgx.bridge;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-16 11:39
 **/
public class BridgeDemo {
    public static void main(String[] args) {
        Color wihle = new WihleColor();
        Color yellowColor = new YellowColor();
        Color redColor = new RedColor();

        Shape circle = new Circle(wihle);
        circle.draw();
        circle.setColor(yellowColor);
        circle.draw();
        circle.setColor(redColor);
        circle.draw();

        Shape shape = new Square(yellowColor);
        shape.draw();
    }
}
