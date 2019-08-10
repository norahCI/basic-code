package com.itheima.demo03.Map;

import java.util.LinkedHashMap;

/**
 * @author xuzhipu
 * @create 2019-05-20 16:40
 *      LinkedHashMap<K,V> extend  HashMap
 *        LinkedHashMap集合的特点:
 *             1.底层hash表+链表
 *                 hash表: JDK1.8之前: 数组+链表, JDK1.8及之后: 数组+链表或 数组+红黑树(链表长度超过8个)
 *             2.LinkedHashMap是有序的集合
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c","1");
        linkedHashMap.put("a","1");
        linkedHashMap.put("b","1");
        linkedHashMap.put("d","1");
        System.out.println(linkedHashMap);
    }
}
