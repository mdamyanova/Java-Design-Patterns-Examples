package com.design_patterns.structural.proxy_pattern;

public class FamilyInternetAccess implements HomeInternetAccess {
    private String name;

    public FamilyInternetAccess(String name) {
        this.name = name;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet access granted for: " + name);
    }
}