package com.york.albertososa.fullstackcustomermanagementapp.repo;

import com.york.albertososa.fullstackcustomermanagementapp.model.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}
