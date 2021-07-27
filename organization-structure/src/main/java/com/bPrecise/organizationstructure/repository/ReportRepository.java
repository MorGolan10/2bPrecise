package com.bPrecise.organizationstructure.repository;

import com.bPrecise.organizationstructure.model.Employee;
import com.bPrecise.organizationstructure.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {
}
