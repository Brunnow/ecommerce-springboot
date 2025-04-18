package com.brunow.ecommerce.repositories;

import com.brunow.ecommerce.entities.Category;
import com.brunow.ecommerce.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

