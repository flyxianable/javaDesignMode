package com.lyb.designmode.factory.abstract_factory;

import com.lyb.designmode.factory.simple_factory.CubeShap;
import com.lyb.designmode.factory.simple_factory.CylinderShape;
import com.lyb.designmode.factory.simple_factory.IShape;
import com.lyb.designmode.factory.simple_factory.SphereShape;

public class ThredDimenColorfulShape implements IFactory {
    @Override
    public IShape buildShape(String type){
        IShape shape = null;
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
