package com.sunq.factorymethod;

public class FactoryMethodClient {
    public static void main(String[] args) {
        AbstractTransFactory transFactory = new SameBankTransFactory();
        transFactory.trans();
    }
}
