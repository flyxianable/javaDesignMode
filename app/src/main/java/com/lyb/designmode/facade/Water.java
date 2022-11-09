package com.lyb.designmode.facade;

/**
 * 开水子系统
 */
public class Water implements ITeaSystem{
    @Override
    public void make() {
        System.out.println("make boiling water");
    }
}
