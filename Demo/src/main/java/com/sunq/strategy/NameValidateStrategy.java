package com.sunq.strategy;

public class NameValidateStrategy implements ValidateStrategy {
    @Override
    public boolean validate(TradeData data) {
        return data.getPayAcctName().length() < 3;
    }
}
