package com.lyb.designmode.single_instance;

/**
 * 双重校验安全的懒汉模式
 */
public class SingleSafeLazyInstance {

    /**
     * volatile防止指令重排
     */
    private volatile static SingleSafeLazyInstance instance;

    private SingleSafeLazyInstance(){

    }

    public static SingleSafeLazyInstance getInstance(){
        if(instance == null){
            synchronized (SingleSafeLazyInstance.class){
                if(instance == null){
                    //防止这句代码在jvm执行指令时被重排
                    //参考https://juejin.cn/post/6844903772892692487
                    instance = new SingleSafeLazyInstance();
                }
            }
        }
        return instance;
    }

}
