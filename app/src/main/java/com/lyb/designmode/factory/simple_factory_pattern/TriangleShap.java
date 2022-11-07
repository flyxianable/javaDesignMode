package com.lyb.designmode.factory.simple_factory_pattern;

public class TriangleShap implements Shape{

    public TriangleShap() {
        System.out.println("create a triangle class");
    }

    @Override
    public void draw() {
        System.out.println("draw a triangle");
    }
}
