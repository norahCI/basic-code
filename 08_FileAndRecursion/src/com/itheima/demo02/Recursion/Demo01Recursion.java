package com.itheima.demo02.Recursion;

import sun.applet.Main;

/**
 * @author xuzhipu
 * @create 2019-05-24 10:58
 *
 *     递归:方法自己调用自己
 *     - 递归的分类:
 *       - 递归分为两种，直接递归和间接递归。
 *       - 直接递归称为方法自身调用自己。
 *       - 间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法。
 *     - 注意事项：
 *       - 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
 *       - 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
 *       - 构造方法,禁止递归
 *     递归的使用前提:
 *         当调用方法的时候,方法的主体不变,每次调用方法的参数不同,可以使用递归
 *
 */
public class Demo01Recursion {
    /*
       构造方法,禁止递归
           编译报错:构造方法是创建对象使用的,一直递归会导致内存中有无数多个对象,直接编译报错
    */
   static int sum = 0;
    public static void main(String[] args) {
        recursion();
    }
    /*
                在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
                11157
                    Exception in thread "main" java.lang.StackOverflowError
             */
    private static void recursion() {
        sum++;
        System.out.println(sum);
        if (sum==10000){
            return;
        }
        recursion();
    }
}
