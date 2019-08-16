package com.cgx.bridge;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-16 11:27
 **/
@Data
public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
