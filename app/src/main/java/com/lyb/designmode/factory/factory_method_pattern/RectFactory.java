package com.lyb.designmode.factory.factory_method_pattern;

import com.lyb.designmode.factory.simple_factory_pattern.RectShap;
import com.lyb.designmode.factory.simple_factory_pattern.Shape;

public class RectFactory extends Factory{
    @Override
    public Shape buidShape() {
        return new RectShap();
    }
}
