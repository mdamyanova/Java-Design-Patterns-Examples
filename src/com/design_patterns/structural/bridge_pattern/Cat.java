package com.design_patterns.structural.bridge_pattern;

public class Cat extends Animal {
    public Cat(Salam salam) {
        super(salam);
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating...");
        this.getSalam().putInPan();
    }
}