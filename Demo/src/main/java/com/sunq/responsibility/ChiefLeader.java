package com.sunq.responsibility;

public class ChiefLeader extends Handler {
    @Override
    public void handleRequest(String req) {
        System.out.println("总经理同意");
    }
}
