package com.codeclan.example.restaurantservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "vegetarian_friendly")
    private boolean vegetarianFriendly;
    @JsonIgnoreProperties("ingredients")
    @ManyToOne
    @JoinColumn(name = "dish_id", nullable = true)
    private Dish dish;

    public Ingredient(String name, double price, boolean vegetarianFriendly) {
        this.name = name;
        this.price = price;
        this.vegetarianFriendly = vegetarianFriendly;
        this.dish = null;
    }

    public Ingredient(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarianFriendly() {
        return vegetarianFriendly;
    }

    public void setVegetarianFriendly(boolean vegetarianFriendly) {
        this.vegetarianFriendly = vegetarianFriendly;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
}
