package com.lyb.designmode.state_pattern;

public class StatePatternDemo {

    public void treate(){

        Context context = new Context();

        new StartState().doAction(context);

        System.out.println("context state is ~ " + context.getState().toString());

        new StopState().doAction(context);

        System.out.println("context state is ~ " + context.getState().toString());
    }
}
