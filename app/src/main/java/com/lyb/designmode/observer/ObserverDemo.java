package com.lyb.designmode.observer;

public class ObserverDemo {

    public void treate(){

        Subject subject = new Subject();

        DataObserver dataObserver = new DataObserver(subject);

        subject.setState(15);
    }
}
