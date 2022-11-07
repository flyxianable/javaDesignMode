package com.lyb.designmode.factory.abstract_factory_pattern;

public class Red implements Color{
    public Red() {
        System.out.println("color : create a red");
    }

    @Override
    public void fill(String color) {
        System.out.println("color : fill a red");
    }
}
