package com.example.EmployeeManagerT2.app.controller;

import com.example.EmployeeManagerT2.app.response.department.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @GetMapping
    public ResponseEntity<GetDepartmentListResponse> getList() {
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<GetDepartmentDetailResponse> getDetail() {
        return null;
    }

    @PostMapping
    public ResponseEntity<PostDepartmentResponse> post() {
        return null;
    }

    @PutMapping("{id}")
    public ResponseEntity<PutDepartmentResponse> put() {
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DeleteDepartmentResponse> delete() {
        return null;
    }

}
