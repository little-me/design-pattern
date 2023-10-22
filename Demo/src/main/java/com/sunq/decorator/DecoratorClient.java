package com.sunq.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        NoRule noRule = new SeqNoRule();
        noRule = new DateNoRule(noRule);
        noRule = new AdmdivNoRule(noRule);
        System.out.println(noRule.genNo());
    }
}
