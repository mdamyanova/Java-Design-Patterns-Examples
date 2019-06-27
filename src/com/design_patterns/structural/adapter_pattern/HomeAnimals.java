package com.design_patterns.structural.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class HomeAnimals {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void produceSounds() {
        for (Animal animal : animals) {
            animal.produceSound();
        }
    }
}