package com.sunq.mediator;

public class Teacher implements Colleague {

    private String name;

    private Mediator mediator;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(Colleague col, String msg) {
        if ("请假".equals(msg)) {
            System.out.println(col.getName() + "请假了，其他学生照常上课");
        } else if ("问题".equals(msg)) {
            System.out.println(col.getName() + "有个的问题，大家看黑板，我给大家讲一下");
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
