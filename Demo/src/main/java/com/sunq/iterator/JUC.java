package com.sunq.iterator;

import java.util.ArrayList;
import java.util.List;

public class JUC implements Iterator<ScoreItem> {

    private List<ScoreItem> clazzList;

    private java.util.Iterator<ScoreItem> iterator;


    public JUC() {
        clazzList = new ArrayList<>(40);
        clazzList.add(new ScoreItem("线程池-submit和execute方法区别，对RuntimeException和Exception处理区别", 1.50, 4.00));
        clazzList.add(new ScoreItem("线程-线程为Runable状态，一定就是正在运行吗？", 1.00, 1.00));
        clazzList.add(new ScoreItem("线程-内置锁的四个状态：无锁、偏向锁、轻量级锁、重量级锁，有什么区别，以及如何避免轻量级锁自旋过多？", 2.00, 8.00));
        clazzList.add(new ScoreItem("原子类-如何保证对多个基本变量以及引用更新的原子性，如何避免CAS的ABA问题？", 1.00, 2.00));
        // ......
        iterator = clazzList.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public ScoreItem next() {
        return iterator.next();
    }
}
