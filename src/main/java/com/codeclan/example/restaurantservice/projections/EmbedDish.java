package com.codeclan.example.restaurantservice.projections;

import com.codeclan.example.restaurantservice.models.Dish;
import com.codeclan.example.restaurantservice.models.Ingredient;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedDish", types = Ingredient.class)
public interface EmbedDish {
    Long getId();
    String getName();
    Double getPrice();
    Dish getDish();
}
