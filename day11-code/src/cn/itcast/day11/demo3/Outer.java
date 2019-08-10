package cn.itcast.day11.demo3;

import java.sql.SQLOutput;

/**
 * @author xuzhipu
 * @create 2019-05-08 16:20
 *
 * 局部内部类
 */
public class Outer {
    public void  method(){
        class Inner{   //局部内部类
            public void in(){
                System.out.println("内部类运行中...");
            }
        }
        Inner inner = new Inner();
        inner.in();
    }
}
