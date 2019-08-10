package com.itheima.demo04.Print;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.SQLOutput;

/**
 * @author xuzhipu
 * @create 2019-05-28 10:51
 *    可以改变输出语句的目的地(打印流的流向)
 *     输出语句,默认在控制台输出
 *     使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
 *         static void setOut(PrintStream out)
 *           重新分配“标准”输出流。
 */
public class Demo01Print {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("a.txt");
        System.setOut(printStream);
        System.out.println("你好你好你好你好");
    }
}
