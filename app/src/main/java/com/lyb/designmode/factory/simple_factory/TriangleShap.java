package com.lyb.designmode.factory.simple_factory;

public class TriangleShap implements IShape {

    public TriangleShap() {
        System.out.println("create a triangle class");
    }

    @Override
    public void draw() {
        System.out.println("draw a triangle");
    }
}
