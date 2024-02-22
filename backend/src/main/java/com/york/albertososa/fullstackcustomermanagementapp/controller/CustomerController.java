package com.york.albertososa.fullstackcustomermanagementapp.controller;

import com.york.albertososa.fullstackcustomermanagementapp.model.Customer;
import com.york.albertososa.fullstackcustomermanagementapp.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public Iterable<Customer> findAllCustomers() {
        return this.customerRepository.findAll();
    }

    @SuppressWarnings("null") //delete and fix properly later
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
        return this.customerRepository.save(customer);
    }
}
