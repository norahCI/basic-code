package com.itheima.demo05.Collections;

/**
 * @author xuzhipu
 * @create 2019-05-14 10:18
 */
public class Persion implements Comparable<Persion>{
    private String name;
    private int age;

    public Persion() {
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Persion o) {
        return this.age-o.getAge();

    }
}
