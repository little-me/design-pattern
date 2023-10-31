package com.sunq.memento;

public class Calculator {

    private int cacheValue;
    private Caretaker caretaker;

    public void init() {
        cacheValue = 0;
        caretaker = new Caretaker();
    }

    public void createMemento() {
        caretaker.saveMemento(new Memento(cacheValue));
    }

    public void restoreValue() {
        cacheValue = caretaker.getMemento().getValue();
    }

    public void someOperation() {
        cacheValue += 1;
    }

    public void printValue() {
        System.out.println("当前的值是：" + cacheValue);
    }
}
