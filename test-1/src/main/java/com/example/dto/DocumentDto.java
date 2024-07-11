package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DocumentDto {
    private Long id;
    private String number;
    private String title;
    private String content;
    private EmployeeDto employee;
    private EmployeeDto agreementEmployee;
}
