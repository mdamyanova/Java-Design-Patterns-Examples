package com.design_patterns.behavioral.mediator_pattern;

public interface IChatRoom {
    void sendMessage(String message, String userId);
    void addUser(User user);
}