package com.codeclan.example.restaurantservice.models;

import com.codeclan.example.restaurantservice.enums.SpiceLevel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @JsonIgnore
    @OneToMany(mappedBy = "dish")
    @Column(name = "ingredients")
    private List<Ingredient> ingredients;
    @Column(name = "spice_level")
    private SpiceLevel spiceLevel;
    @JsonIgnoreProperties("dish")
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;


    public Dish(String name, double price, SpiceLevel spiceLevel, Order order) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
        this.spiceLevel = spiceLevel;
        this.order = order;
    }

    public Dish(){}

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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SpiceLevel getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(SpiceLevel spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


}
