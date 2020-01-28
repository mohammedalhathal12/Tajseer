package com.elm.tajseer.tajseer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class controller {
    @Autowired
    private ServiceImpelemtion Service;


    @PostMapping
    public student Addstudent(@RequestBody student student) {
       return Service.addstudent(student);

    }

    @GetMapping
    public List<student> getstudents(student student){
        return Service.getAllStudents();
    }

    @GetMapping("/{id}")
    public student getStudent(@PathVariable("id") int id){
      return Service.getStudent(id);
    }
    @DeleteMapping("/{id}")
    public void deletedStudent(@PathVariable ("id")int id){
         Service.deletedStudent(id);

    }
    @PutMapping("/{id}")
    public student updateStudent(@RequestBody student s,@PathVariable("id")int id){
        return Service.updateStudent(s,id);
    }
}
