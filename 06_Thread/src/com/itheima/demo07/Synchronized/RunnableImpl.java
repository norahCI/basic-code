package com.itheima.demo07.Synchronized;

/**
 * @author xuzhipu
 * @create 2019-05-22 22:43
 *
 *
 * 解决线程安全问题的一种方案:使用同步代码块
 *     格式:
 *         synchronized(锁对象){
 *             可能会出现线程安全问题的代码(访问了共享数据的代码)
 *         }
 *
 *     注意:
 *         1.通过代码块中的锁对象,可以使用任意的对象
 *         2.但是必须保证多个线程使用的锁对象是同一个
 *         3.锁对象作用:
 *             把同步代码块锁住,只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket=100;

    Object object = new Object();
    //设置线程任务:卖票
    @Override
    public void run() {
        //使用死循环,让卖票操作重复执行
        while (true){
            synchronized (object){
                //先判断票是否存在
                if(ticket>0){
                    //提高安全问题出现的概率,让程序睡眠
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    //票存在,卖票 ticket--
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
