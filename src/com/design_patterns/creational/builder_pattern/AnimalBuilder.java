package com.design_patterns.creational.builder_pattern;

public class AnimalBuilder {
    public AnimalType buildCat() {
        AnimalType animalType = new AnimalType();
        animalType.addAnimal(new Cat());
        return animalType;
    }

    public AnimalType buildParrot() {
        AnimalType animalType = new AnimalType();
        animalType.addAnimal(new Parrot());
        return animalType;
    }
}