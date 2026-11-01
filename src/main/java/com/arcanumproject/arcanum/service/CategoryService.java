package com.arcanumproject.arcanum.service;

import com.arcanumproject.arcanum.model.Category;
import com.arcanumproject.arcanum.payload.CategoryDTO;
import com.arcanumproject.arcanum.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories();
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
