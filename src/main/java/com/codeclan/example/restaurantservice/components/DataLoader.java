package com.codeclan.example.restaurantservice.components;

import com.codeclan.example.restaurantservice.enums.Ingredient;
import com.codeclan.example.restaurantservice.enums.SpiceLevel;
import com.codeclan.example.restaurantservice.models.Customer;
import com.codeclan.example.restaurantservice.models.Dish;
import com.codeclan.example.restaurantservice.models.Order;
import com.codeclan.example.restaurantservice.models.Restaurant;
import com.codeclan.example.restaurantservice.repositories.CustomerRepository;
import com.codeclan.example.restaurantservice.repositories.DishRepository;
import com.codeclan.example.restaurantservice.repositories.OrderRepository;
import com.codeclan.example.restaurantservice.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    DishRepository dishRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        Restaurant restaurant1 = new Restaurant("Cari House", 400.00, "1000", "2300");
        restaurantRepository.save(restaurant1);

        Customer customer1 = new Customer("Alex B", 3000, restaurant1);
        customerRepository.save(customer1);

        Order order1 = new Order(0, "1500", customer1, restaurant1, true);
        orderRepository.save(order1);

        Dish dish1 = new Dish("Sausage Curry", 5.00, SpiceLevel.VERYHOT, order1, Ingredient.ASPARAGUS);
        dishRepository.save(dish1);
    }
}
