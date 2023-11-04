package com.sunq.iterator;

public class IteratorClient {
    public static void main(String[] args) {
        DesignPattern dp = new DesignPattern();
        double sum = 0;
        while (dp.hasNext()) {
            ScoreItem item = dp.next();
            sum += item.getFactor() * item.getScore();
        }
        JUC juc = new JUC();
        while (juc.hasNext()) {
            ScoreItem item = juc.next();
            sum += item.getFactor() * item.getScore();
        }
        System.out.println("最终总分是：" + sum);
    }
}
