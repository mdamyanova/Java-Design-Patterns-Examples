package com.design_patterns.behavioral.visitor_pattern;

public interface ShoppingCartVisitor {
    int visit(Book book);
}