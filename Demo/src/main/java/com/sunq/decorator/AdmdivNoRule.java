package com.sunq.decorator;

public class AdmdivNoRule extends NoRuleDecorator {
    public AdmdivNoRule(NoRule noRule) {
        this.noRule = noRule;
    }

    @Override
    public String genNo() {
        return "430000" + "-" + noRule.genNo();
    }
}
