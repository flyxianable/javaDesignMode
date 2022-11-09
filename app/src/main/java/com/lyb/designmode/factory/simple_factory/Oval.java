package com.lyb.designmode.factory.simple_factory;

public class Oval implements IShape {
    @Override
    public void draw() {
        System.out.println("shape: draw a oval");
    }
}
