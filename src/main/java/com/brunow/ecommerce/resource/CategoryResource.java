package com.brunow.ecommerce.resource;

import com.brunow.ecommerce.entities.Category;
import com.brunow.ecommerce.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/category")
public class CategoryResource {
    @Autowired
    private CategoryServices category;
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = category.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj =category.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
