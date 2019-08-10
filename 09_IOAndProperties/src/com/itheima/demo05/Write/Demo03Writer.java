package com.itheima.demo05.Write;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author xuzhipu
 * @create 2019-05-27 11:03
 *    字符输出流写数据的其他方法
 *         - void write(char[] cbuf)写入字符数组。
 *         - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *         - void write(String str)写入字符串。
 *         - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("FileWriter.txt");
        char[] chars ={'a','b','c','d'};
        fw.write(chars);
        fw.flush();
        char[] chars1 ={'a','b','c','d','e','f'};
        fw.write(chars1,4,2);
        fw.flush();
        fw.write("字符串");
        String str = "字符串截取";
        fw.write(str,3,2);
        fw.close();

    }
}
