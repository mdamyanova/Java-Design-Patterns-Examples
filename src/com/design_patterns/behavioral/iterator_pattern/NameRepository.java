package com.design_patterns.behavioral.iterator_pattern;

public class NameRepository implements Container {
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}