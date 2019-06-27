package com.design_patterns.behavioral.iterator_pattern;

public class NameIterator implements Iterator {
    private int index;

    public String[] names = { "Ivan", "Petar", "Mariya" };

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}