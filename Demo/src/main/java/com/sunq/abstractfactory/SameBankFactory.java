package com.sunq.abstractfactory;

public class SameBankFactory implements ITransFactory {

    public ITrans getTransImpl() {
        return new SameBankTrans();
    }

    public IQuery getQueryImpl() {
        return new SameBankQuery();
    }
}
