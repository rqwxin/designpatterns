package com.cgx.prototype.prototypeimpl;

import com.cgx.prototype.absprototype.Shape;

import java.util.concurrent.ConcurrentHashMap;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 15:45
 **/
public class ShapeCache {

    private static ConcurrentHashMap<String,Shape> shapeMap = new ConcurrentHashMap<String, Shape>();

    public static void loadShape(){
      /*  Class<Shape> shapeClass = Shape.class;
        shapeClass.getDeclaredClasses()*/

      Circle circle = new Circle();
      circle.setId("1");
      shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }

    public  static Shape getShape(String id){
        Shape shape = shapeMap.get(id);
        if (shape != null){
            return (Shape) shape.clone();
        }
        return  null;
    }

}
