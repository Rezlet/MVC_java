package com.example.learn.service;

import com.example.learn.exception.UserException;
import com.example.learn.model.Customer;
import com.example.learn.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository= customerRepository;
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findCustomerById(id)
                .orElseThrow(() -> new
                        UserException("User by id " + id + "was not found"));
    }

    public void deleteCustomerById(Long id) {

         customerRepository.deleteCustomerById(id);
    }
}
