package com.design_patterns.creational.singleton_pattern;

public class EarlySingleton {
    // Instance will be created at load time
    private static EarlySingleton object = new EarlySingleton();

    private EarlySingleton() {}

    public static EarlySingleton getInstance() {
        return object;
    }

    public void getMessage(){
        System.out.println("I'm an early singleton!");
    }
}