package com.cgx.absfactory.api;

import com.cgx.absfactory.impl.*;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:35
 **/
public enum ColorEnum {
    red("red",new Red()),
    Green("Green",new Green()),
    Black("Black",new Black());

    private String code;
    private Color color;

    ColorEnum(String code, Color color) {
        this.code = code;
        this.color = color;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
