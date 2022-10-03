package com.Lei.controller;

import com.Lei.entity.Student;
import com.Lei.repository.impl.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepositoryImpl studentRepository;


    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

//    @PostMapping("/save")
//    public void save(Student student) {
//        studentRepository.save(student);
//    }
//
//    @PostMapping("/delete")
//    public void delete(long id) {
//        studentRepository.deleteById(id);
//    }
}
