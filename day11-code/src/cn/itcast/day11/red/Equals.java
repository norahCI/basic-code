package cn.itcast.day11.red;

import java.util.Objects;

/**
 * @author xuzhipu
 * @create 2019-05-09 15:54
 */
public class Equals {

    public static void main(String[] args) {
        String a =null ;
        String b ="a";
       // System.out.println(a.equals(b));  //空是不能调用方法的
        System.out.println(Objects.equals(a,b));








    }
}
