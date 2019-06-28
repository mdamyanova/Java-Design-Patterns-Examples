package com.design_patterns.j2ee.mvc_pattern;

public class CatController {
    private Cat model;
    private CatView view;

    public CatController(Cat model, CatView view) {
        this.model = model;
        this.view = view;
    }

    public void setCatName(String name) {
        this.model.setName(name);
    }

    public String getCatName() {
        return this.model.getName();
    }

    public void updateView() {
        this.view.printCatName(this.getCatName());
    }
}