package com.york.albertososa.fullstackcustomermanagementapp.service;

import com.york.albertososa.fullstackcustomermanagementapp.exception.UserNotFoundException;
import com.york.albertososa.fullstackcustomermanagementapp.model.Customer;
import com.york.albertososa.fullstackcustomermanagementapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findCustomerById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
