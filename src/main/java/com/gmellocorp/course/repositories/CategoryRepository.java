package com.gmellocorp.course.repositories;

import com.gmellocorp.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
