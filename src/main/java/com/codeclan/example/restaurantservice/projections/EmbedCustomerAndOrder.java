package com.codeclan.example.restaurantservice.projections;

import com.codeclan.example.restaurantservice.models.Customer;
import com.codeclan.example.restaurantservice.models.Order;
import com.codeclan.example.restaurantservice.models.Restaurant;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedCustomerAndOrder", types= Restaurant.class)
public interface EmbedCustomerAndOrder {

    Long getId();
    String getName();
    Double getTill();
    List<Customer> getCustomers();
    List<Order> getOrders();
    String getOpeningTime();
    String getClosingTime();
}
