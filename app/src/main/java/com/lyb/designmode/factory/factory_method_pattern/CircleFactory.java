package com.lyb.designmode.factory.factory_method_pattern;

import com.lyb.designmode.factory.simple_factory_pattern.CircleShap;
import com.lyb.designmode.factory.simple_factory_pattern.Shape;

/**
 * 工厂方法模式
 * 这个工厂方法只生产CircleShape
 */
public class CircleFactory extends Factory{
    @Override
    public Shape buidShape() {
        final CircleShap circleShap = new CircleShap();
        return circleShap;
    }
}
