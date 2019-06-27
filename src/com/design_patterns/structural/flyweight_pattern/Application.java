package com.design_patterns.structural.flyweight_pattern;

import java.util.Random;

public class Application {
    private static String[] animalTypes = { "Cat", "Dog" };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Animal animal = AnimalFactory.getAnimal(getRandomAnimalType());
            animal.produceSound();
        }
    }

    private static String getRandomAnimalType(){
        Random random = new Random();
        int randInt = random.nextInt(animalTypes.length);
        return animalTypes[randInt];
    }
}