package com.lyb.designmode.decorate;

import com.lyb.designmode.factory.simple_factory.CircleShap;
import com.lyb.designmode.factory.simple_factory.RectShap;

public class DecorateDemo {

    public void create(){

        ShapeDecorator redCircle = new RedShapeDecorator(new CircleShap());
        redCircle.draw();
        ShapeDecorator redRect = new RedShapeDecorator(new RectShap());
        redRect.draw();
    }

}
