package com.itheima.demo02.ThreadPool;

/**
 * @author xuzhipu
 * @create 2019-05-23 17:11
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
