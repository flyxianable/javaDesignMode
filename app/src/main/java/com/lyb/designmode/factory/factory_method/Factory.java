package com.lyb.designmode.factory.factory_method;

import com.lyb.designmode.factory.simple_factory.IShape;

/**
 * 抽象工厂类
 * 生产抽象商品类Shape
 */
public abstract class Factory {
    public abstract IShape buidShape();
}
