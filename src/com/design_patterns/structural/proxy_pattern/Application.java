package com.design_patterns.structural.proxy_pattern;

public class Application {
    public static void main(String[] args) {
        HomeInternetAccess access = new ProxyInternetAccess("Mariyka");
        access.grantInternetAccess();
        access = new ProxyInternetAccess("Ivancho");
        access.grantInternetAccess();
        access = new ProxyInternetAccess("Pesho");
        access.grantInternetAccess();
    }
}