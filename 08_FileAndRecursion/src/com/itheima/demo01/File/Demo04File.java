package com.itheima.demo01.File;

import java.io.File;

/**
 * @author xuzhipu
 * @create 2019-05-24 9:49
 *   File类判断功能的方法
 *         - public boolean exists() ：此File表示的文件或目录是否实际存在。
 *         - public boolean isDirectory() ：此File表示的是否为目录。
 *         - public boolean isFile() ：此File表示的是否为文件。
 *
 *          public boolean isDirectory() ：此File表示的是否为目录。
 *             用于判断构造方法中给定的路径是否以文件夹结尾
 *                 是:true
 *                 否:false
 *         public boolean isFile() ：此File表示的是否为文件。
 *             用于判断构造方法中给定的路径是否以文件结尾
 *                 是:true
 *                 否:false
 *         注意:
 *             电脑的硬盘中只有文件/文件夹,两个方法是互斥
 *             这两个方法使用前提,路径必须是存在的,否则都返回false
 */
public class Demo04File {
    public static void main(String[] args) {
        File file = new File("D:\\黑马57\\基础\\资料\\Java基础第二部分课程资料\\day08\\code\\08_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\Demo03File.java");
        boolean exists = file.exists();
        System.out.println("exists = " + exists);
        if (exists) {
            boolean file1 = file.isFile();
            System.out.println("isFile:"+file1);
            boolean directory = file.isDirectory();
            System.out.println("directory:"+directory);
        }


    }
}
