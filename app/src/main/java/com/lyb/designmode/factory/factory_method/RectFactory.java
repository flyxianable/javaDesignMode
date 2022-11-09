package com.lyb.designmode.factory.factory_method;

import com.lyb.designmode.factory.simple_factory.RectShap;
import com.lyb.designmode.factory.simple_factory.IShape;

public class RectFactory extends Factory{
    @Override
    public IShape buidShape() {
        return new RectShap();
    }
}
