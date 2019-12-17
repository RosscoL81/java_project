package com.codeclan.example.restaurantservice.components;

import com.codeclan.example.restaurantservice.enums.SpiceLevel;
import com.codeclan.example.restaurantservice.models.*;
import com.codeclan.example.restaurantservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Autowired
    IngredientRepository ingredientRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        DateFormat sfd = new SimpleDateFormat("dd-mm-yyyy hh:mm");
        String newDate = "24-07-2018 18:00";
        Date date = null;
        try {
            date = sfd.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Ingredient ingredient1 = new Ingredient("sausage", 5.00, false);
        ingredientRepository.save(ingredient1);

        Ingredient ingredient2 = new Ingredient("whiteRice", 1.50, true);
        ingredientRepository.save(ingredient2);

        Restaurant restaurant1 = new Restaurant("Cari House", 400.00, "1000", "2300");
        restaurantRepository.save(restaurant1);

        Customer customer1 = new Customer("Alex B", 30.00, restaurant1);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Cammy", 25.00, restaurant1 );
        customerRepository.save(customer2);

        Order order1 = new Order(0, customer1, date, restaurant1, true);
        orderRepository.save(order1);

        Order order2 = new Order(0, customer2, date, restaurant1, false );
        orderRepository.save(order2);

        Dish dish1 = new Dish("Sausage Curry", 5.00, SpiceLevel.VERYHOT, order1);
        dishRepository.save(dish1);
        dish1.addIngredients(ingredient1);
        dish1.addIngredients((ingredient2));

        Dish dish2 = new Dish("rice", 1.50, SpiceLevel.MILD, order2);
        dishRepository.save(dish2);
        dish2.addIngredients((ingredient2));


    }

}
