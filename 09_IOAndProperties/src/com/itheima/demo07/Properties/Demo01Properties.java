package com.itheima.demo07.Properties;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * @author xuzhipu
 * @create 2019-05-27 12:36
 *  java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 *     Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
 *     Properties集合是一个唯一和IO流相结合的集合
 *         可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
 *         可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
 *
 *     属性列表中每个键及其对应值都是一个字符串。
 *         Properties集合是一个双列集合,key和value默认都是字符串
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //demo01();   //从硬盘中读取出来
        //demo02();  //写入到硬盘中

        demo03();
    }
   /* 可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
    void load(InputStream inStream)
    void load(Reader reader)
    参数:
    InputStream inStream:字节输入流,不能读取含有中文的键值对
    Reader reader:字符输入流,能读取含有中文的键值对
    使用步骤:
            1.创建Properties集合对象
            2.使用Properties集合对象中的方法load读取保存键值对的文件
            3.遍历Properties集合
    注意:
            1.存储键值对的文件中,键与值默认的连接符号可以使用=,空格(其他符号)
            2.存储键值对的文件中,可以使用#进行注释,被注释的键值对不会再被读取
            3.存储键值对的文件中,键与值默认都是字符串,不用再加引号*/
    private static void demo03() throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("properties");
        properties.load(fileReader);
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            String val = properties.getProperty(string);
            System.out.println(string+"="+val);
        }


    }

    private static void demo02() throws IOException {
        //创建Properties集合对象
        Properties properties = new Properties();
        //使用setProperty往集合中添加数据
        properties.setProperty("a","A");
        properties.setProperty("b","B");
        properties.setProperty("c","C");
        //2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
        //FileWriter fw = new FileWriter("09_IOAndProperties\\prop.txt");
        FileWriter fileWriter = new FileWriter("properties");  //字节流不能写中文
        //3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        properties.store(fileWriter,"wirter");
        //4.释放资源
        fileWriter.close();


    }

    private static void demo01() {
        //创建Properties集合对象
        Properties properties = new Properties();
        //使用setProperty往集合中添加数据
        properties.setProperty("a","A");
        properties.setProperty("b","B");
        properties.setProperty("c","C");
        //使用stringPropertyNames把Properties集合中的键取出,存储到一个Set集合中
        Set<String> stringSet = properties.stringPropertyNames();
        //遍历Set集合,取出Properties集合的每一个键
        for (String s : stringSet) {
            //使用getProperty方法通过key获取value
            String propertyValue = properties.getProperty(s);
            System.out.println(s+"="+propertyValue);
        }
    }
}
