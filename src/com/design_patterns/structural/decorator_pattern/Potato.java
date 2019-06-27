package com.design_patterns.structural.decorator_pattern;

public class Potato extends FoodDecorator {
    public Potato(Food food) {
        super(food);
    }

    public String prepareFood() {
        return super.prepareFood() + " with potatoes.";
    }
}