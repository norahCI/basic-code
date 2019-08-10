package cn.itcast.day11.demo3;

/**
 * @author xuzhipu
 * @create 2019-05-08 15:55
 * 内部类
 */
public class Body {

    public class heart{
        public void jump(){
            System.out.println("邦邦(๑•̀ㅂ•́)و✧");
        }
    }
    public void nei(){
        new heart().jump();
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
