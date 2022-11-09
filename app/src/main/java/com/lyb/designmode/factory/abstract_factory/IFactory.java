package com.lyb.designmode.factory.abstract_factory;

import com.lyb.designmode.factory.simple_factory.IShape;

public interface IFactory {
    IShape buildShape(String shape);
    IColor buildColor(String color);
}
