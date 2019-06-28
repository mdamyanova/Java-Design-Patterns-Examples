package com.design_patterns.j2ee.service_locator_pattern;

public class Application {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("CatService");
        service.execute();
        service = ServiceLocator.getService("DogService");
        service.execute();
    }
}