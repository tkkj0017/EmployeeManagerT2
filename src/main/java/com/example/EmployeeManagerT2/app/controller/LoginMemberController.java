package com.example.EmployeeManagerT2.app.controller;

import com.example.EmployeeManagerT2.app.request.loginmember.PostLoginMemberRequest;
import com.example.EmployeeManagerT2.app.response.loginmember.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login-member")
public class LoginMemberController {

    @GetMapping
    public ResponseEntity<GetLoginMemberListResponse> getList() {
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<GetLoginMemberDetailResponse> getDetail() {
        return null;
    }

    @PostMapping
    public ResponseEntity<PostLoginMemberResponse> post(@RequestBody PostLoginMemberRequest request) {
        return null;
    }

    @PutMapping
    public ResponseEntity<PutLoginMemberResponse> put() {
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DeleteLoginMemberResponse> delete() {
        return  null;
    }

}
