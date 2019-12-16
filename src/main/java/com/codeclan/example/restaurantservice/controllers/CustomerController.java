package com.codeclan.example.restaurantservice.controllers;

import com.codeclan.example.restaurantservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
@Autowired
    CustomerRepository customerRepository;
}
