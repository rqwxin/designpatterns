package com.cgx.absfactory.impl;

import com.cgx.absfactory.api.Shape;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:32
 **/
public class Circle implements Shape {
    public void draw() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName+"draw");
    }
}
