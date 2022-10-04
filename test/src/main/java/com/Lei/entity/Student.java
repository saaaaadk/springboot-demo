package com.Lei.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private long id;
    private String name;
    private Double score;
    private Date birthday;
}
