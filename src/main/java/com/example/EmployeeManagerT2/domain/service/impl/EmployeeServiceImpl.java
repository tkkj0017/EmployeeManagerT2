package com.example.EmployeeManagerT2.domain.service.impl;

import com.example.EmployeeManagerT2.app.request.employee.PostEmployeeRequest;
import com.example.EmployeeManagerT2.app.request.employee.PutEmployeeRequest;
import com.example.EmployeeManagerT2.app.response.employee.*;
import com.example.EmployeeManagerT2.domain.service.EmployeeService;
import com.example.EmployeeManagerT2.inflastructure.mapper.EmployeeDAO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO dao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public GetEmployeeListResponse getList() {
        final var response = dao.getList();
        return modelMapper.map(response, GetEmployeeListResponse.class);
    }

    @Override
    public GetEmployeeDetailResponse getDetail(String id) {
        final var response = dao.getDetail(id);
        return modelMapper.map(response, GetEmployeeDetailResponse.class);
    }

    public PostEmployeeResponse post(PostEmployeeRequest request) {
        final var response = dao.post(request);
        return modelMapper.map(response, PostEmployeeResponse.class);
    }

    @Override
    public PutEmployeeResponse put(PutEmployeeRequest request) {
        final var response = dao.put(request);
        return modelMapper.map(response, PutEmployeeResponse.class);
    }

    @Override
    public DeleteEmployeeResponse delete(String id) {
        final var reponse = dao.delete(id);
        return modelMapper.map(reponse, DeleteEmployeeResponse.class);
    }
}
