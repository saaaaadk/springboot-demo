package com.Lei.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Data
public class User {
    @NotNull(message = "id cannot be null")
    private long id;
    @Length(min = 2, message = "name's length must be longer than 2 words")
    @NotEmpty(message = "name cannot be null")
    private String name;
    @Min(value = 16, message = "age must be larger than 16")
    private int age;
}
