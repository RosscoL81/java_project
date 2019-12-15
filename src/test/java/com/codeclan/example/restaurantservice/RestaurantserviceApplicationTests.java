package com.codeclan.example.restaurantservice;

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
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
		Order order1 = new Order(0, "1500", customer2, restaurant2, false);
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
		Order order1 = new Order(0, "1500", customer2, restaurant2, false);
		orderRepository.save(order1);
		Dish dish1 = new Dish("Bean Curry", 7.00, SpiceLevel.MEDIUM, order1, Ingredient.BAMBOOSHOOTS);
		dishRepository.save(dish1);
		List<Dish> found = dishRepository.findAll();
		assertEquals(2, found.size());
	}
}
