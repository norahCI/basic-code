package com.itheima.demo02.Set;

import java.util.Objects;

/**
 * @author xuzhipu
 * @create 2019-05-13 10:50
 * set集合中存储学生,要求
 *  年龄和姓名一样的,算是一个学生,不能存储
 *  \
 *  原理:
 *      比较两个对象是否相同
 *          1.首先会比较hash地址值,地址值相同的 会调用equals 值,  equals值相同,则判定是同一个对象
 *
 */
public class Student {
    private  String name;
    private  Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
