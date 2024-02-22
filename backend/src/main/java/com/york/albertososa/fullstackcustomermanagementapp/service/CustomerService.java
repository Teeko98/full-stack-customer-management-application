package com.york.albertososa.fullstackcustomermanagementapp.service;

import com.york.albertososa.fullstackcustomermanagementapp.model.Customer;
import com.york.albertososa.fullstackcustomermanagementapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Iterable<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findCustomerById(id);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
