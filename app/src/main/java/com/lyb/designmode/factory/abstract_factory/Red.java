package com.lyb.designmode.factory.abstract_factory;

public class Red implements IColor {
    public Red() {
        System.out.println("color : create a red");
    }

    @Override
    public void fill(String color) {
        System.out.println("color : fill a red");
    }
}
