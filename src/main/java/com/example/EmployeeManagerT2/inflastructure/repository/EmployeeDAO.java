package com.example.EmployeeManagerT2.inflastructure.repository;

import com.example.EmployeeManagerT2.app.request.employee.PostEmployeeRequest;
import com.example.EmployeeManagerT2.app.request.employee.PutEmployeeRequest;
import com.example.EmployeeManagerT2.app.response.employee.*;
import com.example.EmployeeManagerT2.inflastructure.entity.employee.SelectEmployeeById;
import com.example.EmployeeManagerT2.inflastructure.entity.employee.SelectEmployeeList;
import org.springframework.http.ResponseEntity;

public interface EmployeeDAO {

    Object getList();

    Object getDetail(String id);

    Object post(PostEmployeeRequest request);

    Object put(PutEmployeeRequest request);

    Object delete(String id);
}
