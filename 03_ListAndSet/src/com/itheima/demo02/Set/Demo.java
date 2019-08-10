package com.itheima.demo02.Set;

/**
 * @author xuzhipu
 * @create 2019-05-13 11:29
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(add(2,3,4));

    }
    public static int add(int... a ){
        int sum =0;
        for (int i : a) {
            sum+=i;
        }

        return sum;
    }
}
