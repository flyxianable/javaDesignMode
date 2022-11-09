package com.lyb.designmode.factory.simple_factory;

/**
 * 简单工厂模式
 */
public class SimpleShapeFactory {

    public static IShape buildShape(String type){
        IShape shape = null;
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
