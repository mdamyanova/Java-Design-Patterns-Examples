package com.design_patterns.creational.factory_pattern;

public class Application {
    public static void main(String[] args) {
        // request for animal
        Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);

        if (cat != null) {
            cat.produceSound();
        } else {
            System.out.println("This animal cannot produce sound.");
        }

        // request for non existent animal
        Animal bird = AnimalFactory.getAnimal(AnimalType.BIRD);

        if (bird != null) {
            bird.produceSound();
        } else {
            System.out.println("This animal cannot produce sound.");
        }
    }
}