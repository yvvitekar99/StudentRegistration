package com.avelanche.StudentRegistrationSite.controller;

import java.util.List;

import com.avelanche.StudentRegistrationSite.service.interfaces.IStudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.avelanche.StudentRegistrationSite.model.Student;
import com.avelanche.StudentRegistrationSite.repository.StudentRepository;

@RestController

public class StudentController
{

	@Autowired
    private IStudentRegistration studentRegistration;


	@PostMapping("/create")
	public Student createStudents(@RequestBody Student student)
	{

		return  studentRegistration.createStudent(student);

	}
	@DeleteMapping ("/delete")
	public void deleteStudents()
	{
		studentRegistration.deleteStudent();
	}

	@GetMapping("/list")
	public void listStudents()
	{
		  studentRegistration.listStudent();

	}
	
	
//	@DeleteMapping ("/delete")
//	public void deleteStudents()
//	{
//		studentRepository.deleteAll();
//	}
//
//	@GetMapping("/list")
//	public List<Student> listStudents()
//	{
//		return studentRepository.findAll();
//	}
}

//(@PathVariable String id )
