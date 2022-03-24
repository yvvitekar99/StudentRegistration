package com.avelanche.StudentRegistrationSite.repository;


import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.avelanche.StudentRegistrationSite.model.Student;


@Repository
public interface StudentRepository extends MongoRepository <Student, String>
{



}
