package com.design_patterns.j2ee.service_locator_pattern;

public class DogService implements Service {
    @Override
    public String getName() {
        return "DogService";
    }

    @Override
    public void execute() {
        System.out.println("Executing Dog Service");
    }
}