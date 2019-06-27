package com.design_patterns.structural.decorator_pattern;

public class Pork implements Food {
    @Override
    public String prepareFood() {
        return "Cooking pork";
    }
}