package com.itheima.demo04.MyException;

/**
 * @author xuzhipu
 * @create 2019-05-22 10:09
 *  * 自定义异常: 用户名存在时,注册异常
 */
public class Demo01RegisterException {
    public static void main(String[] args)  {
        String u ="a";
        registers(u);

    }

    private static void registers(String u)  {
        String[] arr = {"a","b","c"};
        for (String s : arr) {
            if(s==u){
                try {
                    throw new registerException("用户名存在");
                } catch (registerException e) {
                    e.printStackTrace();
                    return;    //需要return跳出,否则,代码还是继续执行
                }

            }
        }
        System.out.println("注册成功了");

    }

}
