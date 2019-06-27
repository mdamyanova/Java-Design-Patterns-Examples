package com.design_patterns.structural.adapter_pattern;

public class Cat extends Animal {
    @Override
    public void produceSound() {
        System.out.println("Meow Meow!");
    }
}