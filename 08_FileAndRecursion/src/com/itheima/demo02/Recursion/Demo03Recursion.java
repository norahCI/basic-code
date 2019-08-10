package com.itheima.demo02.Recursion;

/**
 练习:
 使用递归计算1-n之间的积
 */
public class Demo03Recursion {

    public static void main(String[] args) {
        int sum = sum(4);
        System.out.println(sum);
    }
    //n*(n-1)*(n-2)*(n-3)

    private static int sum(int n) {
  /*
        定义方法使用递归计算阶乘
        5的阶乘: 5! = 5*(5-1)*(5-2)*(5-3)*(5-4)=5*4*3*2*1
        递归结束的条件
            获取到1的时候结束
        递归的目的
            获取下一个被乘的数字(n-1)
        方法的参数发生变化
            5,4,3,2,1
     */
        if (n==1){
            //获取到1的时候结束
            return 1;
        }
        //获取下一个被乘的数字(n-1)
        return n*(sum(n-1));



    }
}
