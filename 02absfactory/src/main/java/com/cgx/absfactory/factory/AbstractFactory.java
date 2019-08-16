package com.cgx.absfactory.factory;

import com.cgx.absfactory.api.Color;
import com.cgx.absfactory.api.ColorEnum;
import com.cgx.absfactory.api.Shape;
import com.cgx.absfactory.api.ShapeEnum;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 16:44
 **/
public abstract class AbstractFactory {
    abstract Shape getShape(ShapeEnum shapeEnum);
    abstract Color getColor(ColorEnum colorEnum);
}
