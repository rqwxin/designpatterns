package com.cgx.absfactory.factory;

import com.cgx.absfactory.api.ColorEnum;
import com.cgx.absfactory.api.ShapeEnum;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 16:51
 **/
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = AbstractFactoryCreater.getFactory("shape");
        AbstractFactory colorFactory = AbstractFactoryCreater.getFactory("color");
        shapeFactory.getShape(ShapeEnum.circle).draw();
        colorFactory.getColor(ColorEnum.Black).fill();

        shapeFactory.getShape(ShapeEnum.square).draw();
        colorFactory.getColor(ColorEnum.red).fill();

    }
}
