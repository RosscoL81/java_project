package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
