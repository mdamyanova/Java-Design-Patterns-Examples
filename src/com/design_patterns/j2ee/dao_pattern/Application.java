package com.design_patterns.j2ee.dao_pattern;

public class Application {
    public static void main(String[] args) {
        CatDao catDao = new CatDaoImpl();

        for (Cat cat : catDao.getAllCats()) {
            System.out.println("Cat name: " + cat.getName());
        }

        Cat cat = catDao.getAllCats().get(1);
        cat.setName("Edited cat");
        System.out.println(cat.getName());
    }
}