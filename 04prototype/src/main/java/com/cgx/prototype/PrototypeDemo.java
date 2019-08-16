package com.cgx.prototype;

import com.cgx.prototype.absprototype.Shape;
import com.cgx.prototype.prototypeimpl.Circle;
import com.cgx.prototype.prototypeimpl.ShapeCache;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 15:37
 **/
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Circle circle = new Circle();
//        Circle clone = (Circle) circle.clone();
//        clone.draw();
        ShapeCache.loadShape();
        Shape shape = ShapeCache.getShape("1");
        shape.draw();

        shape = ShapeCache.getShape("2");
        shape.draw();
    }
}
