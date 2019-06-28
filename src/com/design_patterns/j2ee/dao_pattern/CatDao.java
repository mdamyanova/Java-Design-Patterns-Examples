package com.design_patterns.j2ee.dao_pattern;

import java.util.List;

public interface CatDao {
    List<Cat> getAllCats();
    Cat getCat(int id);
    void updateCat(Cat cat);
    void deleteCat(int id);
}