package com.lyb.designmode.observer;

/**
 * 具体的观察者
 */
public class DataObserver extends Observer{

    public DataObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("pay attention, data is changed!  state now is : " + subject.getState());
    }
}
