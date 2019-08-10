package cn.itcast.day07.demo3;

/**
 * @author xuzhipu
 * @create 2019-04-29 23:50
 */
public class SendValue {
    public String s = "6";

    public static void main(String[] args) {
        SendValue sv = new SendValue();
        sv.changeValue(sv.s);
        System.out.println(sv.s);
    }

    public void changeValue(String str) {
        s = "10";
    }
}
