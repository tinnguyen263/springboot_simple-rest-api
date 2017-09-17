package com.ctinute.spring.simplerestapi.model;

public class Student {
    private Integer sid;
    private String id;
    private String name;

    public Student() {}

    public Student(String id, String name) {
        this.sid = sid;
        this.id = id;
        this.name = name;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\t - MSSV: " + id;
    }
}
