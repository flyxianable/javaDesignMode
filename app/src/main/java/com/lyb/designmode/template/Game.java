package com.lyb.designmode.template;

/**
 * 创建一个抽象类，它的模板方法被设置为 final。
 */
public abstract class Game {

    abstract void init();

    abstract void startPlay();

    abstract void endPlay();

    /**
     * 通用的计时器方法
     */
    void timer(){
        System.out.println("timer in game");
    }

    /**
     * 模板
     */
    public final void play(){

        init();

        startPlay();

        timer();

        endPlay();
    }
}
