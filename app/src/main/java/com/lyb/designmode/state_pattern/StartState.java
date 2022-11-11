package com.lyb.designmode.state_pattern;

public class StartState implements State {

    /**
     * 行为时，改变上下文的状态
     * @param context
     */
    @Override
    public void doAction(Context context) {

        context.setState(this);

        System.out.println("is start state");
    }
}
