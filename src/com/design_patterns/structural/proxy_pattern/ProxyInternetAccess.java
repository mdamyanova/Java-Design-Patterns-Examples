package com.design_patterns.structural.proxy_pattern;

public class ProxyInternetAccess implements HomeInternetAccess {
    private String name;
    private FamilyInternetAccess homeInternetAccess;

    public ProxyInternetAccess(String name) {
        this.name = name;
    }

    @Override
    public void grantInternetAccess() {
        if (name.equals("Mariyka") || name.equals("Ivancho")) {
            this.homeInternetAccess = new FamilyInternetAccess(name);
            this.homeInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access granted. Smart neighbor.");
        }
    }
}