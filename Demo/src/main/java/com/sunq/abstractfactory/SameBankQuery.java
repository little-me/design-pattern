package com.sunq.abstractfactory;

public class SameBankQuery implements IQuery {
    @Override
    public void doQuery() {
        System.out.println("同行查询");
    }
}
