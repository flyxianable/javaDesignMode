package com.lyb.designmode.command;

public class ConcreteCommand implements Command{

    //持有相应的接收者对象
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        //通常会转调接收者的方法，让接收者来真正执行功能
        receiver.action();
    }
}
