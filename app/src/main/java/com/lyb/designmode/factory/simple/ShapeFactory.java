package com.lyb.designmode.factory.simple;

/**
 * 简单工厂模式
 */
public class ShapeFactory {
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
