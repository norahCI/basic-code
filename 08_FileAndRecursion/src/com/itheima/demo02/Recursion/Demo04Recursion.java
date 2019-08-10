package com.itheima.demo02.Recursion;

import java.io.File;

/**
 * @author xuzhipu
 * @create 2019-05-24 16:11
 */
public class Demo04Recursion {
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
                System.out.println(f.getAbsolutePath());
            }
        }

    }

}
