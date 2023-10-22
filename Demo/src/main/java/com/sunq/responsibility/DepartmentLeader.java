package com.sunq.responsibility;

public class DepartmentLeader extends Handler {
    @Override
    public void handleRequest(String req) {
        System.out.println("部门经理同意");
        next.handleRequest(req);
    }
}
