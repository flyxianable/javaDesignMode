package com.lyb.designmode.single_instance;

/**
 * 饿汉模式
 */
public class SingleHungryInstance {

    private static SingleHungryInstance instance = new SingleHungryInstance();

    private SingleHungryInstance(){

    }

    public static SingleHungryInstance getInstance(){
        return  instance;
    }

}

