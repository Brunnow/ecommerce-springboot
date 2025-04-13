package com.brunow.ecommerce.services;

import com.brunow.ecommerce.entities.Category;
import com.brunow.ecommerce.entities.Product;
import com.brunow.ecommerce.repositories.CategoryRepository;
import com.brunow.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();

    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
