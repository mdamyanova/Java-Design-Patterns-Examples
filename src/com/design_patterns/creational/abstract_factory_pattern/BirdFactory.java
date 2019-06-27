package com.design_patterns.creational.abstract_factory_pattern;

public class BirdFactory extends AbstractFactory {
    @Override
    Animal create(AnimalType animalType) {
        if (animalType == AnimalType.PARROT) {
            return new Parrot();
        }

        return null;
    }
}
