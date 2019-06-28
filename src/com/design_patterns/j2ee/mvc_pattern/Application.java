package com.design_patterns.j2ee.mvc_pattern;

public class Application {
    public static void main(String[] args) {
        Cat model = getCatFromDb();
        CatView view = new CatView();
        CatController controller = new CatController(model, view);

        controller.updateView();
        controller.setCatName("Mishy 2");
        controller.updateView();
    }

    private static Cat getCatFromDb() {
        Cat cat = new Cat();
        cat.setId(1);
        cat.setName("Mishy");
        return cat;
    }
}