package com.guardianangel.customer.domain.service;

import com.guardianangel.customer.api.models.CustomerInput;
import com.guardianangel.customer.domain.models.Customer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final Customer customer;

    public String createCustomer(@RequestBody @Valid CustomerInput input) {



    }

}
