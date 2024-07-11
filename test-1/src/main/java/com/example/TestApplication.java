package com.example;

import com.example.dto.DepartmentDto;
import com.example.dto.DocumentDto;
import com.example.dto.EmployeeDto;
import com.example.util.ExampleUtils;

import java.util.List;

public class TestApplication {
    public static void main(String[] args) {
        List<EmployeeDto> employeeList = ExampleUtils.getEmployeeList();
        List<EmployeeDto> agreementEmployeeList = ExampleUtils.getAgreementEmployeeList();
        List<DocumentDto> documentList = ExampleUtils.getDocumentList();
        List<DepartmentDto> deparnmentList = ExampleUtils.getDeparnmentList();

        // перевести объекты DTO в объекты Model используя стримы
        // вывести в консоль получившиеся коллекции объектов через toString() самих объектов
    }
}
