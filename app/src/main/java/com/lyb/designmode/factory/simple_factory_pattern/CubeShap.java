package com.lyb.designmode.factory.simple_factory_pattern;

/**
 * 立体图形 - 正方体
 */
public class CubeShap implements Shape{
    public CubeShap() {
        System.out.println("shape : create a cube");
    }

    @Override
    public void draw() {
        System.out.println("shape : draw a cube");
    }
}
