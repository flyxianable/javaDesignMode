package com.lyb.designmode.observer;

/**
 * 抽象观察者
 */
public abstract class Observer {

    protected Subject subject;

    /**
     *
     */
    public abstract void update();
}
