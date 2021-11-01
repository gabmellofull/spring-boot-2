package com.gmellocorp.course.repositories;

import com.gmellocorp.course.entities.Category;
import com.gmellocorp.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
