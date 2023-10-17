package com.sunq.factorymethod;


public class OtherBankTrans implements ITrans {
    @Override
    public void doTrans() {
        System.out.println("我是跨行");
    }
}
