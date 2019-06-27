package com.design_patterns.structural.facade_pattern;

public class CashDesk {
    private SupermarketProduct tomato;
    private SupermarketProduct sausage;

    public CashDesk() {
        this.tomato = new Tomato();
        this.sausage = new Sausage();
    }

    public void tomatoSale() {
        this.tomato.product();
        this.tomato.price();
    }

    public void sausageSale() {
        this.sausage.product();
        this.sausage.price();
    }
}
