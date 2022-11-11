package com.lyb.designmode.template;

public class BasketballGame extends Game{

    @Override
    void init() {
        System.out.println("init BasketballGame");
    }

    @Override
    void startPlay() {
        System.out.println("startPlay BasketballGame");
    }

    @Override
    void endPlay() {
        System.out.println("endPlay BasketballGame");
    }


}
