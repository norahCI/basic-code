package com.itheima.demo01.list;

import java.util.LinkedList;

/**
 * @author xuzhipu
 * @create 2019-05-12 14:06
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.addFirst("first");
        str.addLast("last");
        System.out.println(str);
        String s = str.removeFirst();
        String s1 = str.removeLast();
        System.out.println("str移除后"+str);
        str.pop();
        System.out.println("pop后"+str);



    }
}
