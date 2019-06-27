package com.design_patterns.structural.bridge_pattern;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Cat(new Hamburkski());
        animal.feed();
        Animal animal2 = new Dog(new Kamchiya());
        animal2.feed();
    }
}