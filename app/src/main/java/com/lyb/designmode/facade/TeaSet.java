package com.lyb.designmode.facade;

/**
 * 茶具子系统
 */
public class TeaSet implements ITeaSystem{
    @Override
    public void make() {
        System.out.println("make tea set");
    }
}
