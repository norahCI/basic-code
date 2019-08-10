package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author xuzhipu
 * @create 2019-05-11 15:11
 * 增强for循环, 实现原理是迭代器,只能在 collection 或者 数组 适用
 */
public class ForeachDemo {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张4");
        list.add("张5");
        list.add("张6");
        for(String string:list){
            System.out.println(string);
        }

    }
}
