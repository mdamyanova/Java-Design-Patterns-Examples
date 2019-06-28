package com.design_patterns.behavioral.state_pattern;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}