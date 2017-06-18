package com.kang.design.memento.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {
        Soul soulA = new Soul();
        Person personA = new Person("看守所人员A");
        personA.addStory("aStory1");
        soulA.pullAwayMemory(personA);
        personA.addStory("aStory2");
        List<String> list =  personA.getStoryList();
        log.info(list.toString());
        soulA.forceFixMemory(personA);
        List<String> list2 =  personA.getStoryList();
        log.info(list2.toString());
    }
}
