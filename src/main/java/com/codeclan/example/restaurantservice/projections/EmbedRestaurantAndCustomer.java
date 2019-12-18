package com.codeclan.example.restaurantservice.projections;

import com.codeclan.example.restaurantservice.models.Customer;
import com.codeclan.example.restaurantservice.models.Dish;
import com.codeclan.example.restaurantservice.models.Order;
import com.codeclan.example.restaurantservice.models.Restaurant;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name="embedRestaurantAndCustomer", types = Order.class)
public interface EmbedRestaurantAndCustomer {
    Long getId();
    Double getPrice();
    String getCollectionTime();
    Customer getCustomer();
    Restaurant getRestaurant();
    List<Dish> getDishes();
}
