package com.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class DocumentModel {
    private Long id;
    private String numberDocument;
    private String title;
    private String content;
    private String fullNameEmployee;
    private String nameDepartmentEmployee;
    private String fullNameAgreementEmployee;
    private String nameDepartmentAgreementEmployee;
}
