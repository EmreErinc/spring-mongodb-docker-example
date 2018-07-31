package com.springbootmongodbdocker.springbootmongodbdocker.repository;

import com.springbootmongodbdocker.springbootmongodbdocker.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findById (Integer id);
    Customer findByFirstName (String firstName);
    List<Customer> findAllByOrderByIdAsc();
    List<Customer> findAllByOrderByIdDesc ();
    boolean existsByFirstName (String firstName);
}
