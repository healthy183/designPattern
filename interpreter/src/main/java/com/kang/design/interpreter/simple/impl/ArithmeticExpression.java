package com.kang.design.interpreter.simple.impl;

import com.kang.design.interpreter.simple.Context;
import com.kang.design.interpreter.simple.api.Expression;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/16
 */
//算数表达式（非终结符表达式，对应arithmetic）
public class ArithmeticExpression implements Expression {
    @Override
    public void interpreter(Context context) {
        context.setResult(getResult(context));
        context.getOperateNumbers().clear();
        context.setLeftOperateNumber(context.getResult());
    }

    private int getResult(Context context) {
        int result = 0;
        switch (context.getOperator()) {
            case '+':
                result = context.getOperateNumbers().get(0) + context.getOperateNumbers().get(1);
                break;
            case '-':
                result = context.getOperateNumbers().get(0) - context.getOperateNumbers().get(1);
                break;
            default:
                break;
        }
        return result;
    }
}
