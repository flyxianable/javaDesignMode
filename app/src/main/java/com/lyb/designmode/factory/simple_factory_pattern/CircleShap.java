package com.lyb.designmode.factory.simple_factory_pattern;

public class CircleShap implements Shape{

    public CircleShap() {
        System.out.println("shap: create a circle class");
    }

    @Override
    public void draw() {
        System.out.println("shap : draw a circle");
    }
}
