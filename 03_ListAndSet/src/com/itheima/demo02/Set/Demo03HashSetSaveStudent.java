package com.itheima.demo02.Set;

import java.util.HashSet;

/**
 * @author xuzhipu
 * @create 2019-05-13 10:59
 */
public class Demo03HashSetSaveStudent {

    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student("小明", 18);
        Student s2 = new Student("小明", 18);
        Student s3 = new Student("小明", 19);
        System.out.println("s1:hashcode:"+s1.hashCode());
        System.out.println("s2:hashcode:"+s1.hashCode());
        System.out.println("s3:hashcode:"+s1.hashCode());
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        System.out.println(hashSet);
    }
}
