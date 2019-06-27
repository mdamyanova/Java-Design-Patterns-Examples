package com.design_patterns.structural.flyweight_pattern;

public class Dog implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Waf waf!");
    }
}