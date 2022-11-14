package com.lyb.designmode.command.audio_player;

/**
 * 接收者角色
 */
public class AudioPlayerReceiver {

    public void play(){
        System.out.println("audioCommand play...");
    }

    public void rewind(){
        System.out.println("audioCommand rewind...");
    }

    public void stop(){
        System.out.println("audioCommand stop...");
    }

}
