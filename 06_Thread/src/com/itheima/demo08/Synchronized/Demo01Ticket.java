package com.itheima.demo08.Synchronized;

/**
 * @author xuzhipu
 * @create 2019-05-22 22:54
 * 模拟卖票案例
 *     创建3个线程,同时开启,对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl runnable = new RunnableImpl();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        //调用start方法开启多线程
        thread.start();
        thread1.start();
        thread2.start();
    }
}
