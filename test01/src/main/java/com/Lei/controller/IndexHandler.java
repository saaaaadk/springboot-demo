package com.Lei.controller;

import com.Lei.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexHandler {
    @GetMapping("/index")
    public String index(Model model) {
        System.out.println("index..");
        List<Student> studentList = null;
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "张三", 22));
        studentList.add(new Student(2, "李四", 23));
        studentList.add(new Student(3, "王五", 24));
        model.addAttribute("list", studentList);
        return "index";
    }

    @GetMapping("/index2")
    public String index2(Map<String, String> map) {
        map.put("name", "xixi");
        return "index";
    }

    @GetMapping("/index3")
    public String index3(Map<String, Boolean> map) {
        map.put("flag", true);
        return "index";
    }
}
