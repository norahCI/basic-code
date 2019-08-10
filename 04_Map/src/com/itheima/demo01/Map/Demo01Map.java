package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuzhipu
 * @create 2019-05-20 11:11
 *java.util
 * 接口 Map<K,V>
 *     Map集合的特点:
 *      1.Map是双列集合, 有<k,v>两个值
 *      2.Map集合中的元素, K 和 V的数据类型 可以相同,也可以不同
 *      3.Map集合中的元素,K不可重复,V可以重复
 *      4.Map集合中的元素,K和V是一一对应的
 *
 *     HashMap<K,V> implement Map接口
 *
 *      HashMap集合的特点:
 *          1.底层hash表,查询速度快
 *              hash表: JDK1.8之前: 数组+链表, JDK1.8及之后: 数组+链表或 数组+红黑树(链表长度超过8个)
 *          2.HashMap是无序的集合
 *
 *
 *      LinkedHashMap<K,V> extend  HashMap
 *        LinkedHashMap集合的特点:
 *             1.底层hash表+链表
 *                 hash表: JDK1.8之前: 数组+链表, JDK1.8及之后: 数组+链表或 数组+红黑树(链表长度超过8个)
 *             2.LinkedHashMap是有序的集合
 *
 *
 *
 *
 *
 */
public class Demo01Map {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        String b = hashMap.put("b", "13");  //返回值为上一个的v
        hashMap.put("a","15");
        hashMap.put("c","16");
        System.out.println(hashMap);

        String a = hashMap.remove("a");
        System.out.println(a);  //删除.  返回值为V

        String a1 = hashMap.get("b");
        System.out.println("获取值"+a1);

        boolean c = hashMap.containsKey("c");
        System.out.println("有没有K为..的存在"+c);


    }


}
