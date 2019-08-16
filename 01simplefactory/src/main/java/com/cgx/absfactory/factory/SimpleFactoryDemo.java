package com.cgx.absfactory.factory;

import com.cgx.absfactory.api.Shape;
import com.cgx.absfactory.api.ShapeEnum;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:42
 **/
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(ShapeEnum.circle);
        shape.draw();

         shape = shapeFactory.getShape(ShapeEnum.rectangle);
        shape.draw();

        shape = shapeFactory.getShape(ShapeEnum.square);
        shape.draw();
    }
}
