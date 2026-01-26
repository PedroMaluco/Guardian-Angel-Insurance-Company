package com.guardianangel.customer.domain.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter(AccessLevel.PRIVATE)
@Getter
public class Address {

    private Integer zipCode;
    private String street;
    private Integer houseNumber;
    private String cityName;
    private String state;

    public static Address declareAddress
            (Integer zipCode, String street, Integer houseNumber, String cityName, String state)
    {
        Address address = new Address();
        address.setZipCode(zipCode);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setCityName(cityName);
        address.setState(state);

        return address;
    }
}
