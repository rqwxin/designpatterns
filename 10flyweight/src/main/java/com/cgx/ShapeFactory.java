package com.cgx;

import java.util.concurrent.ConcurrentHashMap;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 17:58
 **/
public class ShapeFactory {

    private static   ConcurrentHashMap<String, Shape> shapePool = new ConcurrentHashMap<String, Shape>();

    public static Shape getShape(String color){
        Circle circle = (Circle) shapePool.get(color);
        if (circle == null){
            System.out.println("创建新对象 : " + color);
            circle = new Circle(color);
            shapePool.put(color,circle);
        }else {
        System.out.println("内存对象："+circle.toString());
        }
        return circle;
    }

}
