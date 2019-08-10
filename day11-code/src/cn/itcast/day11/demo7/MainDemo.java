package cn.itcast.day11.demo7;

/**
 * @author xuzhipu
 * @create 2019-05-08 17:11
 */
public class MainDemo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");

        Skill s = new Skill() {
            @Override
            public void use() {
                System.out.println("匿名对象");
            }
        };
        hero.setSkill(s);


        hero.sss();

    }

}
