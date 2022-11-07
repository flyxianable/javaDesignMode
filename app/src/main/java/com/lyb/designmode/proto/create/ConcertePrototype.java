package com.lyb.designmode.proto.create;

public class ConcertePrototype implements ProtoType{
    @Override
    public Object clone() {
        return new ConcertePrototype();
    }
}
