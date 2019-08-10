package cn.itcast.day06.demo02;

/**
 * @author xuzhipu
 * @create 2019-04-27 15:14
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("品牌"+phone.brank+"价格"+phone.price+"颜色:"+phone.color);
        phone.price=1999.9;
        phone.brank="小米";
        phone.color="深空灰";
        phone.sendMes();
        phone.tel("老王");
    }
}
