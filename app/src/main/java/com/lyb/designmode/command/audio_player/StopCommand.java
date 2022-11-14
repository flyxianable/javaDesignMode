package com.lyb.designmode.command.audio_player;

import com.lyb.designmode.command.Command;

public class StopCommand implements Command {

    AudioPlayerReceiver audioPlayer;

    public StopCommand(AudioPlayerReceiver audioPlayerReceiver) {
        audioPlayer = audioPlayerReceiver;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
