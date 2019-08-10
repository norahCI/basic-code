package com.itheima.demo01.File;

import java.io.File;

/**
 * @author xuzhipu
 * @create 2019-05-24 10:35
 * File类遍历(文件夹)目录功能
 *         - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。(该层级下的所有文件及文件夹)
 *         - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
 *
 *     注意:
 *         list方法和listFiles方法遍历的是构造方法中给出的目录
 *         如果构造方法中给出的目录的路径不存在,会抛出空指针异常
 *         如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 */
public class Demmo06File {
    public static void main(String[] args) {
        File file = new File("E:\\图库");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
