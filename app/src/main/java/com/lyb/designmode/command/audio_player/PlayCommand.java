package com.lyb.designmode.command.audio_player;

import com.lyb.designmode.command.Command;

/**
 * 具体命令角色
 */
public class PlayCommand implements Command {

    AudioPlayerReceiver audioPlayer;

    public PlayCommand(AudioPlayerReceiver audioPlayerReceiver) {
        audioPlayer = audioPlayerReceiver;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
