package com.Lei.repository;

import com.Lei.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();

    public Student findById(long id);

    public void save(Student student);

    public void update(Student student);

    public void deleteById(long id);
}
