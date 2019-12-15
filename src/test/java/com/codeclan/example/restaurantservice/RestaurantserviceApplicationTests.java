package com.codeclan.example.restaurantservice;

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




}
