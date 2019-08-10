package cn.itcast.day07.demo3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xuzhipu
 * @create 2019-04-27 17:52
 * 随机数游戏
 */
public class Demo01Random {
    public static void main(String[] args) {
        int i = new Random().nextInt(100);

        while (true){
            int s = new Scanner(System.in).nextInt();
            if(i>s){
                System.out.println("小了");
            }else if(i==s){
                System.out.println("恭喜");
                break;
            }else{
                System.out.println("大了");
            }
        }
        System.out.println("结束游戏");

    }



}
