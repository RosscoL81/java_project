package com.codeclan.example.restaurantservice.projections;

import com.codeclan.example.restaurantservice.models.Customer;
import com.codeclan.example.restaurantservice.models.Order;
import com.codeclan.example.restaurantservice.models.Restaurant;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedOrderAndRestaurant", types= Customer.class)
public interface EmbedOrderAndRestaurant {
    Long getId();
    String getName();
    Double getWallet();
    List<Order> getOrders();
    Restaurant getRestaurant();
}
