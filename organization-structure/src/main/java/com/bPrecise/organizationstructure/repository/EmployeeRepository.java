package com.bPrecise.organizationstructure.repository;

import com.bPrecise.organizationstructure.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee , String> {
}
