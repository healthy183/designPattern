package com.kang.design.mediator.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/17.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {
        PatternAlliance patternAlliance = new PatternAlliance();
        Student student = new Student("tom",patternAlliance);
        student.changeName("aaa");
        log.info(student.getName());
    }
}
