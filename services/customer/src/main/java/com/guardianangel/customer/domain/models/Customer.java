package com.guardianangel.customer.domain.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Customer {
    // This class is the aggregate root
    // Usual customer data
    @Id
    private String id;
    private String firstName;
    private String surName;
    private Integer age;
    private String birthDate;
    private Integer socialSecurityNumber;
    private String gender;

    // Specific data used on pricing policies -> Only inserted if the desired policy requires it.
    // These are Value Objects
    private Address address;
    private VehicleInfo  vehicleInfo;

    public static Customer newCustomer
            (String id, String firstName, String surName, Integer age, String birthDate, Integer socialSecurityNumber, String gender)
    {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setSurName(surName);
        customer.setAge(age);
        customer.setBirthDate(birthDate);
        customer.setSocialSecurityNumber(socialSecurityNumber);
        customer.setGender(gender);

        return customer;
    }



}
