package com.guardianangel.customer.domain.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Address {

    private Integer zipCode;
    private String street;
    private Integer houseNumber;
    private String cityName;
    private String state;
}
