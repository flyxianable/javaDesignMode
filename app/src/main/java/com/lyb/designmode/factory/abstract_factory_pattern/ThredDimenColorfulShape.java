package com.lyb.designmode.factory.abstract_factory_pattern;

import com.lyb.designmode.factory.simple_factory_pattern.CircleShap;
import com.lyb.designmode.factory.simple_factory_pattern.CubeShap;
import com.lyb.designmode.factory.simple_factory_pattern.CylinderShape;
import com.lyb.designmode.factory.simple_factory_pattern.RectShap;
import com.lyb.designmode.factory.simple_factory_pattern.Shape;
import com.lyb.designmode.factory.simple_factory_pattern.SphereShape;
import com.lyb.designmode.factory.simple_factory_pattern.TriangleShap;

public class ThredDimenColorfulShape implements AbstractFactory {
    @Override
    public Shape buildShape(String type){
        Shape shape = null;
        switch (type){
            case "cube":
                shape = new CubeShap();
                break;
            case "cylinder":
                shape = new CylinderShape();
                break;
            case "sphere":
                shape = new SphereShape();
                break;
        }
        return shape;
    }

    @Override
    public Color buildColor(String strColor) {
        Color color = null;
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
