package com.lyb.designmode.proto.clone;

import androidx.annotation.NonNull;

public class ConcretePrototype extends ProtoType{

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (ConcretePrototype)super.clone();
    }
}
