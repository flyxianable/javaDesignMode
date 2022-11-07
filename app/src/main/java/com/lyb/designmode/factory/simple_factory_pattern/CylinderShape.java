package com.lyb.designmode.factory.simple_factory_pattern;

/**
 * 立体图形-圆柱体
 */
public class CylinderShape implements Shape{

    public CylinderShape() {
        System.out.println("shape : draw a cylinder");
    }

    @Override
    public void draw() {
        System.out.println("shape : draw a cylinder");
    }
}
