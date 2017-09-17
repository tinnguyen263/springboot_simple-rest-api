package com.ctinute.spring.simplerestapi.services.impl;

import com.ctinute.spring.simplerestapi.model.Student;
import com.ctinute.spring.simplerestapi.services.StudentService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryStudentService implements StudentService {

    private final List<Student> students = new ArrayList<>();
    private int n = 0;

    @PostConstruct
    private void init() {
        createStudent(new Student("14110203","Nguyen Chanh Tin"));
        createStudent(new Student("14110205","Truong Thanh Tin"));
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student getStudent(Integer sid) {
        for (Student student : students) {
            if (student.getSid().equals(sid))
                return student;
        }
        return null;
    }

    @Override
    public void createStudent(Student student) {
        if(student == null)
            return;
        student.setSid(n);
        students.add(student);
        n++;
    }

    @Override
    public void updateStudent(Student student) {
        for (Student student1 : students) {
            if (student1.getSid().equals(student.getSid())) {
                student1.setName(student.getName());
                student1.setId(student.getId());
                return;
            }
        }
    }

    @Override
    public void deleteStudent(Integer sid) {
        for (int i=0; i<students.size(); i++) {
            if (students.get(i).getSid().equals(sid)) {
                students.remove(i);
                return;
            }
        }
    }
}
