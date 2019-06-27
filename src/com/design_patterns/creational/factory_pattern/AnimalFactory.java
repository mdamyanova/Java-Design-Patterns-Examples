package com.design_patterns.creational.factory_pattern;

public abstract class AnimalFactory {
    public static Animal getAnimal(AnimalType name) {
        Animal animal = null;

        switch (name) {
            case DOG:
                animal = new Dog();
                break;
            case CAT:
                animal = new Cat();
                break;
        }

        return animal;
    }
}