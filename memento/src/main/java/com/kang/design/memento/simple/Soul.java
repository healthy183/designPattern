package com.kang.design.memento.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class Soul {

    private Map<Person, Memory> memoryMap = new HashMap<Person, Memory>();

    //抽离或者说搜集一个人的记忆
    public void pullAwayMemory(Person person){
        memoryMap.put(person, person.getMemory());
    }

    //强行将一个人的记忆固定在某一刻
    public void forceFixMemory(Person person){
        if (memoryMap.containsKey(person)) {
            person.setMemory(memoryMap.get(person));
        }
    }

}
