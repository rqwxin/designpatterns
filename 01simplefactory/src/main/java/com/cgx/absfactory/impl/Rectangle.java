package com.cgx.absfactory.impl;

import com.cgx.absfactory.api.Shape;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 15:34
 **/
public class Rectangle implements Shape {
    public void draw() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName+"draw");
    }
}
