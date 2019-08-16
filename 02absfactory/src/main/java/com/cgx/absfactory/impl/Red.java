package com.cgx.absfactory.impl;

import com.cgx.absfactory.api.Color;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-14 16:38
 **/
public class Red implements Color {
    public void fill() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName+" color fill");
    }
}
