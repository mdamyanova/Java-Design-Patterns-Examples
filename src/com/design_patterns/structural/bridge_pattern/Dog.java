package com.design_patterns.structural.bridge_pattern;

public class Dog extends Animal {
    public Dog(Salam salam) {
        super(salam);
    }
    @Override
    public void feed() {
        System.out.println("Dog is eating...");
        this.getSalam().putInPan();
    }
}
