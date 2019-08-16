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
public  class ColorFactory extends AbstractFactory {


    @Override
    Shape getShape(ShapeEnum shapeEnum) {
        return null;
    }

    @Override
    Color getColor(ColorEnum colorEnum) {
        return colorEnum.getColor();
    }
}
