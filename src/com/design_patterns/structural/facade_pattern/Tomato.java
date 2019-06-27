package com.design_patterns.structural.facade_pattern;

public class Tomato implements SupermarketProduct {
    @Override
    public void product() {
        System.out.println("Early tomatoes.");
    }

    @Override
    public void price() {
        System.out.println("2.10");
    }
}