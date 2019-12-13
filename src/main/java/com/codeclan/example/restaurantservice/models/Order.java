package com.codeclan.example.restaurantservice.models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long id;
    private double price;
    private String collectionTime;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishes;
    private boolean collected;

    public Order(double price, String collectionTime, Customer customer, Restaurant restaurant, boolean collected) {
        this.price = price;
        this.collectionTime = collectionTime;
        this.customer = customer;
        this.restaurant = restaurant;
        this.dishes = new ArrayList<>();
        this.collected = collected;
    }
}
