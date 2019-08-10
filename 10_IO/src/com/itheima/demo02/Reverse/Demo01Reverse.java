package com.itheima.demo02.Reverse;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author xuzhipu
 * @create 2019-05-28 9:33
 *    FileReader可以读取IDE默认编码格式(UTF-8)的文件
 *     FileReader读取系统默认编码(中文GBK)会产生乱码���
 */
public class Demo01Reverse {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("re.txt");
        int len = 0;
        char[] chars = new char[1024];
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
