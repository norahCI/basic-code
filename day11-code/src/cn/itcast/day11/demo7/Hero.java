package cn.itcast.day11.demo7;

/**
 * @author xuzhipu
 * @create 2019-05-08 17:07
 */
public class Hero {
    private String name;
    private Skill skill;

    public Hero() {
    }
    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

   public void sss(){
       System.out.println("我是"+name+"然后");
       skill.use();

   }
}
