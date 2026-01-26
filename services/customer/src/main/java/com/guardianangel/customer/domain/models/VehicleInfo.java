package com.guardianangel.customer.domain.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter(AccessLevel.PRIVATE)
@Getter
public class VehicleInfo {

    private String driverLicenseCode;
    private String vehicleIdentificationNumber;
    private Integer annualMileage;

    public static VehicleInfo declareAutoInfo
            (String driverLicenseCode, String vehicleIdentificationNumber, Integer annualMileage)
    {
        VehicleInfo vehicleInfo = new VehicleInfo();
        vehicleInfo.setAnnualMileage(annualMileage);
        vehicleInfo.setDriverLicenseCode(driverLicenseCode);
        vehicleInfo.setVehicleIdentificationNumber(vehicleIdentificationNumber);

        return vehicleInfo;
    }
}
