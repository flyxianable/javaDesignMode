package com.lyb.designmode.factory.simple_factory_pattern;

/**
 * 简单工厂模式
 */
public class SimpleShapeFactory {

    public static Shape buildShape(String type){
        Shape shape = null;
        switch (type){
            case "circle":
                shape = new CircleShap();
                break;
            case "rect":
                shape = new RectShap();
                break;
            case "triangle":
                shape = new TriangleShap();
                break;
        }
        return shape;
    }
}
