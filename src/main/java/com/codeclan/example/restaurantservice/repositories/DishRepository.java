package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
}
