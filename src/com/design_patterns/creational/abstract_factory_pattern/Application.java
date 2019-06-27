package com.design_patterns.creational.abstract_factory_pattern;

public class Application {
    public static void main(String[] args) {
        // Create MammalFactory and Cat
        AbstractFactory mammalFactory = FactoryProvider.getFactory(FactoryType.MAMMAL_FACTORY);
        if (mammalFactory == null) {
            System.out.println("Factory doesn't exists.");
            System.exit(1);
        }

        Animal cat = mammalFactory.create(AnimalType.CAT);
        if (cat != null) {
            cat.produceSound();
        } else {
            System.out.println("Animal doesn't exists.");
        }

        // Create BirdFactory and Parrot
        AbstractFactory birdFactory = FactoryProvider.getFactory(FactoryType.BIRD_FACTORY);

        if (birdFactory == null) {
            System.out.println("Factory doesn't exists.");
            System.exit(1);
        }

        Animal parrot = birdFactory.create(AnimalType.PARROT);
        if (parrot != null) {
            parrot.produceSound();
        } else {
            System.out.println("Animal doesn't exists.");
        }
    }
}