package com.design_patterns.creational.abstract_factory_pattern;

public class MammalFactory extends AbstractFactory {
    @Override
    Animal create(AnimalType animalType) {
        if (animalType == AnimalType.DOG) {
            return new Dog();
        } else if (animalType == AnimalType.CAT) {
            return new Cat();
        }

        return null;
    }
}