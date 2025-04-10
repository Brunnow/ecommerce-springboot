package com.brunow.ecommerce.resource;

import com.brunow.ecommerce.entities.Order;
import com.brunow.ecommerce.services.OrderServices;
import com.brunow.ecommerce.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/orders")
public class OrderResource {
    @Autowired
    private OrderServices service;
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj =service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
