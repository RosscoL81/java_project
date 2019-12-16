package com.codeclan.example.restaurantservice;

import com.codeclan.example.restaurantservice.enums.SpiceLevel;
import com.codeclan.example.restaurantservice.models.*;
import com.codeclan.example.restaurantservice.repositories.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class RestaurantserviceApplicationTests {

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


	@Test
	void contextLoads() {
	}

	@Test
	public void canGetCustomers(){
		List<Customer> found = customerRepository.findAll();
		assertEquals(1, found.size());
	}
	@Test
	public void canGetRestaurants(){
		List<Restaurant> found = restaurantRepository.findAll();
		assertEquals(1, found.size());
	}

	@Test
	public void canGetDishes(){
		List<Dish> found = dishRepository.findAll();
		assertEquals(1, found.size());
	}

	@Test
	public void canGetOrders(){
		List<Order> found = orderRepository.findAll();
		assertEquals(1, found.size());
	}

	@Test
	public void canAddRestaurant(){
		Restaurant restaurant2 = new Restaurant("The Jolly", 700.00, "1200", "2200");
		restaurantRepository.save(restaurant2);
		List<Restaurant> found = restaurantRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canAddCustomer(){
		Restaurant restaurant2 = new Restaurant("The Jolly", 700.00, "1200", "2200");
		restaurantRepository.save(restaurant2);
		Customer customer2 = new Customer("Iona", 4000, restaurant2);
		customerRepository.save(customer2);
		List<Customer> found = customerRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canAddOrder(){
		Restaurant restaurant2 = new Restaurant("The Jolly", 700.00, "1200", "2200");
		restaurantRepository.save(restaurant2);
		Customer customer2 = new Customer("Iona", 4000, restaurant2);
		customerRepository.save(customer2);
		DateFormat sfd = new SimpleDateFormat("dd-mm-yyyy hh:mm");
		String newDate = "24-07-2018 18:00";
		Date date = null;
		try {
			date = sfd.parse(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Order order1 = new Order(0, customer2, date, restaurant2, false);
		orderRepository.save(order1);
		List<Order> found = orderRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canAddDish(){
		Restaurant restaurant2 = new Restaurant("The Jolly", 700.00, "1200", "2200");
		restaurantRepository.save(restaurant2);
		Customer customer2 = new Customer("Iona", 4000, restaurant2);
		customerRepository.save(customer2);
		DateFormat sfd = new SimpleDateFormat("dd-mm-yyyy hh:mm");
		String newDate = "24-07-2018 18:00";
		Date date = null;
		try {
			date = sfd.parse(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Order order1 = new Order(0, customer2, date, restaurant2, false);
		orderRepository.save(order1);
		Dish dish1 = new Dish("Bean Curry", 7.00, SpiceLevel.MEDIUM, order1);
		dishRepository.save(dish1);
		List<Dish> found = dishRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canGetIngredients(){
		List<Ingredient> found = ingredientRepository.findAll();
		assertEquals(2, found.size());
	}


}
