package com.design_patterns.structural.composite_pattern;

public class Application {
    public static void main(String[] args) {
        FarmHouse chickenCoop = new ChickenCoop();
        FarmHouse cowHouse = new CowHouse();
        Farm farm = new Farm();

        farm.addFarmHouse(chickenCoop);
        farm.addFarmHouse(cowHouse);

        farm.printName();
    }
}