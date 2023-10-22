package com.sunq.decorator;

public class DateNoRule extends NoRuleDecorator {

    public DateNoRule(NoRule noRule) {
        this.noRule = noRule;
    }

    @Override
    public String genNo() {
        return "20231022" + "-" + noRule.genNo();
    }
}
