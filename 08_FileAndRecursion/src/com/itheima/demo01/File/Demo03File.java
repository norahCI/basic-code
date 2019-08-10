package com.itheima.demo01.File;

import java.io.File;

/**
 * @author xuzhipu
 * @create 2019-05-24 9:40
 * /*
 *     File类获取功能的方法
 *         - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 *         - public String getPath() ：将此File转换为路径名字符串。
 *         - public String getName()  ：返回由此File表示的文件或目录的名称。
 *         - public long length()  ：返回由此File表示的文件的长度。
 *
 *  注意:
 *           API中说明：length()，表示文件的长度。但是File对象表示目录，则返回值未指定。
 *           如果路径错误,则length为0.所以要先判断是否存在
 */
public class Demo03File {
    public static void main(String[] args) {
        File file = new File("D:\\黑马57\\基础\\资料\\Java基础第二部分课程资料\\day08\\code\\08_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\Demo03File.java");
        File file1 = file.getAbsoluteFile();
        System.out.println("getAbsoluteFile:"+file1);
        String path = file.getPath();
        System.out.println("getPath:"+path);
        String name = file.getName();
        System.out.println("name:"+name);
        long length = file.length();
        System.out.println("length:"+length);
    }
}
