package com.design_patterns.behavioral.state_pattern;

public class Application {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}