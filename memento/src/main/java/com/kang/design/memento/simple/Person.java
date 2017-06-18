package com.kang.design.memento.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class Person {

    private String name;

    private List<String> storyList;

    public Person(String name){
        this.name = name;
        storyList = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStoryList() {
        return Collections.unmodifiableList(storyList);
    }

    public void addStory(String history) {
        this.storyList.add(history);
    }

    /* 新增 */

    //获取记忆
    public Memory getMemory(){
        Memory memory = new Memory();
        memory.setStoryList(new ArrayList<String>(storyList));
        return memory;
    }

    //恢复记忆
    public void setMemory(Memory memory){
        storyList = memory.getStoryList();
    }

    /* 新增 */

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer(name + "的记忆：\n");
        for(String memory : storyList){
            stringBuffer.append(memory).append("\n");
        }
        return stringBuffer.toString();
    }
}
