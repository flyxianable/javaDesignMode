package com.lyb.designmode.factory.factory_method_pattern;

import com.lyb.designmode.factory.simple_factory_pattern.Shape;

/**
 * 抽象工厂类
 * 生产抽象商品类Shape
 */
public abstract class Factory {
    public abstract Shape buidShape();
}
