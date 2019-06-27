package com.design_patterns.creational.abstract_factory_pattern;

public class Dog implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Waf waf!");
    }
}