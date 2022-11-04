package com.lyb.designmode.factory.simple;

public class RoundShapeFactory extends AbstractShapeFactory{

    @Override
    public Shape[] build() {
        return new Shape[]{new CircleShap(), new Oval()};
    }
}
