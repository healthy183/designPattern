package com.kang.design.builder.simple;

import lombok.Data;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
@Data
public class Doppelganger {

    private String name;

    private String body;

    private String head;

    private String leftArm;

    private String leftHand;

    private String rightArm;

    private String rightHand;

    private String leftFoot;

    private String leftLeg;

    private String rightFoot;

    private String rightLeg;

    public Doppelganger(String name) {
        super();
        this.name = name;
    }
}
