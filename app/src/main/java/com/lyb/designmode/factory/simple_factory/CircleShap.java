package com.lyb.designmode.factory.simple_factory;

public class CircleShap implements IShape {

    public CircleShap() {
        System.out.println("shape: create a circle class");
    }

    @Override
    public void draw() {
        System.out.println("shape : draw a circle");
    }
}
