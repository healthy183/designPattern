package com.kang.design.interpreter.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/16
 */

public class MainRun {

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<String>();
        //三个正确的，三个错误的
        inputList.add("1+2+3+4+5+6+7+8+9");
        inputList.add("1-2+3-4+5-6+7-8+9");
        inputList.add("9");
        inputList.add("-1+2+3+5");
        inputList.add("1*2");
        inputList.add("11+2+3+9");
        GrammarParser grammarParser = new GrammarParser();//语法分析器
        for (String input : inputList) {
            Context context = new Context(input.toCharArray());
            try {
                grammarParser.parse(context);//语法分析器会调用解释器解释表达式
                System.out.println(input + "=" + context.getResult());
            } catch (Exception e) {
                System.out.println("语法错误，请输入正确的表达式！");
            }
        }
    }
}
