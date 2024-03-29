package com.itheima.demo03.FileFilter;

        import java.io.File;

/**
 * @author xuzhipu
 * @create 2019-05-24 16:11
 *
需求:
遍历c:\\abc文件夹,及abc文件夹的子文件夹
只要.java结尾的文件
c:\\abc
c:\\abc\\abc.txt
c:\\abc\\abc.java
c:\\abc\\a
c:\\abc\\a\\a.jpg
c:\\abc\\a\\a.java
c:\\abc\\b
c:\\abc\\b\\b.java
c:\\abc\\b\\b.txt
我们可以使用过滤器来实现
在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器
File[] listFiles(FileFilter filter)
java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器。
作用:用来过滤文件(File对象)
抽象方法:用来过滤文件的方法
boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
参数:
File pathname:使用ListFiles方法遍历目录,得到的每一个文件对象
File[] listFiles(FilenameFilter filter)
java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
作用:用于过滤文件名称
抽象方法:用来过滤文件的方法
boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
参数:
File dir:构造方法中传递的被遍历的目录
String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称
注意:
两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则 *  练习:
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
public class Demo01Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\个人资料\\许之璞简历");
        getAllFile(file);
    }
    //获取文件夹中的文件
    private static void getAllFile(File file) {
        FileFilterImpl fileFilter = new FileFilterImpl();//传递过滤器对象
        File[] files = file.listFiles(fileFilter);  //获取表示的目录中的文件。
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                // if(f.toString().toLowerCase().endsWith(".jpg")){

                System.out.println(f.getAbsolutePath());
            }
        }
    }

}


