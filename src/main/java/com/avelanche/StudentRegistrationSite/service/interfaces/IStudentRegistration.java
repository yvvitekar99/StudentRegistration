package com.avelanche.StudentRegistrationSite.service.interfaces;

import com.avelanche.StudentRegistrationSite.model.Student;

import java.util.List;

public interface IStudentRegistration  {
    public Student createStudent(Student student);
    public void  deleteStudent();
    public void listStudent();
}
