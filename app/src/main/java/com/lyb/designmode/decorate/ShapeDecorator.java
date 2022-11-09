package com.lyb.designmode.decorate;

import com.lyb.designmode.factory.simple_factory.IShape;

/**
 * 抽象装饰角色
 *
 */
public abstract class ShapeDecorator implements IShape {

    protected IShape shap;

    public ShapeDecorator(IShape decorateShape) {
        this.shap = decorateShape;
    }


    @Override
    public void draw() {
        shap.draw();
    }

}
