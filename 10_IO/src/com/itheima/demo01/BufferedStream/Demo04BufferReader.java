package com.itheima.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xuzhipu
 * @create 2019-05-27 15:20
 */
public class Demo04BufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("10_IO/b.txt");
        BufferedReader br = new BufferedReader(fr);
        int len =0;
        char[] chars = new char[1024];
        while ((len=br.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

    }
}
