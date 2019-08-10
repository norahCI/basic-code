package cn.itcast.day09.demo14;

/**
 * @author xuzhipu
 * @create 2019-05-07 16:12
 *
 */

/*用户类*/
public class User {
    private String name; //姓名
    private double leftMoney; //余额

    public User() {
    }

    public User(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("姓名:"+name+"余额:"+leftMoney);
    }
}
