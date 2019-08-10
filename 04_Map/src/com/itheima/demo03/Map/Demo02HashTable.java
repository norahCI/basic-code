package com.itheima.demo03.Map;

import java.util.Hashtable;

/**
 * @author xuzhipu
 * @create 2019-05-20 16:42
 * 特点:
 * 1.线程安全
 * 2.单线程速度慢
 * 3.被取代了, 但是子类properties 仍然活着 唯一一个和io流相结合的集合
 * 4.k和v都不能为空
 */
public class Demo02HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(null,"1");
        hashtable.put("1",null);
    }
}
