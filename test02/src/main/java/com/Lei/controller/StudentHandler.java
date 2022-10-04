package com.Lei.controller;

import com.Lei.entity.Student;
import com.Lei.repository.impl.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepositoryImpl studentRepository;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", studentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student", studentRepository.findById(id));
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
        return "redirect:/student/index";
    }

    @PostMapping("/save")
    public String save( Student student) {
        studentRepository.save(student);
        return "redirect:/student/index";
    }
    @PostMapping("/update") 
    public String update( Student student) {
        studentRepository.save(student);
        return "redirect:/student/index";
    }
}
