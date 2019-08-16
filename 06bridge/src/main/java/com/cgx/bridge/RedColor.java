package com.cgx.bridge;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-16 11:39
 **/
public class RedColor implements Color {
    public void fill(Shape shape) {
        String shapeName = shape.getClass().getSimpleName();
        String colorName = this.getClass().getSimpleName();
        System.out.println(colorName+" of "+shapeName);
    }
}
