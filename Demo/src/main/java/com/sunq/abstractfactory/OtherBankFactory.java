package com.sunq.abstractfactory;

public class OtherBankFactory implements ITransFactory {

    public ITrans getTransImpl() {
        return new OtherBankTrans();
    }

    public IQuery getQueryImpl() {
        return new OtherBankQuery();
    }
}
