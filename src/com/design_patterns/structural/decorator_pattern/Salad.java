package com.design_patterns.structural.decorator_pattern;

import java.io.PrintStream;

public class Salad extends FoodDecorator {
    public Salad(Food food) {
        super(food);
    }

    public String prepareFood() {
        return super.prepareFood() + " with salad.";
    }
}