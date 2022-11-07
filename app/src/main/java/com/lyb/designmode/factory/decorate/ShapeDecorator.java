package com.lyb.designmode.factory.decorate;

import com.lyb.designmode.factory.simple_factory_pattern.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape decorateShape;

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }



    public void draw() {
        decorateShape.draw();
    }


}
