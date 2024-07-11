package com.example.util;

import com.example.dto.DepartmentDto;
import com.example.dto.DocumentDto;
import com.example.dto.EmployeeDto;

import java.util.List;

public class ExampleUtils {

    static DepartmentDto department1 = DepartmentDto.builder().id(1L).nameDepartment("Бухгалтерия").build();
    static DepartmentDto department2 = DepartmentDto.builder().id(2L).nameDepartment("Логистика").build();
    static DepartmentDto department3 = DepartmentDto.builder().id(3L).nameDepartment("Производство").build();

    static EmployeeDto employee1 = EmployeeDto.builder().id(1L).number(1).firstName("Валерий").lastName("Меладзе").departmentDto(department1).isAgreement(false).build();
    static EmployeeDto employee2 = EmployeeDto.builder().id(2L).number(2).firstName("Григорий").lastName("Лепс").departmentDto(department3).isAgreement(false).build();
    static EmployeeDto employee3 = EmployeeDto.builder().id(3L).number(3).firstName("Лев").lastName("Лещенко").departmentDto(department2).isAgreement(false).build();
    static EmployeeDto employee4 = EmployeeDto.builder().id(4L).number(4).firstName("Леонид").lastName("Агутин").departmentDto(department1).isAgreement(false).build();
    static EmployeeDto employee5 = EmployeeDto.builder().id(5L).number(5).firstName("София").lastName("Ратару").departmentDto(department3).isAgreement(false).build();

    static EmployeeDto agreementEmployee1 = EmployeeDto.builder().id(6L).number(6).firstName("Мстислав").lastName("Ростропович").departmentDto(department1).isAgreement(true).build();
    static EmployeeDto agreementEmployee2 = EmployeeDto.builder().id(7L).number(7).firstName("Иоганн").lastName("Бах").departmentDto(department3).isAgreement(true).build();
    static EmployeeDto agreementEmployee3 = EmployeeDto.builder().id(8L).number(8).firstName("Вольфганг ").lastName("Моцарт").departmentDto(department2).isAgreement(true).build();

    static DocumentDto document1 = DocumentDto.builder().id(1L).number("1-к").title("Приказ").content("о ежегодном отпуске").employee(employee1).agreementEmployee(agreementEmployee1).build();
    static DocumentDto document2 = DocumentDto.builder().id(2L).number("2-к").title("Заявление").content("на увольнении").employee(employee2).agreementEmployee(agreementEmployee2).build();
    static DocumentDto document3 = DocumentDto.builder().id(3L).number("3-к").title("Приказ").content("о переводе на другую должность").employee(employee3).agreementEmployee(agreementEmployee3).build();
    static DocumentDto document4 = DocumentDto.builder().id(4L).number("1-б").title("Распоряжение").content("о выдаче аванса").employee(employee4).agreementEmployee(agreementEmployee1).build();
    static DocumentDto document5 = DocumentDto.builder().id(5L).number("1-б").title("Приказ").content("о направлении в командировку").employee(employee5).agreementEmployee(agreementEmployee2).build();
    static DocumentDto document6 = DocumentDto.builder().id(6L).number("1-п").title("Приказ").content("о усилении второй смены 2мя работниками").employee(employee2).agreementEmployee(agreementEmployee2).build();
    static DocumentDto document7 = DocumentDto.builder().id(7L).number("1-п").title("Распоряжение").content("о пересмотре плана производста").employee(employee5).agreementEmployee(agreementEmployee2).build();


    public static List<EmployeeDto> getEmployeeList() {
        return List.of(employee1, employee2, employee3, employee4, employee5);
    }

    public static List<EmployeeDto> getAgreementEmployeeList() {
        return List.of(agreementEmployee1, agreementEmployee2, agreementEmployee3);
    }

    public static List<DocumentDto> getDocumentList() {
        return List.of(document1, document2, document3, document4, document5, document6, document7);
    }

    public static List<DepartmentDto> getDeparnmentList() {
        return List.of(department1, department2, department3);
    }
}
