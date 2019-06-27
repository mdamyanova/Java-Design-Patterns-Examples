package com.design_patterns.structural.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Farm implements FarmHouse {
    private List<FarmHouse> farmHouses;

    public Farm() {
        this.farmHouses = new ArrayList<>();
    }
    @Override
    public void printName() {
        this.farmHouses.forEach(FarmHouse::printName);
    }

    public void addFarmHouse(FarmHouse farmHouse) {
        this.farmHouses.add(farmHouse);
    }

    public void removeFarmHouse(FarmHouse farmHouse) {
        this.farmHouses.remove(farmHouse);
    }
}