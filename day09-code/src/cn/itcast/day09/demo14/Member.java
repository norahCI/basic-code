package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xuzhipu
 * @create 2019-05-07 17:11
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public void openRed(ArrayList<Double> list){
        if(list == null){
            System.out.println("余额不足");
        }else {
            Random random = new Random();
            int i = random.nextInt(list.size()); //随机一个下标
            Double remove = list.remove(i);   //移除并且获取值
            double leftMoney = getLeftMoney();
            setLeftMoney(remove+leftMoney);  //金额相加

        }

    }

}
