package com.lyb.designmode.decorate;

import com.lyb.designmode.factory.simple_factory.IShape;

/**
 * 具体装饰角色
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(IShape shap) {
        super(shap);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shap);
    }

    private void setRedBorder(IShape decoratedShape){
        System.out.println("shape: Border Color: Red");
    }
}
