package com.design_patterns.creational.builder_pattern;

public class Dog extends Mammal {
    @Override
    public void produceSound() {
        System.out.println("Waf waf!");
    }
}