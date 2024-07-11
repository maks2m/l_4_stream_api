package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    private Long id;
    private Integer number;
    private String firstName;
    private String lastName;
    private DepartmentDto departmentDto;
    private Boolean isAgreement;
}
