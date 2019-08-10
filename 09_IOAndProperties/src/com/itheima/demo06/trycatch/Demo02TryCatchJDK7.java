package com.itheima.demo06.trycatch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author xuzhipu
 * @create 2019-05-27 11:47
 *   JDK7的新特性
 *     在try的后边可以增加一个(),在括号中可以定义流对象
 *     那么这个流对象的作用域就在try中有效
 *     try中的代码执行完毕,会自动把流对象释放,不用写finally
 *     格式:
 *         try(定义流对象;定义流对象....){
 *             可能会产出异常的代码
 *         }catch(异常类变量 变量名){
 *             异常的处理逻辑

 */
public class Demo02TryCatchJDK7 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("TryCatch.txt")) {
            for (int i = 0; i < 10; i++) {
                fw.write("TryCatch测试");
                fw.write("\r\n");
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
