package com.sunq.abstractfactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        SameBank sameBank = new SameBank(new SameBankFactory());
        sameBank.queryAndTrans();
    }
}
