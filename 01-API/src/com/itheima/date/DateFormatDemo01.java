package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xuzhipu
 * @create 2019-05-09 16:53
 */
public class DateFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        demo01(); //格式化日期
        demo02();
    }
    public static void demo01(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        String s = simpleDateFormat.format(date);
        System.out.println("格式化后:"+s);
    }
    public static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = simpleDateFormat.parse("2019-05-09 05:02:27");
        System.out.println("解析后:"+parse);
    }
}
