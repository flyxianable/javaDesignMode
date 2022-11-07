package com.lyb.designmode.proto.clone;

import androidx.annotation.NonNull;

public abstract class ProtoType implements Cloneable{

    @NonNull
    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
