package com.guardianangel.customer.api.controller;

import com.guardianangel.customer.api.models.CustomerInput;
import com.guardianangel.customer.domain.models.Customer;
import com.guardianangel.customer.domain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<Customer> newCustomer(@RequestBody CustomerInput input){
        Customer customer = customerService.createCustomer(input);
        return ResponseEntity.ok(customer);

    }
}
