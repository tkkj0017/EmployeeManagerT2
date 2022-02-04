package com.example.EmployeeManagerT2.app.controller;

import com.example.EmployeeManagerT2.app.request.loginmember.PostLoginMemberRequest;
import com.example.EmployeeManagerT2.app.response.department.DeleteDepartmentResponse;
import com.example.EmployeeManagerT2.app.response.loginmember.GetLoginMemberDetailResponse;
import com.example.EmployeeManagerT2.app.response.loginmember.GetLoginMemberListResponse;
import com.example.EmployeeManagerT2.app.response.loginmember.PostLoginMemberResponse;
import com.example.EmployeeManagerT2.app.response.loginmember.PutLoginMemberResponse;
import com.example.EmployeeManagerT2.app.response.role.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("role")
public class RoleController {
    @GetMapping
    public ResponseEntity<GetRoleListResponse> getList() {
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<GetRoleDetailResponse> getDetail(@PathVariable String id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<PostRoleResponse> post(@RequestBody PostLoginMemberRequest request) {
        return null;
    }

    @PutMapping
    public ResponseEntity<PutRoleResponse> put() {
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DeleteRoleResponse> delete() {
        return null;
    }
}
