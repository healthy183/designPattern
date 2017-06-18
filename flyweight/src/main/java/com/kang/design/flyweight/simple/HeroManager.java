package com.kang.design.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class HeroManager {

    private  static Map<String, Hero> heroMap;
    private static final HeroManager heroManager = new HeroManager();

    private HeroManager(){
        heroMap = new HashMap<>();
    }

    public static  HeroManager getInstance(){
        return  heroManager;
    };

    //该方法提供共享功能
    public Hero getHero(String name){
        Hero hero = heroMap.get(name);
        if (hero == null) {
            if (name.equals("hum")) {
                hero = new HumHero(name);
            }else if (name.equals("ud")) {
                hero = new UdHero(name);
            }
            heroMap.put(name, hero);
        }
        return hero;
    }

}
