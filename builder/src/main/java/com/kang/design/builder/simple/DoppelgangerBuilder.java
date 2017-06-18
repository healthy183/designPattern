package com.kang.design.builder.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public interface DoppelgangerBuilder {

    public void createDoppelganger(String name);

    public void buildBody();

    public void buildHead();

    public void buildLeftArm();

    public void buildLeftHand();

    public void buildRightArm();

    public void buildRightHand();

    public void buildLeftLeg();

    public void buildLeftFoot();

    public void buildRightLeg();

    public void buildRightFoot();

    public Doppelganger getDoppelganger();
}
