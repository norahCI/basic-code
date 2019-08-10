package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author xuzhipu
 * @create 2019-05-12 14:21
 * 特点:
 *      1.无序
 *      2.没有索引 不能使用普通for循环  可以使用迭代器  增强for
 *      3.不可重复
 *      4.hashset 底层为 hash算法, 查询快
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("h");
        set.add("g");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("b");
        set.add("a");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println(set);
    }
}
