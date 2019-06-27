package com.design_patterns.creational.builder_pattern;

public class Application {
    public static void main(String[] args) {
        AnimalBuilder animalBuilder = new AnimalBuilder();
        AnimalType animalType = animalBuilder.buildCat();
        animalType.produceSounds();

        AnimalType animalType2 = animalBuilder.buildParrot();
        animalType2.produceSounds();
    }
}