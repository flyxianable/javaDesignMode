package com.lyb.designmode.command.audio_player;

import com.lyb.designmode.command.Command;

public class AudioCommandClient {

    public void treate(){

        AudioPlayerReceiver audioPlayer = new AudioPlayerReceiver();

        Command playCommand = new PlayCommand(audioPlayer);

        Command stopCommand = new StopCommand(audioPlayer);

        Command rewindCommand = new RewindCommand(audioPlayer);

        InvokerKeyPad invoker = new InvokerKeyPad();

        invoker.setPlayCommand(playCommand);

        invoker.setRewindCommand(rewindCommand);

        invoker.setStopCommand(stopCommand);

        invoker.play();
        invoker.rewind();
        invoker.stop();
    }

}
