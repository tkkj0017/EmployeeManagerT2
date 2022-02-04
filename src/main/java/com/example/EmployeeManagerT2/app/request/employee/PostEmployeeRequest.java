package com.example.EmployeeManagerT2.app.request.employee;

import lombok.Data;

@Data
public class PostEmployeeRequest {

    private String id;
    private Integer employeeNumber;
    private String lastName;
    private String firstName;
    private String lastNameKana;
    private String firttNameKana;
    private String departmentId;
    private String email;
    private String workStyle;
    private String joinDate;
}
