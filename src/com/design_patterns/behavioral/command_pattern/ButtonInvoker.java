package com.design_patterns.behavioral.command_pattern;

public class ButtonInvoker {
    private Command command;

    public ButtonInvoker(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
}