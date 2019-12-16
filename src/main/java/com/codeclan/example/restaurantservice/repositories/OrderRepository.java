package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Order;
import com.codeclan.example.restaurantservice.projections.EmbedRestaurantAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedRestaurantAndCustomer.class)
public interface OrderRepository extends JpaRepository<Order, Long> {
}
