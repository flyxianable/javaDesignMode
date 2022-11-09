package com.lyb.designmode.factory.abstract_factory;

import com.lyb.designmode.factory.simple_factory.CircleShap;
import com.lyb.designmode.factory.simple_factory.RectShap;
import com.lyb.designmode.factory.simple_factory.IShape;
import com.lyb.designmode.factory.simple_factory.TriangleShap;

public class FlatColorfulShape implements IFactory {
    @Override
    public IShape buildShape(String type){
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

    @Override
    public IColor buildColor(String strColor) {
        IColor color = null;
        switch (strColor){
            case "red":
                color = new Red();
                break;
            case "blue":
                color = new Blue();
                break;
        }
        return color;
    }


}
