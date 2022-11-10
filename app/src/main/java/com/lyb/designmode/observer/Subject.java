package com.lyb.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察目标
 */
public class Subject {

    private int state;

    /**
     * 观察者集合
     */
    private List<Observer> observerList = new ArrayList<>();

    public int getState() {
        return state;
    }

    /**
     *
     * 更新状态时，通知所有的观察者
     *
     * @param state
     */

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 关联新的观察者
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyAllObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }


}
