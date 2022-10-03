package com.Lei.repository.impl;

import com.Lei.entity.Student;
import com.Lei.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    public static Map<Long, Student> studentMap = null;

    static {
        studentMap = new HashMap<Long, Student>();
        studentMap.put(1L, new Student(1, "张三", 22));
        studentMap.put(2L, new Student(2, "李四", 23));
        studentMap.put(3L, new Student(3, "王五", 24));
    }

    public Collection<Student> findAll() {
        return studentMap.values();
    }

    public Student findById(long id) {
        return studentMap.get(id);
    }

    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
