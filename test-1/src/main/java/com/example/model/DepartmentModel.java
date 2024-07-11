package com.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class DepartmentModel {
    private Long id;
    private String nameDepartment;
}
