package com.design_patterns.creational.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class AnimalType {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void produceSounds() {
        for (Animal animal : animals) {
            animal.produceSound();
        }
    }
}