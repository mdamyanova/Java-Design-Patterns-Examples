package com.design_patterns.behavioral.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.notifyObservers();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        if (!this.observers.isEmpty()) {
            this.observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this.price);
        }
    }
}