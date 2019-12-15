package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
