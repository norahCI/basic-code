package com.itheima.demo02.TryCatch;

import java.io.IOException;

/**
 * @author xuzhipu
 * @create 2019-05-21 17:11
 * try...catch:异常处理的第二种方式,自己处理异常
 *     格式:
 *         try{
 *             可能产生异常的代码
 *         }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *             异常的处理逻辑,异常异常对象之后,怎么处理异常对象
 *             一般在工作中,会把异常的信息记录到一个日志中
 *         }
 *         ...
 *         catch(异常类名 变量名){
 *
 *         }
 *     注意:
 *         1.try中可能会抛出多个异常对象,那么就可以使用多个catch来处理这些异常对象
 *         2.如果try中产生了异常,那么就会执行catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch之后的代码
 *           如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("aaa");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("后缀名不对");

        }
        System.out.println("后续代码");
    }
    private static void readFile(String s) throws IOException {
       /* if(!"C:\\a.txt".equals(s)){
            throw new FileNotFoundException("没有找到该路径");  //编译期异常,必须要声明.
        }*/
        if(!s.endsWith(".txt")){
            throw new IOException("后缀名不对");
        }

        System.out.println("打开该文件");
    }
}
