package com.itheima.demo01.getName;

/**
 * @author xuzhipu
 * @create 2019-05-22 11:29
 *
 *  获取线程的名称:
 *         1.使用Thread类中的方法getName()
 *             String getName() 返回该线程的名称。
 *         2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
 *             static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("true = " + "你好");
        System.out.println("\"阿\" = " + "阿");
        //System.out.println(getName());
        System.out.println(Thread.currentThread().getName());

    }
}
