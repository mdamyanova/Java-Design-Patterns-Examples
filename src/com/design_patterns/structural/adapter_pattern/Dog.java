package com.design_patterns.structural.adapter_pattern;

public class Dog extends Animal {
    @Override
    public void produceSound() {
        System.out.println("Waf waf!");
    }
}