package com.guardianangel.customer.domain.models;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    // Usual customer data
    private UUID id;
    private String firstName;
    private String surName;
    private Integer age;
    private String birthDate;
    private Integer socialSecurityNumber;
    private String gender;

    // Specific data used on pricing policies -> Only inserted if the desired policy requires it.
    private Address address;
    private AutoInfo autoInfo;

    public static Customer newCustomer(){

    }



}
