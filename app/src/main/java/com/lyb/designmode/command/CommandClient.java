package com.lyb.designmode.command;

public class CommandClient {

    public void treate(){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();;
    }
}
