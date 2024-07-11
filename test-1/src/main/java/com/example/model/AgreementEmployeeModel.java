package com.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class AgreementEmployeeModel {
    private Long id;
    private Integer number;
    private String firstName;
    private String lastName;
    private String nameDepartmentAgreementEmployee;
}
