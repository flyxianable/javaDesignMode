package com.lyb.designmode.factory.factory_method;

import com.lyb.designmode.factory.simple_factory.CircleShap;
import com.lyb.designmode.factory.simple_factory.IShape;

/**
 * 工厂方法模式
 * 这个工厂方法只生产CircleShape
 */
public class CircleFactory extends Factory{
    @Override
    public IShape buidShape() {
        final CircleShap circleShap = new CircleShap();
        return circleShap;
    }
}
