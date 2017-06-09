package com.kang.design.strategy.strategyFactory.component;

import com.kang.design.strategy.strategyFactory.api.CalPrice;
import com.kang.design.strategy.strategyFactory.factory.CalPriceFactory;
import com.kang.design.strategy.strategyFactory.impl.CommonCalPrice;
import lombok.Getter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
public class Customer {

    @Getter
    private Double totalAmount = 0D;//累计总额
    @Getter
    private Double amount = 0D;//单此总额
    private CalPrice calPrice = new CommonCalPrice();

    //客户购买商品，就会增加它的总额
    public void buy(Double amount){
        this.amount = amount;
        totalAmount += amount;
        /* 变化点，我们将策略的制定转移给了策略工厂，将这部分责任分离出去 */
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }

    //计算客户最终要付的钱
    public Double calLastAmount(){
        return calPrice.calPrice(amount);
    }
}
