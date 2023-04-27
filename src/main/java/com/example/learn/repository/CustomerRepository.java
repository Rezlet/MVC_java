package com.example.learn.repository;

import com.example.learn.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    void deleteCustomerById(Long id);
    Optional<Customer> findCustomerById(Long id);
}
