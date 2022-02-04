package com.example.EmployeeManagerT2.app.request.loginmember;

import lombok.Data;

@Data
public class PostLoginMemberRequest {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
