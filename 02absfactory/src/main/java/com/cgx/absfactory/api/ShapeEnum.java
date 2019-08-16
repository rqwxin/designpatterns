package com.cgx.absfactory.api;

import com.cgx.absfactory.impl.Circle;
import com.cgx.absfactory.impl.Rectangle;
import com.cgx.absfactory.impl.Square;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:35
 **/
public enum ShapeEnum {
    circle("circle",new Circle()),
    rectangle("Rectangle",new Rectangle()),
    square("square",new Square());

    private String code;
    private Shape shape;

    ShapeEnum(String code, Shape shape) {
        this.code = code;
        this.shape = shape;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
