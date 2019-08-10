package com.itheima.demo03.Map.demo05.Debug;

/**
 * @author xuzhipu
 * @create 2019-05-20 17:29
 * F5 进入方法
 * F6 下一行
 * F7跳出方法
 * F8下一个断点
 */
public class Demo01Debug {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
        }
    }
}
