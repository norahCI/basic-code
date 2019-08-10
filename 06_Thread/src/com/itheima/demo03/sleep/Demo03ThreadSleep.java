package com.itheima.demo03.sleep;

/**
 * @author xuzhipu
 * @create 2019-05-22 13:50
 * public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 * 毫秒数结束之后,线程继续执行
 */
public class Demo03ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 60; i > 0; i--) {
            //            //使用Thread类的sleep方法让程序睡眠1秒钟
            Thread.sleep(1000);
            System.out.println("爆炸倒计时" + i);
        }
    }
}



