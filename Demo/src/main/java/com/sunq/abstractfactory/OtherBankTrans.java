package com.sunq.abstractfactory;

public class OtherBankTrans implements ITrans {
    @Override
    public void doTrans() {
        System.out.println("跨行转账");
    }
}
