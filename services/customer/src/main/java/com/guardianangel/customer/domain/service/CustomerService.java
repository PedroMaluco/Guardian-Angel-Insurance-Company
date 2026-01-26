package com.guardianangel.customer.domain.service;

import com.guardianangel.customer.api.models.AddressInput;
import com.guardianangel.customer.api.models.CustomerInput;
import com.guardianangel.customer.api.models.VehicleInfoInput;
import com.guardianangel.customer.domain.exceptions.CustomerNotFoundException;
import com.guardianangel.customer.domain.models.Address;
import com.guardianangel.customer.domain.models.Customer;
import com.guardianangel.customer.domain.models.VehicleInfo;
import com.guardianangel.customer.domain.repository.CustomerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository repository;

    public Customer createCustomer(@RequestBody @Valid CustomerInput input) {
        Customer customer = Customer.newCustomer(
                input.getFirstName(),
                input.getSurName(),
                input.getAge(),
                input.getBirthDate(),
                input.getSocialSecurityNumber(),
                input.getGender()
        );
        repository.save(customer);
        return customer;
    }

    public String annexHouseInfoToCustomer(@RequestBody @Valid AddressInput input, UUID customerId){
        Customer customer = repository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
        Address address = Address.declareAddress(
                input.getZipCode(),
                input.getStreet(),
                input.getHouseNumber(),
                input.getCityName(),
                input.getState()
        );
        customer.setAddress(address);
        repository.save(customer);

        return "Address annexed to customer profile";
    }

    public String annexVehicleInfo(@RequestBody @Valid VehicleInfoInput input, UUID customerId) {
        Customer customer = repository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
        VehicleInfo vehicleInfo = VehicleInfo.declareAutoInfo(
                input.getDriverLicenseCode(),
                input.getVehicleIdentificationNumber(),
                input.getAnnualMileage()
        );
        customer.setVehicleInfo(vehicleInfo);
        repository.save(customer);

        return "Vehicle Information annexed to customer profile";
    }

}
