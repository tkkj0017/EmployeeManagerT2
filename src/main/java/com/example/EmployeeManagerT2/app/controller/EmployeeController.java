package com.example.EmployeeManagerT2.app.controller;

import com.example.EmployeeManagerT2.app.request.employee.PostEmployeeRequest;
import com.example.EmployeeManagerT2.app.request.employee.PutEmployeeRequest;
import com.example.EmployeeManagerT2.app.response.employee.*;
import com.example.EmployeeManagerT2.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<GetEmployeeListResponse> getList() {
        final var response = service.getList();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<GetEmployeeDetailResponse> getDetail(@PathVariable String id) {
        final var response = service.getDetail(id);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PostEmployeeResponse> post(@RequestBody PostEmployeeRequest request) {
        final var response = service.post(request);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PutEmployeeResponse> put(@RequestBody PutEmployeeRequest request) {
        final var response = service.put(request);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DeleteEmployeeResponse> delete(@PathVariable String id) {
        final var response = service.delete(id);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }
}
