package com.sunq.interpreter;

public class InterpreterClient {
    public static void main(String[] args) {
        Context context = new Context(600);
        context.showHarm("100 80 125|Q 4");
//        context.showHarm("100 80 125|Q 3");
    }
}
