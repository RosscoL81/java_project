package com.codeclan.example.restaurantservice.projections;

import com.codeclan.example.restaurantservice.enums.SpiceLevel;
import com.codeclan.example.restaurantservice.models.Dish;
import com.codeclan.example.restaurantservice.models.Ingredient;
import com.codeclan.example.restaurantservice.models.Order;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedOrder", types= Dish.class)
public interface EmbedOrder {
    Long getId();
    String getName();
    Ingredient getIngredients();
    SpiceLevel getSpiceLevel();
    Double getPrice();
    Order getOrder();
}
