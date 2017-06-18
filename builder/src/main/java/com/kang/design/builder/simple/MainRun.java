package com.kang.design.builder.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class MainRun {

    public static void main(String[] args) {
        Soul soul = new Soul();
        DoppelgangerBuilder thinBuilder = new ThinBuilder();
        soul.createDoppelganger(thinBuilder,"tom");
    }
}
