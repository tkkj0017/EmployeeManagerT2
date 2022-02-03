package com.example.EmployeeManagerT2.app.controller;

import com.example.EmployeeManagerT2.app.response.employee.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @GetMapping
    public ResponseEntity<GetEmployeeListResponse> getList() {
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<GetEmployeeDetailResponse> getDetail() {
        return null;
    }

    @PostMapping
    public ResponseEntity<PostEmployeeResponse> post() {
        return null;
    }

    @PutMapping("{id}")
    public ResponseEntity<PutEmployeeResponse> put() {
        return null;
    }

    @DeleteMapping("{id")
    public ResponseEntity<DeleteEmployeeResponse> delete() {
        return null;
    }
}
