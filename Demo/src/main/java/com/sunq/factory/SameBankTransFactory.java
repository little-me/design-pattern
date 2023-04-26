package com.sunq.factory;

public class SameBankTransFactory implements ITransFactory {

    public ITrans getTransImpl() {
        return new SameBankTrans();
    }

    public IQuery getQueryImpl() {
        return new SameBankQuery();
    }
}
