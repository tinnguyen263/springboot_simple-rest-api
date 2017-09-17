package com.ctinute.spring.simplerestapi.services;

import com.ctinute.spring.simplerestapi.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
    public Student getStudent(Integer sid);
    public void createStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Integer sid);
}
