package com.design_patterns.behavioral.observer_pattern;

public interface Observable {
    public abstract void register(Observer o);

    public abstract void remove(Observer o);

    public abstract void notifyObservers();

}