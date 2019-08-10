package com.itheima.demo01.Exception;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xuzhipu
 * @create 2019-05-21 15:23
 *
 * java.lang.Throwable类是 Java 语言中所有错误或异常的超类
 *          Exception 编译期异常
 *              RuntimeException 是运行期异常
 *          Error:错误
 */
public class Demo01Exception {
    public static void main(String[] args) throws ParseException {
        //编译期异常
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        /*try {    //解决方式1  :try catch
            Date parse = format.parse("199903-03");
        } catch (ParseException e) {
            System.out.println("传输错误");
            e.printStackTrace();
        }
        System.out.println("还在运行中");*/

  /*      Date parse = format.parse("199903-03");  //解决方式2. throws抛出
        System.out.println("....");*/

        //运行期异常
       // run();
        error();


    }

    //运行期异常

    private static void run() {
        char[] a= {1,2,3};
        try {
            //可能会出现异常的代码
            System.out.println(a[3]);

        } catch (Exception e) {
            //异常的处理逻辑
            e.printStackTrace();
        }
        System.out.println("...");

    }

    //错误
    private static void error() {
        int[] arr = new int[1024*1024*1024];
        System.out.println("内存溢出...");
    }
}
