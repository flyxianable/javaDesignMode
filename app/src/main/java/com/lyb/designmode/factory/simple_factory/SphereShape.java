package com.lyb.designmode.factory.simple_factory;

/**
 * 立方体-球体
 */
public class SphereShape implements IShape {
    public SphereShape() {
        System.out.println("shap: create a sphere");
    }

    @Override
    public void draw() {
        System.out.println("shap: draw a sphere");
    }
}
