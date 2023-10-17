package com.sunq.abstractfactory;

public class SameBankTrans implements ITrans {
    @Override
    public void doTrans() {
        System.out.println("同行转账");
    }
}
