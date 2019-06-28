package com.design_patterns.j2ee.service_locator_pattern;

public class Context {
    public Object lookup(String name) {
        if (name.equalsIgnoreCase("DogService")) {
            System.out.println("Looking up and creating a new DogService object");
            return new DogService();
        } else if (name.equalsIgnoreCase("CatService")) {
            System.out.println("Looking up and creating a new CatService object");
            return new CatService();
        }

        return null;
    }
}