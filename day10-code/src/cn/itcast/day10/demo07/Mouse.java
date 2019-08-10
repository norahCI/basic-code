package cn.itcast.day10.demo07;

/**
 * @author xuzhipu
 * @create 2019-05-08 13:58
 */
public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("点击");
    }
}
