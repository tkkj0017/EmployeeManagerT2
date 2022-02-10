package com.example.EmployeeManagerT2.inflastructure.entity.employee;

import lombok.Data;

@Data
public class Emoloyee {

    private Integer id;
    private Integer departmentId;
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
    private String createdAt;
    private String createdLoginMemberId;
    private String updatedAt;
    private String updatedLogin_memberId;
    private String retireFlg;
}
