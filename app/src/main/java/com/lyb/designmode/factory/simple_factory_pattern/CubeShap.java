package com.lyb.designmode.factory.simple_factory_pattern;

/**
 * 立体图形 - 正方体
 */
public class CubeShap implements Shape{
    public CubeShap() {
        System.out.println("shap : create a cube");
    }

    @Override
    public void draw() {
        System.out.println("shap : draw a cube");
    }
}
