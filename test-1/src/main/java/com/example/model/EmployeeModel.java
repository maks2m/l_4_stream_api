package com.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class EmployeeModel {
    private Long id;
    private Integer number;
    private String firstName;
    private String lastName;
    private String nameDepartment;
    private String fullNameAgreementEmployee;
}
