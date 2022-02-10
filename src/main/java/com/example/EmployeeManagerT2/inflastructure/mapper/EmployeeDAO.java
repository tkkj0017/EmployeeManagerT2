package com.example.EmployeeManagerT2.inflastructure.mapper;

import com.example.EmployeeManagerT2.app.request.employee.PostEmployeeRequest;
import com.example.EmployeeManagerT2.app.request.employee.PutEmployeeRequest;

public interface EmployeeDAO {

    Object getList();

    Object getDetail(String id);

    Object post(PostEmployeeRequest request);

    Object put(PutEmployeeRequest request);

    Object delete(String id);
}
