package com.lyb.designmode.single_instance.java;

/**
 * 不是线程安全的懒汉模式
 */
public class SingleLazyInstance {

    private static SingleLazyInstance instance;

    private SingleLazyInstance(){

    }

    public static SingleLazyInstance getInstance(){
        if(instance == null){
            //测试多线程时加的测试语句，用于模拟创建时有其他延时任务
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            instance = new SingleLazyInstance();
        }
        return instance;
    }

}
