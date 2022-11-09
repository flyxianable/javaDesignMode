package com.lyb.designmode.facade;

/**
 * 茶叶子系统
 */
public class TeaLeaf implements ITeaSystem{
    @Override
    public void make() {
        System.out.println("make tea leaf");
    }
}
