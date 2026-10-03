package com.arcanumproject.arcanum.repositories;

import com.arcanumproject.arcanum.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
