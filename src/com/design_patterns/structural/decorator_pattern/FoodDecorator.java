package com.design_patterns.structural.decorator_pattern;

public abstract class FoodDecorator implements Food {
    private Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String prepareFood() {
        return this.food.prepareFood();
    }
}