package com.elm.tajseer.tajseer;

import java.util.List;
import java.util.Optional;

public  interface Service {
    public student addstudent(student student);

    List<student> getAllStudents();
   public student getStudent(int id);
   public void  deletedStudent(int id);
   public student updateStudent(student student,int id);

}


