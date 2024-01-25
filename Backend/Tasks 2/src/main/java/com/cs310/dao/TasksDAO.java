package com.cs310.dao;

import com.cs310.model.Tasks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TasksDAO extends MongoRepository<Tasks, String>{
	 //  custom methods if needed
}
