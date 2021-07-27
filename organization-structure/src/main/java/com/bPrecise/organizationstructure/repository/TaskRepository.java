package com.bPrecise.organizationstructure.repository;

import com.bPrecise.organizationstructure.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}
