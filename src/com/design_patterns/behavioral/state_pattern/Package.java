package com.design_patterns.behavioral.state_pattern;

public class Package {

    private PackageState state = new OrderedState();

    public PackageState getState() {
        return this.state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}