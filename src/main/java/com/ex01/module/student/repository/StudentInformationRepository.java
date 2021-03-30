package com.ex01.module.student.repository;

import com.ex01.module.student.model.StudentInformationModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInformationRepository extends MongoRepository<StudentInformationModel, String> {
//    @Query("{'name': ?0}")
//    Optional<StudentInformationModel> findByCode(String name);
}