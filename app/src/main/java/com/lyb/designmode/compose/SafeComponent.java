package com.lyb.designmode.compose;

public abstract class SafeComponent {

    private String name;

    public SafeComponent(String name) {
        this.name = name;
    }

    public abstract void print();

//    public abstract void addChild(SafeComponent component);
//
//    public abstract void removeChild(SafeComponent component);
//
//    public abstract SafeComponent getChild(int index);
}
