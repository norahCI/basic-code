package com.itheima.integer;

/**
 * @author xuzhipu
 * @create 2019-05-11 11:35
 *
 * 字符串和基本数据类型的相互转换
 */
public class IntegerAndString {
    public static void main(String[] args) {
        int a = 1 ;
        //字符转换字符串
        String s = a+"";
        String s1 = String.valueOf(a);
        String s2 = Integer.toString(a);

        //字符串转换成字符

        int i = Integer.parseInt(s);


    }

}
