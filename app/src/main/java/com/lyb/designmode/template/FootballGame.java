package com.lyb.designmode.template;

public class FootballGame extends Game{

    @Override
    void init() {
        System.out.println("init footballGame");
    }

    @Override
    void startPlay() {
        System.out.println("startPlay footballGame");
    }

    @Override
    void endPlay() {
        System.out.println("endPlay footballGame");
    }

}
