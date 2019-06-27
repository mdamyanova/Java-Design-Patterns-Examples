package com.design_patterns.behavioral.observer_pattern;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        RegularBuyer regularBuyer = new RegularBuyer(product);
        PrivilegedBuyer privilegedBuyer = new PrivilegedBuyer(product);

        product.setPrice(10000);
        regularBuyer.unSubscribe();
        product.setPrice(15000);
    }
}