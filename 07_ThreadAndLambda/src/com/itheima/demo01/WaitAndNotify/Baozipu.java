package com.itheima.demo01.WaitAndNotify;

/**
 * @author xuzhipu
 * @create 2019-05-23 15:57
 *  生产者(包子铺)类:是一个线程类,可以继承Thread
 * 	设置线程任务(run):生产包子
 * 	对包子的状态进行判断
 * 	true:有包子
 * 		包子铺调用wait方法进入等待状态
 * 	false:没有包子
 * 		包子铺生产包子
 * 		增加一些趣味性:交替生产两种包子
 * 			有两种状态(i%2==0)
 * 		包子铺生产好了包子
 * 		修改包子的状态为true有
 * 		唤醒吃货线程,让吃货线程吃包子
 *
 * 	注意:
 * 	    包子铺线程和包子线程关系-->通信(互斥)
 * 	    必须同时同步技术保证两个线程只能有一个在执行
 * 	    锁对象必须保证唯一,可以使用包子对象作为锁对象
 * 	    包子铺类和吃货的类就需要把包子对象作为参数传递进来
 * 	        1.需要在成员位置创建一个包子变量
 * 	        2.使用带参数构造方法,为这个包子变量赋值
 */
public class Baozipu implements Runnable{
    private Baozi bz;


    public Baozipu(Baozi bz) {
        this.bz = bz;
    }
    int count =0;
    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.isFlag()==true) {  //有包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count%2==0){
                    bz.setPi("薄皮");
                    bz.setXian("牛肉");
                    bz.setFlag(true);

                }else if(count%2==1){
                    bz.setPi("冰皮");
                    bz.setXian("韭菜");
                    bz.setFlag(true);

                }
                count++;
                System.out.println("正在制作"+bz.getPi()+bz.getXian()+"的包子....");
                try {
                    Thread.sleep(1000);
                    bz.notify();
                    System.out.println("客官,你的包子好了,可以吃了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
