package com.itheima.demo04.runnable;

/**
 * @author xuzhipu
 * @create 2019-05-22 16:05
 */
public class RunnableImpl implements Runnable{
    //1.创建一个Runnable接口的实现类
    @Override
    public void run() {
        //2.在实现类中重写Runnable接口的run方法,设置线程任务

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
