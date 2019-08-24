package model4_prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeCache {
    private static Map<Integer,Shape> shapeCache = new HashMap<>(5);
    static {
        Circle circle = new Circle();
        shapeCache.put(1,circle);
        Rectangle rectangle = new Rectangle();
        shapeCache.put(2,rectangle);
        Square square = new Square();
        shapeCache.put(3,square);
    }
    public static Shape getShapeByType(Integer type) throws CloneNotSupportedException {
        if(Objects.nonNull(type)){
            Shape shape = shapeCache.get(type);
            return (Shape)shape.clone();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Shape shapeByType = getShapeByType(ShapeType.Circle.type);
        System.out.println(shapeByType.getType());
        Shape shapeByType2 = getShapeByType(ShapeType.Rectangle.type);
        System.out.println(shapeByType2.getType());
        Shape shapeByType3 = getShapeByType(ShapeType.Square.type);
        System.out.println(shapeByType3.getType());
    }

    enum ShapeType{
        Circle("圆形",1),
        Rectangle("长方形",2),
        Square("正方形",3);
        private String name;
        private int type;
        ShapeType(String name,int type){
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public int getType() {
            return type;
        }
    }
}
