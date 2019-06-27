package com.design_patterns.creational.prototype_pattern;

public class Cat implements Prototype {
    private int id;
    private String name;

    public Cat(){
        System.out.println("Cat created!");
    }

    public Cat(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public void produceSound() {
        System.out.println("Meow meow!");
    }

    @Override
    public Prototype getClone() {
        return new Cat(id, name);
    }
}