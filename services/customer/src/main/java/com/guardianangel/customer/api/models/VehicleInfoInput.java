package com.guardianangel.customer.api.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleInfoInput {

    private String driverLicenseCode;
    private String vehicleIdentificationNumber;
    private Integer annualMileage;
}
