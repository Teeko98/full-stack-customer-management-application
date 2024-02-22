package com.york.albertososa.fullstackcustomermanagementapp.repository;

import com.york.albertososa.fullstackcustomermanagementapp.model.Customer;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findCustomerById(Long id);
}
