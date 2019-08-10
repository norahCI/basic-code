package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xuzhipu
 * @create 2019-05-09 17:06
 * 计算一个人出生了多少天
 * 需要知道 两个 日期  转换成毫秒 进行计算
 *
 */
public class DateFormatHomeWork {

    public static void getDay(String s) throws ParseException {
        //获取当前时间 毫秒
        long date = new Date().getTime();
        //获取出生日期;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = simpleDateFormat.parse(s); //转换成date日期
        long birthtime = birth.getTime(); //日期转换成毫秒
        long day = (date  - birthtime)/1000/60/60/24;  //相减后 计算天数
        System.out.println("您来到人间"+day+"天 ("+(day/365)+"年)");
    }

    public static void main(String[] args) throws ParseException {
        getDay("1993-03-08");
    }
}
