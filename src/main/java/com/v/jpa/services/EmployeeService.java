package com.v.jpa.services;

import com.v.jpa.dtos.EmployeeDto;

import java.util.List;

public interface EmployeeService {


    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployeeById(Long id);

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);

}
