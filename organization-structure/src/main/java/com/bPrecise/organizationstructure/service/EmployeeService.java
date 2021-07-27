package com.bPrecise.organizationstructure.service;

import com.bPrecise.organizationstructure.model.Employee;
import com.bPrecise.organizationstructure.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
