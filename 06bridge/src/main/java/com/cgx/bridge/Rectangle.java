package com.cgx.bridge;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-16 11:34
 **/
public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
           color.fill(this);
    }
}
