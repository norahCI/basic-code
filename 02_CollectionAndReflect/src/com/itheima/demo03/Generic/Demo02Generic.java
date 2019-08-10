package com.itheima.demo03.Generic;

/**
 * @author xuzhipu
 * @create 2019-05-11 15:38
 */
public class Demo02Generic {
    public static void main(String[] args) {
        Demo01Generic<String> generic = new Demo01Generic<>();
        generic.setName("张三");
        System.out.println(generic.getName());
        Demo01Generic<Integer> generic1 = new Demo01Generic<>();
        generic1.setName(111);
        System.out.println(generic1.getName());
    }
}
