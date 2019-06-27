package com.design_patterns.behavioral.command_pattern;

public class OvenReceiver implements HomeElectronics {
    @Override
    public void on() {
        System.out.println("Oven is on!");
    }

    @Override
    public void off() {
        System.out.println("Oven is off!");
    }
}
