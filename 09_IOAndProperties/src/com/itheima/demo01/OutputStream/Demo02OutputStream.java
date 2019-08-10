package com.itheima.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author xuzhipu
 * @create 2019-05-25 11:27
 *
 *注意:每次文件都进行了清空.如何进行追加写数据呢
 *
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        byte[] bytes = "你好,黑马程序员".getBytes();
        System.out.println(Arrays.toString(bytes));
        //        - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
        //fos.write(bytes);
        //        - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
        fos.write(bytes,0,6);
        fos.flush();
    }
}
