package com.Lei.controller;

import com.Lei.entity.Student;
import com.Lei.entity.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
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

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("name", "tom");
        return "test";
    }

    @GetMapping("/url/{name}")
    @ResponseBody
    public String test(@PathVariable("name") String name) {
        return name;
    }

    @GetMapping("/img")
    public String img(Model model) {
        model.addAttribute("img", "https://github.com/saaaaadk/pic/blob/main/img/better.jpg?raw=true");
        return "test";
    }

    @GetMapping("/eq")
    public String eq(Model model) {
        model.addAttribute("age", 30);
        return "test";
    }

    @GetMapping("switch")
    public String switchTest(Model model) {
        model.addAttribute("gender", "女");
        return "test";
    }

    @GetMapping("/object")
    public String object(HttpServletRequest request) {
        request.setAttribute("request", "this is request");
        request.setAttribute("session", "this is session");
        return "test";
    }

    @GetMapping("/utils")
    public String utils(Model model) {
        model.addAttribute("name", "xiyou");
        model.addAttribute("users", new ArrayList<>());
        model.addAttribute("count", 22);
        model.addAttribute("date", new Date());
        return "test";
    }

//    @GetMapping("/validator")
//    public void validator(@Valid User user, BindingResult bindingResult) {
//        System.out.println("yes");
//        System.out.println(user);
//        if (bindingResult.hasErrors()) {
//            List<ObjectError> errorList = bindingResult.getAllErrors();
//            for (ObjectError e : errorList) {
//                System.out.println(e + "-->" + e.getDefaultMessage());
//            }
//        }
//    }
@GetMapping("/validator")
public void validatorUser(@Valid User user, BindingResult bindingResult){
    System.out.println(user);
    if(bindingResult.hasErrors()){
        List<ObjectError> list = bindingResult.getAllErrors();
        for(ObjectError objectError:list){
            System.out.println(objectError.getCode()+"-"+objectError.getDefaultMessage());
        }
    }
}
}
