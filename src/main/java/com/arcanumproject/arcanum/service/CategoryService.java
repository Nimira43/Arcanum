package com.arcanumproject.arcanum.service;

import com.arcanumproject.arcanum.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

}
