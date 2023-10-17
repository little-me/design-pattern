package com.sunq.abstractfactory;

public class OtherBankQuery implements IQuery {
    @Override
    public void doQuery() {
        System.out.println("跨行查询");
    }
}
