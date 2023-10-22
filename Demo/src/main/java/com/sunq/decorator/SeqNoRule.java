package com.sunq.decorator;

public class SeqNoRule implements NoRule {
    @Override
    public String genNo() {
        return "0001";
    }
}
