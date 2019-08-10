package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author xuzhipu
 * @create 2019-05-20 16:51
 * 使用Map集合统计字符串中,每个字符出现的次数
 *
 */
public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray(); //将字符串转换成字符数组

        for (char c : chars) {
            boolean k = hashMap.containsKey(c); //查询是否存在
            if(k){
                hashMap.put(c,hashMap.get(c)+1); //如果存在,将值+1
            }else { //如果key不存在
                hashMap.put(c,1);
            }
        }
        System.out.println(hashMap);
    }
}
