package com.example.EmployeeManagerT2.domain.service;

import com.example.EmployeeManagerT2.app.request.employee.PostEmployeeRequest;
import com.example.EmployeeManagerT2.app.request.employee.PutEmployeeRequest;
import com.example.EmployeeManagerT2.app.response.employee.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public interface EmployeeService {

    GetEmployeeListResponse getList();

    GetEmployeeDetailResponse getDetail(String id);

    PostEmployeeResponse post(PostEmployeeRequest request);

    PutEmployeeResponse put(PutEmployeeRequest request);

    DeleteEmployeeResponse delete(String id);
}
