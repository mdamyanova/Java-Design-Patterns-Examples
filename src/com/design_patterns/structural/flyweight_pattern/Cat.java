package com.design_patterns.structural.flyweight_pattern;

public class Cat implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Meow Meow!");
    }
}