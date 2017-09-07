package com.kang.design.interpreter.simple.impl;

import com.kang.design.interpreter.simple.Context;
import com.kang.design.interpreter.simple.api.Expression;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/16
 */

public class NumberExpression  implements Expression {
    @Override
    public void interpreter(Context context) {
        //设置操作数
        Integer operateNumber = Integer.valueOf(String.valueOf(context.current()));
        if (context.getOperateNumbers().size() == 0) {
            context.setLeftOperateNumber(operateNumber);
            context.setResult(operateNumber);
        }else {
            context.setRightOperateNumber(operateNumber);
            Expression expression = new ArithmeticExpression();//转换成算数表达式
            expression.interpreter(context);
        }
    }
}
