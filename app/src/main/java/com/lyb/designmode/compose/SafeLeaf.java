package com.lyb.designmode.compose;

/**
 * 叶子
 * 没有子结点，所以不支持对子结点增、删、查方法
 */
public class SafeLeaf extends SafeComponent{

    public SafeLeaf(String name) {
        super(name);
    }

    @Override
    public void print() {

    }
}
