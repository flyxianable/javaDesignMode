package com.lyb.designmode.state_pattern;

/**
 * 上下文
 * 用于保存状态
 *
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
