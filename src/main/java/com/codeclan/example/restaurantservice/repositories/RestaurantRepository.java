package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Restaurant;
import com.codeclan.example.restaurantservice.projections.EmbedCustomerAndOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedCustomerAndOrder.class)
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
