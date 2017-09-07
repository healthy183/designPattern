package com.kang.design.interpreter.simple.impl;

import com.kang.design.interpreter.simple.Context;
import com.kang.design.interpreter.simple.api.Expression;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/16
 */
//终结符表达式，对应-、+
public class OperatorExpression   implements Expression {

    public void interpreter(Context context) {
        context.setOperator(context.current());//设置运算符
    }
}
