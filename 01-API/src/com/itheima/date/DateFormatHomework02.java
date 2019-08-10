package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author xuzhipu
 * @create 2019-05-09 17:35
 * 计算一个人还能活多少天,按照80岁计算
 * 1. 获取出生日期
 * 2.解析成date格式.  datefomat parse
 * 3.转换成毫秒
 * 4. 获取当前时间.
 * 5.转换成毫秒
 * 6.计算活了多久.
 * 7. 80年转换成毫秒.
 * 80年毫秒数 -(当前毫秒-出生毫秒) = 还能活多少毫秒
 *  转换成天
 */
public class DateFormatHomework02 {
    public static void main(String[] args) throws ParseException {
        lastDay("1993.3.8");
    }

    public static void lastDay(String b) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd"); //给定模式
        Date parse = simpleDateFormat.parse(b);  //出生日期转换成日期格式
        long birth = parse.getTime();//出生日期的毫秒数
        long currTime = new Date().getTime();//当前日期的毫秒数
        long total = 2522880000000L; //80年转换成毫秒

        long last = (total - (currTime-birth))/1000/60/60/24;
        System.out.println("你还能活"+last+"天");

    }
}
