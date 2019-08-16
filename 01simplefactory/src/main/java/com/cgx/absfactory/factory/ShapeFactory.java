package com.cgx.absfactory.factory;

import com.cgx.absfactory.api.Shape;
import com.cgx.absfactory.api.ShapeEnum;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:34
 **/
public class ShapeFactory {

    public  Shape  getShape(ShapeEnum shapeEnum){
        Shape shape = shapeEnum.getShape();
        return shape;
    }
}
