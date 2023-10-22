package com.sunq.responsibility;

public class GroupLeader extends Handler {
    @Override
    public void handleRequest(String req) {
        System.out.println("小组长同意");
        next.handleRequest(req);
    }
}
