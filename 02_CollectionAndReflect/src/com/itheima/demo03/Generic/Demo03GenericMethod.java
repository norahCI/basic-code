package com.itheima.demo03.Generic;

/**
 * @author xuzhipu
 * @create 2019-05-11 15:48
 * 含有泛型的方法
 *  定义在返回值前
 */
public class Demo03GenericMethod {

    public static void main(String[] args) {
        new Demo03GenericMethod().getMethod("泛型方法");
        new Demo03GenericMethod().getMethod(1111);
        getMethod2(1111);
    }
    public <M> void getMethod(M m){
        System.out.println(m);
    }
    public static  <M> void getMethod2(M m){
        System.out.println(m);
    }
}
