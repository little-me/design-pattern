package com.sunq.mediator;

public class MediatorClient {
    public static void main(String[] args) {
        Mediator m = new Mediator();
        Colleague stu = new Student("小强");
        Colleague teacher = new Teacher("丁瑞才");
        m.register(stu);
        m.register(teacher);
        // 学生请假
        stu.send("请假");
        // 老师请假
        teacher.send("请假");
        // 学生提问
        stu.send("问题");
        // 老师讲题
        teacher.send("问题");
    }
}
