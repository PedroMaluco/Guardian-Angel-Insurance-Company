package com.guardianangel.customer.api.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressInput {

    private Integer zipCode;
    private String street;
    private Integer houseNumber;
    private String cityName;
    private String state;
}
