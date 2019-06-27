package com.design_patterns.behavioral.mediator_pattern;

public class Application {
    public static void main(String[] args) {
        IChatRoom chatroom = new ChatRoom();

        User user = new ChatUser(chatroom,"1", "Ivan");
        User user2 = new ChatUser(chatroom,"2", "Mariya");

        chatroom.addUser(user);
        chatroom.addUser(user2);

        user.send("Hello Mariya", "2");
        user2.send("Hey Ivan", "1");
    }
}