package com.lyb.designmode.mediator;

public class User {

    public User(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    private String name;

    public void sendMessage(String message){

        ChatRoom.showMessage(this, message);
    }

}
