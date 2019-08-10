package com.itheima.integer;

/**
 * @author xuzhipu
 * @create 2019-05-11 10:57
 * 自动装箱和自动拆箱(手动)
 *
 * 基本数据类型转换成包装类  装箱
 * 包装类转换成基本数据类型  拆箱
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱
        Integer integer = new Integer(1);
        Integer integer1 = new Integer("1");
        Integer integer2 = Integer.valueOf(1);
        Integer integer3 = Integer.valueOf("100");
        //拆箱
        int i = integer.intValue();



    }



}
