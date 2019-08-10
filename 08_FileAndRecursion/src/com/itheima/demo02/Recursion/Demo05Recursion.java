package com.itheima.demo02.Recursion;

import java.io.File;

/**
 * @author xuzhipu
 * @create 2019-05-24 16:11
 *
 *  练习:
 *         递归打印多级目录
 *     需求:
 *         遍历c:\\abc文件夹,及abc文件夹的子文件夹
 *         只要.jpg结尾的文件
 *         c:\\abc
 *         c:\\abc\\abc.txt
 *         c:\\abc\\abc.java
 *         c:\\abc\\a
 *         c:\\abc\\a\\a.jpg
 *         c:\\abc\\a\\a.java
 *         c:\\abc\\b
 *         c:\\abc\\b\\b.java
 *         c:\\abc\\b\\b.txt
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\个人资料\\许之璞简历");
        getAllFile(file);
    }
//获取文件夹中的文件
    private static void getAllFile(File file) {

        File[] files = file.listFiles();  //获取表示的目录中的文件。
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                if(f.toString().toLowerCase().endsWith(".jpg")){

                    System.out.println(f.getAbsolutePath());
                }
            }
        }

    }

}
