package com.sunq.strategy;

public class NoopValidateStrategy implements ValidateStrategy {
    @Override
    public boolean validate(TradeData data) {
        return true;
    }
}
