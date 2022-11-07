package com.lyb.designmode.factory.abstract_factory_pattern;

import com.lyb.designmode.factory.simple_factory_pattern.Shape;

public interface AbstractFactory {
    Shape buildShape(String shape);
    Color buildColor(String color);
}
