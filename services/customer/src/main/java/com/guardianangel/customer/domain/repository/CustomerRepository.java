package com.guardianangel.customer.domain.repository;

import com.guardianangel.customer.domain.models.Customer;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
