package com.codeclan.example.restaurantservice.controllers;

import com.codeclan.example.restaurantservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
@Autowired
    OrderRepository orderRepository;
}
