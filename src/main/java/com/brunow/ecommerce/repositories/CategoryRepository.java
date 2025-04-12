package com.brunow.ecommerce.repositories;

import com.brunow.ecommerce.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
