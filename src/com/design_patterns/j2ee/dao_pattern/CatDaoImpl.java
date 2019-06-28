package com.design_patterns.j2ee.dao_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatDaoImpl implements CatDao {
    // Instead of database
    private List<Cat> cats;

    public CatDaoImpl() {
        this.cats = new ArrayList<>();
        Cat cat = new Cat("Kitty", 1);
        Cat cat2 = new Cat("Mishy", 2);
        this.cats.add(cat);
        this.cats.add(cat2);
    }

    @Override
    public List<Cat> getAllCats() {
        return Collections.unmodifiableList(this.cats);
    }

    @Override
    public Cat getCat(int id) {
        return this.cats.get(id);
    }

    @Override
    public void updateCat(Cat cat) {
        this.cats.get(cat.getId()).setName(cat.getName());
    }

    @Override
    public void deleteCat(int id) {
        this.cats.remove(id);
        System.out.println("Cat is deleted.");
    }
}