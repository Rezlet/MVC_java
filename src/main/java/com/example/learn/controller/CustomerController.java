package com.example.learn.controller;

import com.example.learn.model.Customer;
import com.example.learn.repository.CustomerRepository;
import com.example.learn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
@GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> listCustomer = customerService.getAllCustomer();
        return new ResponseEntity<>(listCustomer, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody  Customer customer) {
        Customer updateCustomer = customerService.updateCustomer(customer);
        return new ResponseEntity<>(updateCustomer, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id) {
        System.out.println("delete controller  " + id);
        customerService.deleteCustomerById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("id") Long id) {
        Customer foundCustomer = customerService.findCustomerById(id);
        return new ResponseEntity<>(foundCustomer, HttpStatus.OK);
    }
}
