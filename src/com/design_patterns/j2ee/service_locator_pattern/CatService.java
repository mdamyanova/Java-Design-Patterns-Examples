package com.design_patterns.j2ee.service_locator_pattern;

public class CatService implements Service {
    @Override
    public String getName() {
        return "CatService";
    }

    @Override
    public void execute() {
        System.out.println("Executing Cat Service");
    }
}