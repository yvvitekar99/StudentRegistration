package com.avelanche.StudentRegistrationSite.service.implemenatation;

import com.avelanche.StudentRegistrationSite.model.Student;
import com.avelanche.StudentRegistrationSite.repository.StudentRepository;
import com.avelanche.StudentRegistrationSite.service.interfaces.IMarks;
import com.avelanche.StudentRegistrationSite.service.interfaces.IStudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class StudentRegistration implements IStudentRegistration {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        if(isAlreadyexist(student.getAadharid())){
            return null;
        }
        IMarks marks;

        student.setId(student.getAadharid());
        String age22=setage(student.getDob());
        student.setAge(age22);
        student.setMarks(marks.totalMarks(student));
       return studentRepository.save(student);

    }

    private boolean isAlreadyexist(String aadharid){
        Optional <Student>  exictingStudent = studentRepository.findById(aadharid);
        return Objects.isNull(exictingStudent);
    }


    public void deleteStudent()
    {
        studentRepository.deleteAll();


    }

    public void listStudent()
    {
        studentRepository.findAll();


    }

    public  LocalDate dateInput(String userInput) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(userInput, dateFormat);



        return date;
    }

    public  String setage(String age)
    {



        LocalDate birthday = dateInput(age);
        LocalDate current= LocalDate.now();
        Period age1= Period.between(birthday,current);
        //System.out.println(age1.getYears());
        return String.valueOf(age1.getYears());
    }



}
