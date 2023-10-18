package com.sunq.strategy;

public class TransHandler {

    private ValidateStrategy validateStrategy;

    public TransHandler(ValidateStrategy validateStrategy) {
        this.validateStrategy = validateStrategy;
    }

    public void doTrans(TradeData data) {
        boolean validated = validateStrategy.validate(data);
        if (!validated) {
            System.out.println("验证失败，交易返回");
            return;
        }
        System.out.println("验证通过");
        // do something ...
        System.out.println("交易完成");
    }
}
