package com.design_patterns.behavioral.observer_pattern;

public class PrivilegedBuyer implements Observer {
    private Observable product;

    public PrivilegedBuyer(Observable product) {
        this.product = product;
        this.product.register(this);
    }

    @Override
    public void update(double price) {
        System.out.println("New Price received in PrivilegedBuyer = " + price);
    }
}