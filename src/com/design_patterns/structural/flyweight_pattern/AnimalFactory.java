package com.design_patterns.structural.flyweight_pattern;

import java.util.HashMap;

public class AnimalFactory {
    private static HashMap<String, Animal> animals = new HashMap<>();

    public static Animal getAnimal(String type) {
        Animal animal = null;

        if (animals.containsKey(type)) {
            animal = animals.get(type);
        } else {
            switch (type) {
                case "Cat":
                    animal = new Cat();
                    System.out.println("Cat created!");
                    break;
                case "Dog":
                    animal = new Dog();
                    System.out.println("Dog created!");
                    break;
                default:
                    System.out.println("No such animal in database!");
                    break;
            }

            animals.put(type, animal);
        }

        return animal;
    }
}