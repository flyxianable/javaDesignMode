package com.lyb.designmode.state_pattern;

public class StopState implements State {

    @Override
    public void doAction(Context context) {

        context.setState(this);

        System.out.println("is stop state");
    }
}
