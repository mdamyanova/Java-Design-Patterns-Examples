package com.design_patterns.structural.bridge_pattern;

public abstract class Animal {
    private Salam salam;

    public Animal(Salam salam) {
        this.salam = salam;
    }

    public abstract void feed();

    public Salam getSalam() {
        return salam;
    }
}