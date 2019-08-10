package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author xuzhipu
 * @create 2019-05-20 15:48
 *
 * Map集合遍历取值
 * 第一种方式 ,通过 keyset() 找到Key
 */
public class Demo02KeySet {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a","1");
        hashMap.put("b","2");
        hashMap.put("c","3");
        hashMap.put("d","4");
        Set<String> key = hashMap.keySet();
        //通过增强for循环遍历 set集合
/*        for (String s : key) {
            System.out.println(s+"="+hashMap.get(s));
        }*/
        //通过迭代器找值
        Iterator<String> iterator = key.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s+"="+hashMap.get(s));
        }
    }


}
