package com.design_patterns.creational.factory_pattern;

public class Cat implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Meow meow!");
    }
}