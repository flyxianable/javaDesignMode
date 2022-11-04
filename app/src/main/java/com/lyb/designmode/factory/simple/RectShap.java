package com.lyb.designmode.factory.simple;

public class RectShap implements Shape {

    public RectShap() {
        System.out.println("create a Rect class");
    }

    @Override
    public void draw() {
        System.out.println("draw a rect");
    }
}
