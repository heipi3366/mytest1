package com.lxk.model;

import java.io.Serializable;

/**
 * Created by lxk on 2017/3/27
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private String sex;


    public Student() {
    }

    public Student(String id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
//        return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + '}';
//        return "test";
    }
}
