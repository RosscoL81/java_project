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

//        DateFormat sfd = new SimpleDateFormat("dd-mm-yyyy hh:mm");
//        String newDate = "24-07-2018 18:00";
//        Date date = null;
//        try {
//            date = sfd.parse(newDate);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        // ingredient seeds

        Ingredient ingredient1 = new Ingredient("Sausage", 5.00, false);
        ingredientRepository.save(ingredient1);

        Ingredient ingredient2 = new Ingredient("White rice", 1.00, true);
        ingredientRepository.save(ingredient2);

        Ingredient ingredient3 = new Ingredient("Brown rice", 1.00, true);
        ingredientRepository.save(ingredient3);

        Ingredient ingredient4 = new Ingredient("Chicken cutlet", 3.00, false);
        ingredientRepository.save(ingredient4);

        Ingredient ingredient5 = new Ingredient("Cheese-filled hamburger", 4.00, false);
        ingredientRepository.save(ingredient5);

        Ingredient ingredient6 = new Ingredient("Scrambled egg", 3.00, true);
        ingredientRepository.save(ingredient6);

        Ingredient ingredient7 = new Ingredient("Seitan", 4.00, true);
        ingredientRepository.save(ingredient7);

        Ingredient ingredient8 = new Ingredient("Seafood", 3.00, false);
        ingredientRepository.save(ingredient8);

        // restaurant seeds

        Restaurant restaurant1 = new Restaurant("Cari House", 400.00, "1000", "2300");
        restaurantRepository.save(restaurant1);

        // customer seeds

        Customer customer1 = new Customer("Alex B", 30.00, restaurant1);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Cammy", 25.00, restaurant1 );
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Hayao Miyazaki", 50.00, restaurant1 );
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Yoko", 40.00, restaurant1 );
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Hiromi", 55.00, restaurant1 );
        customerRepository.save(customer5);

        Customer customer6 = new Customer("Ryuichi", 67.00, restaurant1 );
        customerRepository.save(customer6);

        // order seeds

        Order order1 = new Order(0, customer1, "1300", restaurant1, true);
        orderRepository.save(order1);

        Order order2 = new Order(0, customer2, "1500", restaurant1, false );
        orderRepository.save(order2);

        Order order3 = new Order(0, customer3, "1700", restaurant1, true );
        orderRepository.save(order3);

        Order order4 = new Order(1, customer4, "1550", restaurant1, false );
        orderRepository.save(order4);

        Order order5 = new Order(4, customer5, "1750", restaurant1, false );
        orderRepository.save(order5);

        Order order6 = new Order(0, customer5, "1830", restaurant1, false );
        orderRepository.save(order6);

        Order order7 = new Order(7, customer4, "1900", restaurant1, false );
        orderRepository.save(order7);

        Order order8 = new Order(0, customer1, "2215", restaurant1, false );
        orderRepository.save(order8);

        // dish seeds

        Dish dish1 = new Dish("Sausage Curry", 5.00, SpiceLevel.VERYHOT, order1);
        dishRepository.save(dish1);
        dish1.addIngredients(ingredient1);
        dish1.addIngredients((ingredient2));

        Dish dish2 = new Dish("Rice", 1.50, SpiceLevel.MILD, order2);
        dishRepository.save(dish2);
        dish2.addIngredients((ingredient2));

        Dish dish3 = new Dish("Chicken cutlet curry", 5.00, SpiceLevel.MEDIUM, order3);
        dishRepository.save(dish3);
        dish3.addIngredients((ingredient3));

        Dish dish4 = new Dish("Cheese-filled hamburger curry", 3.50, SpiceLevel.HOT, order4);
        dishRepository.save(dish4);
        dish4.addIngredients((ingredient4));

        Dish dish5 = new Dish("Vegetable curry", 3.00, SpiceLevel.HOT, order5);
        dishRepository.save(dish5);
        dish5.addIngredients((ingredient5));

        Dish dish6 = new Dish("Scrambled egg curry", 3.00, SpiceLevel.MEDIUM, order6);
        dishRepository.save(dish6);
        dish6.addIngredients((ingredient6));

        Dish dish7 = new Dish("Seitan curry", 5.00, SpiceLevel.VERYHOT, order7);
        dishRepository.save(dish7);
        dish7.addIngredients((ingredient7));

        Dish dish8 = new Dish("Seafood curry", 5.00, SpiceLevel.VERYHOT, order8);
        dishRepository.save(dish8);
        dish8.addIngredients((ingredient8));


    }

}
