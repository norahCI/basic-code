package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

/**
 * @author xuzhipu
 * @create 2019-05-24 9:59
 * File类创建删除功能的方法
 *         - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *         - public boolean delete() ：删除由此File表示的文件或目录。
 *         - public boolean mkdir() ：创建由此File表示的目录。
 *         - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        File file = new File("\\s\\s");
        System.out.println("是否存在:"+file.exists());
        System.out.println("获取绝对路径:"+file.getAbsolutePath());

        //creatNewFile(file);
         deleteDemo(file);
        //mkDir(file);
       // mkDirs(file);


    }
    /*
          public boolean mkdir() ：创建单级空文件夹
          public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
          创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
           返回值:布尔值
               true:文件夹不存在,创建文件夹,返回true
               false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
           注意:
               1.此方法只能创建文件夹,不能创建文件
        */
    private static void mkDirs(File file) {
        System.out.println("文件夹创建成功:"+file.mkdirs());
    }

    private static void mkDir(File file) {
        System.out.println("文件夹创建成功:"+file.mkdir());

    }

    /*
       public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
       创建文件的路径和名称在构造方法中给出(构造方法的参数)
       返回值:布尔值
           true:文件不存在,创建文件,返回true
           false:文件存在,不会创建,返回false
       注意:
           1.此方法只能创建文件,不能创建文件夹
           2.创建文件的路径必须存在,否则会抛出异常

       public boolean createNewFile() throws IOException
       createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
    */
    private static void creatNewFile(File file) throws IOException {
        boolean newFile = file.createNewFile();
        System.out.println("创建成功:"+newFile);
        System.out.println("获取绝对路径:"+file.getAbsolutePath());
    }
    /*public boolean delete() ：删除由此File表示的文件或目录。
    此方法,可以删除构造方法路径中给出的文件/文件夹
    返回值:布尔值
            true:文件/文件夹删除成功,返回true
            false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
    注意:
    delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎*/
    private static void deleteDemo(File file) {
        System.out.println("删除成功:"+file.delete());
        System.out.println("是否存在"+file.exists());
    }
}
