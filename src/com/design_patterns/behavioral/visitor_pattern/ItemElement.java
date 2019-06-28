package com.design_patterns.behavioral.visitor_pattern;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}