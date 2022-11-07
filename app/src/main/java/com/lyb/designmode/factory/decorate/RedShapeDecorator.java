package com.lyb.designmode.factory.decorate;

import com.lyb.designmode.factory.simple_factory_pattern.Shape;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("shape: Border Color: Red");
    }
}
