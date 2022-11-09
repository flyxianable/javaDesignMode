package com.lyb.designmode.factory.simple_factory;

public class RectShap implements IShape {

    public RectShap() {
        System.out.println("shape: create a Rect  class");
    }

    @Override
    public void draw() {
        System.out.println("shape: draw a rect");
    }
}
