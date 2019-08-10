package com.itheima.demo02.Recursion;

/**
 练习:
 使用递归计算1-n之间的和
 */
public class Demo02Recursion {
    static int sum =0;
    static int i =1;

    public static void main(String[] args) {
        sum(4);
    }

    private static void sum(int n) {
        sum=sum+i;

        if (n==i){
            System.out.println(sum);
            return;
        }
        i++;
        sum(n);
    }
}
