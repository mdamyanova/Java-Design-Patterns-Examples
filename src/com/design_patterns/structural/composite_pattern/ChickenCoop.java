package com.design_patterns.structural.composite_pattern;

public class ChickenCoop implements FarmHouse {
    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName());
    }
}