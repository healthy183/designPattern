package com.kang.design.flyweight.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class MainRun {

    public static void main(String[] args) {
        HeroManager heroManager = HeroManager.getInstance();
        Role role = new Role(heroManager.getHero("hum"));
        role.kill();
        Role ud = new Role(heroManager.getHero("ud"));
        ud.kill();

        Role ud2 = new Role(heroManager.getHero("ud"));
        ud.kill();
    }

}
