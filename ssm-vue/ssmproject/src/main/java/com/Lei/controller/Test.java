package com.Lei.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    //    @GetMapping("/user")
//    @ResponseBody
//    public User test() {
//        return new User("tom", 12);
//    }
//
//    static class User {
//
//        String username;
//        Integer age;
//
//        public User(String username, Integer age) {
//            this.username = username;
//            this.age = age;
//        }
//
//        public String getUsername() {
//            return username;
//        }
//
//        public void setUsername(String username) {
//            this.username = username;
//        }
//
//        public Integer getAge() {
//            return age;
//        }
//
//        public void setAge(Integer age) {
//            this.age = age;
//        }
//    }
    @GetMapping("/user")
    public String user() {
    return "hello Lei";
    }
}
