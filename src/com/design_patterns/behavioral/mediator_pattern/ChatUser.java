package com.design_patterns.behavioral.mediator_pattern;

public class ChatUser  extends User {

    public ChatUser(IChatRoom room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String message, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + message);
        this.getMediator().sendMessage(message, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }

}