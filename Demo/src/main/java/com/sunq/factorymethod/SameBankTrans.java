package com.sunq.factorymethod;


public class SameBankTrans implements ITrans {
    @Override
    public void doTrans() {
        System.out.println("我是同行");
    }
}
