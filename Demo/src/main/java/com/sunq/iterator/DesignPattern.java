package com.sunq.iterator;

public class DesignPattern implements Iterator<ScoreItem> {
    private ScoreItem[] itemArr = new ScoreItem[24];

    private int position;

    public DesignPattern() {
        position = 0;
        itemArr[0] = new ScoreItem("工厂方法模式", 1.00, 1.00);
        itemArr[1] = new ScoreItem("抽象工厂模式", 1.00, 1.00);
        itemArr[2] = new ScoreItem("组合模式", 1.00, 1.00);
        itemArr[3] = new ScoreItem("构建者模式", 1.00, 1.00);
        itemArr[4] = new ScoreItem("享元模式", 1.00, 1.00);
        itemArr[5] = new ScoreItem("桥接模式", 1.00, 1.00);
        itemArr[6] = new ScoreItem("装饰者模式", 1.00, 1.00);
        itemArr[7] = new ScoreItem("外观模式", 1.00, 1.00);
        itemArr[8] = new ScoreItem("模板模式", 1.00, 1.00);
        itemArr[9] = new ScoreItem("策略模式", 1.00, 1.00);
        itemArr[10] = new ScoreItem("迭代器模式", 1.00, 1.00);
        itemArr[11] = new ScoreItem("访问者模式", 1.00, 1.00);
        itemArr[12] = new ScoreItem("迭代器模式", 1.00, 1.00);
        itemArr[13] = new ScoreItem("状态模式", 1.00, 1.00);
        itemArr[14] = new ScoreItem("备忘录模式", 1.00, 1.00);
        itemArr[15] = new ScoreItem("职责链模式", 1.00, 1.00);
        itemArr[16] = new ScoreItem("命令模式", 1.00, 1.00);
        itemArr[17] = new ScoreItem("观察者模式", 1.00, 1.00);
        itemArr[18] = new ScoreItem("解释器模式", 1.00, 1.00);
        itemArr[19] = new ScoreItem("单例模式", 1.00, 0.50);
        itemArr[20] = new ScoreItem("适配器模式", 1.00, 1.00);
        itemArr[21] = new ScoreItem("原型模式", 1.00, 1.00);
        itemArr[22] = new ScoreItem("中介者模式", 1.00, 1.00);
        itemArr[23] = new ScoreItem("代理模式", 1.10, 1.00);
    }

    @Override
    public boolean hasNext() {
        return position < 24;
    }

    @Override
    public ScoreItem next() {
        return itemArr[position++];
    }
}
