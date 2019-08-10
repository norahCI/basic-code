package com.itheima.demo01.getName;

/**
 * @author xuzhipu
 * @create 2019-05-22 11:28
 * 获取线程的名称:
 */
public class Demo01ThreadGetName {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());  //获取main方法的对象名

    }
}
