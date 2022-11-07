package com.lyb.designmode.factory.simple_factory_pattern;

public class RectShap implements Shape {

    public RectShap() {
        System.out.println("shape: create a Rect  class");
    }

    @Override
    public void draw() {
        System.out.println("shape: draw a rect");
    }
}
