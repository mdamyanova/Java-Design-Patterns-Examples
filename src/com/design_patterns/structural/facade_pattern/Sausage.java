package com.design_patterns.structural.facade_pattern;

public class Sausage implements SupermarketProduct {
    @Override
    public void product() {
        System.out.println("Veal sausages");
    }

    @Override
    public void price() {
        System.out.println("5.60");
    }
}