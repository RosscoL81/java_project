package com.codeclan.example.restaurantservice.repositories;

import com.codeclan.example.restaurantservice.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
