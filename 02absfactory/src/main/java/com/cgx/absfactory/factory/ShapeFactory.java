package com.cgx.absfactory.factory;

import com.cgx.absfactory.api.Color;
import com.cgx.absfactory.api.ColorEnum;
import com.cgx.absfactory.api.Shape;
import com.cgx.absfactory.api.ShapeEnum;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:34
 **/
public  class ShapeFactory extends AbstractFactory {

//    public  Shape  getShape(ShapeEnum shapeEnum){
//        Shape shape = shapeEnum.getShape();
//        return shape;
//    }

    @Override
    Shape getShape(ShapeEnum shapeEnum) {
        return shapeEnum.getShape();
    }

    @Override
    Color getColor(ColorEnum colorEnum) {
        return null;
    }
}
