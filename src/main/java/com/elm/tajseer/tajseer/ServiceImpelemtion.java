package com.elm.tajseer.tajseer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@org.springframework.stereotype.Service
public  class ServiceImpelemtion implements Service {


    @Autowired
    private Repositry repositry;
    private student s;


    @Override
    public student addstudent(student student) {
       return repositry.save(student);


    }

    @Override
    public List<student> getAllStudents() {
        return repositry.findAll();
}

    @Override
    public student getStudent(int id) {
        return repositry.findById(id).get();
    }
    @Override
     public void deletedStudent(int id){
        repositry.deleteById(id);
    }
    @Override
    public student updateStudent(student student,int id){
        student.setId(id);
        return repositry.save(student);
    }



}
