package com.sunq.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> stack = new Stack();

    public Memento getMemento() {
        return stack.pop();
    }

    public void saveMemento(Memento memento) {
        stack.push(memento);
    }
}
