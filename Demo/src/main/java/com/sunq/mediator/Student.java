package com.sunq.mediator;

public class Student implements Colleague {

    private String name;

    private Mediator mediator;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(Colleague col, String msg) {
        if (col instanceof Teacher) {
            if ("请假".equals(msg)) {
                System.out.println(col.getName() + "老师请假了，这节课上自习");
            } else if ("问题".equals(msg)) {
                System.out.println(col.getName() + "老师考我的问题，我都不会");
            }
        } else if (col instanceof Student) {
            if ("请假".equals(msg)) {
                System.out.println(col.getName() + "请假了，其他学生照常上课");
            } else if ("问题".equals(msg)) {
                System.out.println(col.getName() + "问我问题，我都不会");
            }
        }

    }

    @Override
    public void send(String msg) {
        mediator.relay(this, msg);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
