package com.itheima.demo05.innerClassThread;

/**
 * @author xuzhipu
 * @create 2019-05-22 16:31
 * 匿名内部类方式实现线程的创建
 *
 *     匿名:没有名字
 *     内部类:写在其他类内部的类
 *
 *     匿名内部类作用:简化代码
 *         把子类继承父类,重写父类的方法,创建子类对象合一步完成
 *         把实现类实现类接口,重写接口中的方法,创建实现类对象合成一步完成
 *     匿名内部类的最终产物:子类/实现类对象,而这个类没有名字
 *
 *     格式:
 *         new 父类/接口(){
 *             重复父类/接口中的方法
 *         };
 */
public class Demo01innerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("黑马");
                }
            }
        }.start();

        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("程序员");
                }
            }
        };
        new Thread(r).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("传智播客");
            }
        }).start();

    }

}
