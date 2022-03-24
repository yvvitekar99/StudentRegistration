package com.avelanche.StudentRegistrationSite.service.implemenatation;
import com.avelanche.StudentRegistrationSite.model.Student;
import com.avelanche.StudentRegistrationSite.service.interfaces.IMarks;

import java.util.HashMap;


public class Marks implements IMarks
{

    @Override
    public HashMap totalMarks(Student student)
    {
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("math",student.getMath());
        marks.put("social",student.getSocial());
        marks.put("eng",student.getEng());
        marks.put("phy",student.getPhy());
        marks.put("chem",student.getChem());
        return marks;



    }




}
/*
 private int math;
    private int social;
    private int eng;
    private int phy;
    private int chem;
    private int total;

 */
