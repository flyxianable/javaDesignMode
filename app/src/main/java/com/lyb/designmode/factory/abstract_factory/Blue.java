package com.lyb.designmode.factory.abstract_factory;

public class Blue implements IColor {
    public Blue() {
        System.out.println("abstract color : create a blue");
    }

    @Override
    public void fill(String color) {
        System.out.println("abstract color : fill a blue");
    }
}
