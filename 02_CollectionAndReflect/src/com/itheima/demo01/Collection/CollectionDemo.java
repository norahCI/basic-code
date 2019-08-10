package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author xuzhipu
 * @create 2019-05-11 12:49
 *
 * 学习Collection 中的公共方法
 *  add() 增
 *  remove()删
 *  size() 元素个数
 *  contiains() 是否包含
 *  clear() 清空集合
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list);// 重写了tostring方法
        list.add("张三");
        list.add("张四");
        list.add("张五");
        list.add("张六");
        list.add("张七");
        System.out.println(list);
        ((ArrayList<String>) list).remove(0); //移除张三
        list.remove("张四");
        System.out.println(list);
        System.out.println("元素个数"+list.size());
        boolean b = list.contains("张七");
        System.out.println("是否存在张七:"+b);
/*        Object[] array = list.toArray();
        String s = Arrays.toString(array);
        System.out.println("转换为数组后"+s);*/
      /*  list.clear();
        System.out.println("清空后:"+list);*/
        Collection<String> list1 = new ArrayList<>();
        list1.add("我自己");
        boolean b1 = list1.addAll(list);
        System.out.println("整组集合添加过来"+list1);


    }
}
