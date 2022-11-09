package com.lyb.designmode.facade;

/**
 * 泡茶子系统
 */
public class SteepTea implements ITeaSystem {

    @Override
    public void make() {
        System.out.println("make steeping Tea");
    }
}
