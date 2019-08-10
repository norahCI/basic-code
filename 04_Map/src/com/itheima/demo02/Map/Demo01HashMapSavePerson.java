package com.itheima.demo02.Map;

import java.util.HashMap;

/**
 * @author xuzhipu
 * @create 2019-05-20 16:28
 * HashMap 存储自定义类型的键值
 *  注意: 自定义类型做K时,必须重写 equals() 和hashCode() 方法,避免出现重复
 */
public class Demo01HashMapSavePerson {

    public static void main(String[] args) {
        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("张三",10),"a");
        hashMap.put(new Person("张三",20),"b");
        hashMap.put(new Person("张三",10),"c");
        hashMap.put(new Person("张三",30),"d");
        System.out.println(hashMap);
    }
}
