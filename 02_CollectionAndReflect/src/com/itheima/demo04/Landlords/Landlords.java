package com.itheima.demo04.Landlords;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author xuzhipu
 * @create 2019-05-12 12:18
 * 斗地主 案例
 * 存储花色:  红桃 黑桃 草花  方片
 * 存储字码: 2-10; JQKA
 *
 *  joker*2
 *
 *
 * 打乱顺序   collections.shuffle(List<?> list)
 * 三个玩家集合 一个底牌集合  List存储
 * 每个玩家取一张牌 用 %3
 *
 *  1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 *
 */
public class Landlords {
    public static void main(String[] args) {
        //1.准备牌
        //准备一个ArrayList集合,泛型为String 存储所有牌p
        ArrayList<String> poker = new ArrayList<>();
        //定义花色 和 数字
        String[] color ={"红","黑","草","方"};
        String[] numbers ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //遍历装进集合
        for (String c : color) {
            for (String n : numbers) {
               poker.add(c+n);  //装入集合中
            }
        }
        poker.add("大王");
        poker.add("小王");
        //2.洗牌
        Collections.shuffle(poker);
        //3.发牌
        //定义三个玩家
        ArrayList<String> gamer1 = new ArrayList<>();
        ArrayList<String> gamer2 = new ArrayList<>();
        ArrayList<String> gamer3 = new ArrayList<>();
        //定义一个底牌
        ArrayList<String> reserve = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>50){   //大于51 存到底牌中
                reserve.add(p);
            }
            if(i%3==0){
                gamer1.add(p);
            }else if(i%3==1){
                gamer2.add(p);
            }else if(i%3==2){
                gamer3.add(p);
            }
        }
        System.out.println("玩家1"+gamer1);
        System.out.println("玩家2"+gamer2);
        System.out.println("玩家3"+gamer3);
        System.out.println("底牌"+reserve);



    }

}
