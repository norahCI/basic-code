package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author xuzhipu
 * @create 2019-05-20 16:06
 *  * Map集合遍历取值 第二种方式
 *  1. Set<Map.Entry<K,V>>     entrySet()   返回此映射中包含的映射关系的 Set 视图。
 *  2.遍历set集合 获取entry对象
 *  3. 通过getKey() 和 getValue()获取
 *
 */
public class Demo03EntrySet {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a","1");
        hashMap.put("b","2");
        hashMap.put("c","3");
        hashMap.put("d","4");
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("遍历的结果"+ key+"="+value);
        }

    }


}
