package com.brunow.ecommerce.repositories;

import com.brunow.ecommerce.entities.Product;
import com.brunow.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
