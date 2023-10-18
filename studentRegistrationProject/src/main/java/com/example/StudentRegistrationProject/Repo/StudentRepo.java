package com.example.StudentRegistrationProject.Repo;

import com.example.StudentRegistrationProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
}