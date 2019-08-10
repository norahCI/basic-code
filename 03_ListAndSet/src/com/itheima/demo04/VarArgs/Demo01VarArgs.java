package com.itheima.demo04.VarArgs;

/**
 * @author xuzhipu
 * @create 2019-05-13 11:35
 *
 * 可变参数
 * 前提:
 *      方法的参数类型已经确定,参数的个数不确定
 * 格式:
 *       定义方法时使用
 *       修饰符 返回值类型 方法名(数据类型... 变量名){
 *
 *       }
 *  原理:
 *          底层是数组,根据传递参数的个数不同,会创建不同长度的数组,来存储这些参数.
 *
 */
public class Demo01VarArgs {
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
