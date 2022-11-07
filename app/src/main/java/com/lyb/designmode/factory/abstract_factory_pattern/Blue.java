package com.lyb.designmode.factory.abstract_factory_pattern;

public class Blue implements Color{
    public Blue() {
        System.out.println("abstract color : create a blue");
    }

    @Override
    public void fill(String color) {
        System.out.println("abstract color : fill a blue");
    }
}
