package com.sunq.memento;

public class MementoClient {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.init();
        // 初始值
        calculator.printValue();
        calculator.someOperation();
        calculator.printValue();
        // 此时按下了M按键，存储当前计算值
        calculator.createMemento();
        calculator.someOperation();
        calculator.printValue();
        // 取出存储的值
        calculator.restoreValue();
        calculator.printValue();
    }
}
