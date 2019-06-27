package com.design_patterns.creational.singleton_pattern;

public class LazySingleton {
    private static LazySingleton object;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (object == null) {
            synchronized (LazySingleton.class) {
                if (object == null) {
                    // Instance will be created at request time
                    object = new LazySingleton();
                }
            }
        }

        return object;
    }

    public void getMessage() {
        System.out.println("I'm a lazy singleton!");
    }
}