package com.example.EmployeeManagerT2.app.request.employee;

import lombok.Data;

@Data
public class PostEmployeeRequest {

    private String id;
    private String departmentId;
    private Integer employeeNumber;
    private String lastName;
    private String firstName;
    private String lastNameKana;
    private String firstNameKana;
    private String privateEmail;
    private String businessEmail;
    private String workStyle;
    private String joinDate;
    private String remarks;
}
