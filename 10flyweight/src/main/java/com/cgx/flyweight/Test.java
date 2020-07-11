package com.cgx.flyweight;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 18:04
 **/
public class Test {

    static   String[] colors = {"red","blue","light","black","while"};
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //根据颜色(内部形态)对对象
            Circle shape = (Circle) ShapeFactory.getShape(getColor());
            //设置外部形态(x,y,rabid)
            shape.setRadius(11);
            shape.setX(getCircleX());
            shape.setY(getCircleY());
            shape.draw();
        }
    }

    public static double getCircleX(){
        return Math.random()*100;
    }

    public static double getCircleY(){
        return Math.random()*100;
    }

    public static String  getColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
}
