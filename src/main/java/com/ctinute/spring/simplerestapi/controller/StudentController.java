package com.ctinute.spring.simplerestapi.controller;

import java.util.List;

import com.ctinute.spring.simplerestapi.model.Student;
import com.ctinute.spring.simplerestapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<Student> listStudent() {
        return  studentService.getStudents();
    }

    @RequestMapping(value = "/{ten}/{mssv}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void createStudent(@PathVariable String mssv,
                              @PathVariable String ten) {
        Student student = new Student(mssv, ten);
        studentService.createStudent(student);
    }

    @RequestMapping(value = "/{sid}/{ten}/{mssv}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateStudent(@PathVariable Integer sid,
                              @PathVariable String mssv,
                              @PathVariable String ten) {
        Student student = new Student(mssv, ten);
        student.setSid(sid);
        studentService.updateStudent(student);
    }

    @RequestMapping(value = "/{sid}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Integer sid) {
        studentService.deleteStudent(sid);
    }

}
