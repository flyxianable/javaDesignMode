package com.lyb.designmode.instance;

/**
 * 双重校验安全的懒汉模式
 */
public class SingleSafeLazyInstance {

    private volatile static SingleSafeLazyInstance instance;

    private SingleSafeLazyInstance(){

    }

    public static SingleSafeLazyInstance getInstance(){
        if(instance == null){
            synchronized (SingleSafeLazyInstance.class){
                if(instance == null){
                    instance = new SingleSafeLazyInstance();
                }
            }
        }
        return instance;
    }

}
