package com.cgx;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 17:56
 **/
@Data
public class Circle implements Shape {

    //内部形态
    private String color;

    private double x;
    private double y;
    private double radius;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
