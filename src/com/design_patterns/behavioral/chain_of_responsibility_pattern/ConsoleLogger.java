package com.design_patterns.behavioral.chain_of_responsibility_pattern;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standart Console::Logger: " + message);
    }
}