package com.design_patterns.behavioral.command_pattern;

public class AirconditionReceiver implements HomeElectronics {
    @Override
    public void on() {
        System.out.println("Air condition is on!");
    }

    @Override
    public void off() {
        System.out.println("Air condition is off!");
    }
}