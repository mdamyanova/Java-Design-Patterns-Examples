package com.design_patterns.structural.adapter_pattern;

public class Application {
    public static void main(String[] args) {
        HomeAnimals homeAnimals = new HomeAnimals();
        Cat cat = new Cat();
        Dog dog = new Dog();
        homeAnimals.addAnimal(cat);
        homeAnimals.addAnimal(dog);
        homeAnimals.produceSounds();
    }
}