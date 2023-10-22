package com.sunq.responsibility;

public class ResponsibilityClient {
    public static void main(String[] args) {
        Handler groupLeader = new GroupLeader();
        Handler departmentLeader = new DepartmentLeader();
        Handler chiefLeader = new ChiefLeader();
        groupLeader.setNext(departmentLeader);
        departmentLeader.setNext(chiefLeader);
        groupLeader.handleRequest("小红请假去结婚");
    }
}
