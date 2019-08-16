package com.cgx.prototype.prototypeimpl;

import com.cgx.prototype.absprototype.Shape;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 15:31
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName+"---》draw");
    }
}
