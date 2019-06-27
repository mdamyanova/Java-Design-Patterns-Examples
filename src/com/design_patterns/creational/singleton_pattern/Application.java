package com.design_patterns.creational.singleton_pattern;

public class Application {
    public static void main(String[] args) {
        EarlySingleton earlySingleton = EarlySingleton.getInstance();
        earlySingleton.getMessage();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.getMessage();
    }
}