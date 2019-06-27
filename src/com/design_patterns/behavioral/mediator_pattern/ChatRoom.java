package com.design_patterns.behavioral.mediator_pattern;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void sendMessage(String message, String userId) {
        User user = this.users.get(userId);
    }

    @Override
    public void addUser(User user) {
        this.users.put(user.getId(), user);
    }
}