package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author xuzhipu
 * @create 2019-05-11 13:24
 * java.util.Iterator 接口: 迭代器(对集合进行遍历)
 * 两个常用方法:
 *       boolean hasNext()
 *           如果仍有元素可以迭代，则返回 true。
 *          E next()
 *               返回迭代的下一个元素。
 * itarator 是接口 无法直接使用,需要使用实现类对象. 获取实现类方法比较特殊,
 * 在 Collection接口中 有 iterator()方法,返回在此collection元素进行迭代的迭代器
 *
 * 使用步骤:
 *  1.iterator()获取 实现类
 *  2.hasNext() 判断是否有元素
 *  3.next() 取出
 */
public class IteratorDemo01 {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张4");
        list.add("张5");
        list.add("张6");
        Iterator<String> iterator = list.iterator();//获取迭代器
        while (iterator.hasNext()){  //判断是否有下一个元素
            String next = iterator.next(); //取出,并把指针向后移动一位
            System.out.println(next);

        }
    }
}
