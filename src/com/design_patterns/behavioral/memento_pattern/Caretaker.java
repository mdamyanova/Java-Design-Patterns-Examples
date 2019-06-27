package com.design_patterns.behavioral.memento_pattern;

import java.util.ArrayList;

class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        this.mementos.add(m);
    }

    public Memento getMemento() {
        return this.mementos.get(1);
    }
}