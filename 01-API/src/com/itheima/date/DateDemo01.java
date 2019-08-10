package com.itheima.date;

import java.util.Date;

/**
 * @author xuzhipu
 * @create 2019-05-09 16:25
 *
 * 类 Date 表示特定的瞬间
 * 精确到毫秒
 */
public class DateDemo01 {
    public static void main(String[] args) {
        getCurr();
        getTime();
        getDate();
        getDate(0);

    }
    //获取当前毫秒数
    public static void getCurr(){
        System.out.println(System.currentTimeMillis());
    }
    //获取日期
    public static void getDate(){
        Date date = new Date();
        System.out.println(date);
    }
    //把毫秒转成日期
    public static void getDate(long l){
        Date date = new Date(l);
        System.out.println(date);
    }
    //1970 ~现在的毫秒数
    public static void getTime(){
        Date date = new Date();
        System.out.println(date);
    }



}
