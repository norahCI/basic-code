package com.itheima.demo02.setName;

/**
 * @author xuzhipu
 * @create 2019-05-22 12:32
 */
public class Demo02ThreadSetName {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("nihao");//第一种
        myThread.start();
       new MyThread("新名字").start(); //第二种


    }
}
