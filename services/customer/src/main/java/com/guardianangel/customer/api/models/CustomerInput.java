package com.guardianangel.customer.api.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class CustomerInput {

    private String id;
    @NotNull
    @NotBlank
    private String firstName;
    @NotNull
    @NotBlank
    private String surName;
    @NotNull
    private Integer age;
    @NotNull
    @NotBlank
    private String birthDate;
    @NotNull
    @NotBlank
    private Integer socialSecurityNumber;
    @NotNull
    @NotBlank
    private String gender;


}
