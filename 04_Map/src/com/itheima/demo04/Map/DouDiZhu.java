package com.itheima.demo04.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author xuzhipu
 * @create 2019-05-21 10:22
 *
 * 斗地主 有序版本
 *
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.排序
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        String[]numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors={"红","黑","草","方"};
        ArrayList<String> arrayList = new ArrayList<>();
        //将牌添加进集合中
        for (String number : numbers) {
            for (String color : colors) {
                arrayList.add(color+number);
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");
        //System.out.println(arrayList);
        //将扑克牌及索引添加到 hashmap中
        HashMap<Integer, String> poker = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            poker.put(i,arrayList.get(i));
        }
        System.out.println("poker"+poker);

        //2.洗牌
        ArrayList<Integer> index = new ArrayList<>();  //创建索引
        for (int i = 0; i < 54; i++) {
            index.add(i);
        }
        System.out.println(index+"索引长度"+index.size());
        for (int i = 0; i < 20; i++) {
            Collections.shuffle(index);
            System.out.println("打乱索引"+index);

        }

        //3.发牌
        ArrayList<Integer> gamer01 = new ArrayList<>();
        ArrayList<Integer> gamer02 = new ArrayList<>();
        ArrayList<Integer> gamer03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();


        for (int i = 0; i < index.size(); i++) {
            Integer s = index.get(i); //获取集合中对应的索引号
            if(i>=50){
                dipai.add(s);
            }
            if(i%3==0){
                gamer01.add(s);
            }else if (i%3==1){
                gamer02.add(s);
            }else {
                gamer03.add(s);
            }
        }
        System.out.println("di:"+dipai+"1:"+gamer01+"2:"+gamer02+"3:"+gamer03);
        //升序排列
        Collections.sort(gamer01);
        Collections.sort(gamer02);
        Collections.sort(gamer03);
        look("刘德华",gamer01,poker);
        look("周润发",gamer02,poker);
        look("周星驰",gamer03,poker);
        look("底牌",dipai,poker);

    }

    //调用看牌的方法
    private static void look(String  name, List<Integer> index,HashMap<Integer, String> map) {

        System.out.print(name);
        for (int i = 0; i < index.size(); i++) {
            String s = map.get(index.get(i));
            System.out.print(s+",");
        }
        System.out.println();



    }

}
