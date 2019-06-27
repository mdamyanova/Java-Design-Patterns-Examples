package com.design_patterns.creational.abstract_factory_pattern;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (factoryType == FactoryType.MAMMAL_FACTORY) {
            return new MammalFactory();
        } else if (factoryType == FactoryType.BIRD_FACTORY) {
            return new BirdFactory();
        }

        return null;
    }
}