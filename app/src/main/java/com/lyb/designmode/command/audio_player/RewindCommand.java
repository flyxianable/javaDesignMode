package com.lyb.designmode.command.audio_player;

import com.lyb.designmode.command.Command;

public class RewindCommand implements Command {

    AudioPlayerReceiver audioPlayer;

    public RewindCommand(AudioPlayerReceiver audioPlayerReceiver) {
        audioPlayer = audioPlayerReceiver;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
