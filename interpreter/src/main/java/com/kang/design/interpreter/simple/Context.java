package com.kang.design.interpreter.simple;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/16
 */
@Getter
public class Context {

    @Setter
    private int result;//结果

    private int index;//当前位置

    private int mark;//标志位

    private char[] inputChars;//输入的字符数组

    private List<Integer> operateNumbers = new ArrayList<Integer>(2);//操作数

    @Setter
    private char operator;//运算符

    public Context(char[] inputChars) {
        super();
        this.inputChars = inputChars;
    }

    public boolean hasNext(){
        return index != inputChars.length;
    }

    public char next() {
        return inputChars[index++];
    }

    public char current(){
        return inputChars[index];
    }

    public void setLeftOperateNumber(int operateNumber) {
        this.operateNumbers.add(0, operateNumber);
    }

    public void setRightOperateNumber(int operateNumber) {
        this.operateNumbers.add(1, operateNumber);
    }

    public void mark(){
        mark = index;
    }

    public void reset(){
        index = mark;
    }
}
