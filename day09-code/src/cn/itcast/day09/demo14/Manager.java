package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuzhipu
 * @create 2019-05-07 16:18
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, double leftMoney) {
        super(name, leftMoney);
    }                                   //红包总额    份数
    public ArrayList<Double> sendRed(int money,int count){
        double leftMoney = getLeftMoney();
        if(money > leftMoney){
            return  null;
        }else{
            setLeftMoney(leftMoney-money); //设置余额
            money = money*100;  //转换成分
            int m = money/count;  //每份的金额
            int y = money%count;  // 取余
            ArrayList<Double> list = new ArrayList<>();
            for (int i = 0; i < count -1; i++) {
                list.add(m/100.0);  //转换成元
            }
            list.add((m+y)/100.0);  //最后一个人把余额加上
            return  list;
        }

    }

}
