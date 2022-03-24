package com.avelanche.StudentRegistrationSite.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection = "Students")

public class Student
{
    @Id
    private String id;
    private String aadharid;



    private String dob;
    private String firstName ;
    private  String lastName ;
    private String age;
    private String teacher;
    private HashMap<String,Integer> marks =new HashMap<>();
    private int math;
    private int social;
    private int eng;
    private int phy;
    private int chem;
    private HashMap <String,Integer> Marks;

    public HashMap<String, Integer> getMarks() {
        return Marks;
    }

    public void setMarks(HashMap<String, Integer> marks) {
        Marks = marks;
    }

    Student()
    {

    }

    // Id
    public String getAadharid() {
        return aadharid;
    }

    public void setAadharid(String aadharid) {
        this.aadharid = aadharid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    // birthdate
    public String  getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {return age;}

    public void setAge(String age) {

        this.age = age;
    }


    // basic information

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }



    // Marks

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        marks.put("Math",math);
        this.math=math;
    }

    public int getSocial() {
        return social;
    }

    public void setSocia(int social) {

        marks.put("Social",social);
        this.social=social;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {

        marks.put("Eng",eng);
        this.eng=eng;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {

        marks.put("Phy",phy);
        this.phy=phy;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {

        marks.put("Chem",chem);
        this.chem=chem;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {

        int sum = 0;
        for(Map.Entry<String,Integer> entry : marks.entrySet())
        {
            sum += entry.getValue();
        }
        this.total=sum;
    }



}
