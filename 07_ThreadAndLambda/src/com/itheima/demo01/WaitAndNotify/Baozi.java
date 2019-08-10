package com.itheima.demo01.WaitAndNotify;

/**
 * @author xuzhipu
 * @create 2019-05-23 15:54
 *  资源类:包子类
 * 	设置包子的属性
 * 		皮
 * 		陷
 * 		包子的状态: 有 true,没有 false
 */
public class Baozi {
    private String pi;
    private String xian;
    private boolean flag;

    public Baozi() {
    }

    public Baozi(String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
