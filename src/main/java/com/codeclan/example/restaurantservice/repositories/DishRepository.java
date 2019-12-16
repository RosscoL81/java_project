package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Dish;
import com.codeclan.example.restaurantservice.projections.EmbedOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedOrder.class)
public interface DishRepository extends JpaRepository<Dish, Long> {
}
