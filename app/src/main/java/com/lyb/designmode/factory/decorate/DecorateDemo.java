package com.lyb.designmode.factory.decorate;

import com.lyb.designmode.factory.simple_factory_pattern.CircleShap;
import com.lyb.designmode.factory.simple_factory_pattern.RectShap;

public class DecorateDemo {

    public void create(){

        ShapeDecorator redCircle = new RedShapeDecorator(new CircleShap());
        ShapeDecorator redRect = new RedShapeDecorator(new RectShap());

        redCircle.draw();
        redRect.draw();
    }

}
